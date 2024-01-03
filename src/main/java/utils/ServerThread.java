/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


/**
 *
 * @author duong
 */
public class ServerThread {
    private static Socket socket;
    private static int numberClient;
    private static boolean isClosed;
    private static PrintWriter out;
    private static BufferedReader in;
        

    public ServerThread(Socket socket,int numberClient) {
        this.socket = socket;
        this.numberClient = numberClient;
        this.isClosed = false;
    }

    public ServerThread(Socket socket) {
        this.socket = socket;
        this.isClosed = false;
        
    }
    
    public static ServerThread createServerThread(Socket socket, int numberClient) {
        return new ServerThread(socket, numberClient);
    }
    
        

    public BufferedReader getIn() {
        return in;
    }

    public PrintWriter getOut() {
        return out;
    }

    

    public void shutDown() throws IOException{
        Server.clientSockets.removeAt(numberClient);
        in.close();
        out.close();
        socket.close();  
    }
        
        
        public void initSocket(){
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                sendMessage("client connected");
            } catch (Exception e) {
            }
        }

        public Socket getSocket() {
            return socket;
        }

        public void setSocket(Socket socket) {
            this.socket = socket;
        }

        public int getNumberClient() {
            return numberClient;
        }

        public void setNumberClient(int numberClient) {
            this.numberClient = numberClient;
        }

        
        public void sendMessage(String message) {
            out.println(message);
        }
        
        public String getName(){
            return socket.getRemoteSocketAddress().toString();
        }
        
}
