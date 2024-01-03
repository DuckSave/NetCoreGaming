    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
package utils;
import DAO.HoaDonDAO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import DashBoardPanel.DieuKhienPanel;
import DashBoardPanel.HoaDonPanel;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author duong
 */
public class Server {
    private static ServerSocket serverSocket;
    private static Socket socket;
    public static int idSocket = 0;
    public static String clientName ;
    public static PrintWriter out;
    public static BufferedReader in;
    public static DynamicArray<ServerThread> clientSockets = new DynamicArray<>();
    public static DynamicArray<Thread> receiveThreads = new DynamicArray<>();
    private static HoaDonDAO hddao = new HoaDonDAO();
    private static Set<Socket> connectedClients = new HashSet<>();
    private static int MaKH;
    private static int MaHD;
    
    public static void startServer() {
        try {
            serverSocket = new ServerSocket(12344);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Thread initServer = new Thread(() -> {
            try {
                while (true) {
                    socket = serverSocket.accept();
                    ServerThread clientSocket = ServerThread.createServerThread(socket, idSocket++);

                    synchronized (clientSockets) {
                        clientSockets.add(clientSocket);
                    }

                    startReceiveThread(clientSocket);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        initServer.start();
    }

    private static void startReceiveThread(ServerThread clientSocket) {
        Thread receiveThread = new Thread(() -> {
            try {
                clientSocket.initSocket();
                while (true) {
                    String API = clientSocket.getIn().readLine();
                    while (API != null) {
                        String[] message = API.split("-", 2);
                        if (message.length == 2) {
                            String typeAPI = message[0];
                            String data = message[1];
                            handleApi(typeAPI, data);
                            // Break out of the loop after processing the message
                            break;
                        }
                        if (message.length == 1) {
                            String typeAPI = message[0];
                            handleApi(typeAPI, "");
                            // Break out of the loop after processing the message
                            break;
                        }

                        // Read the next line
                        API = clientSocket.getIn().readLine();
                    }
                }
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        });

        synchronized (receiveThreads) {
            receiveThreads.add(receiveThread);
        }

        receiveThread.start();
    }

   

    private static void handleApi(String TypeAPI, String data) throws ParseException {
        switch(TypeAPI){
            case "MoMay":
                ui.ServerMenuForm.MoMay();
                break;
            case "client connected":
                ui.ServerMenuForm.sendTaiKhoan();
                ui.ServerMenuForm.sendDichVu();  
                DieuKhienPanel.initComputer();                
                break;
            case "reQuestService":
                utils.reciveServices.processJsonData(data);       
                break;
            case "create new HoaDon":
                utils.createNewHD.processJsonData(data);
                break;
            case "last update HoaDon":
                utils.lastUpdateHD.processJsonData(data);
                HoaDonPanel.PrinterHD();
                
                break;
            case "last update TaiKhoan":
                utils.lastUpdateTaiKhoan.processJsonData(data);
                DashBoardPanel.TaiKhoanPanel.fillTable();
                break;
            case "return MaKH":
                MaKH = Integer.parseInt(data);
                String sql = "SELECT MAX(MaHD) FROM HoaDon WHERE MaKH = ? AND NgayChoi = ?";
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date ngay = new Date();
                String ngaychoi = sdf.format(ngay);
                Date curentDate = sdf.parse(ngaychoi);
                if(MaKH > 0) {
                    DieuKhienPanel.MaKH = MaKH;
                    MaHD = hddao.selectSingleIntValue(sql,MaKH,curentDate);
                    DieuKhienPanel.MaHD = MaHD;               
                };
            break;    
                
        }
    }
       
}
