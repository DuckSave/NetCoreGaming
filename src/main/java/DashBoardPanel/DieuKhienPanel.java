
package DashBoardPanel;

import DAO.HoaDonDAO;
import entity.DichVu;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import ui.ServerMenuForm;
import utils.ComPuterPanel;
import utils.DynamicArray;
import utils.OpenFrame;
import utils.ProductPanel;
import utils.ServerThread;



public class DieuKhienPanel extends javax.swing.JPanel{

    public static DynamicArray<ServerThread> listClients = utils.Server.clientSockets;
    private static DynamicArray<ComPuterPanel> listComputers = new DynamicArray<>();
    public static List listMaKH;
    public static int MaKH;
    public static int MaHD;

    
    public DieuKhienPanel() {
        initComponents();
        setBackground(new Color(255,204,153));
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(0, 153, 153));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JScrollPane mainPanel;
    // End of variables declaration//GEN-END:variables

    
    public static void addProduct(String imagePath,ServerThread clientPanel) {
        ComPuterPanel cptPanel = new ComPuterPanel(imagePath,clientPanel.getName());
        cptPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    System.out.println("click");
                    for (ServerThread client : listClients) {
                        if (client.getName().equals(clientPanel.getName())) {
                            System.out.println("send api");
                            ServerMenuForm.getMaKHformClient(client);
                            if (MaKH > 0) {
                                HoaDonPanel.HoaDon(MaKH, MaHD);
                                ServerMenuForm.panelSlide1.show(4);
                            }
                        }
                    }
                }
            }
        });
        listComputers.add(cptPanel);
        System.out.println("add success");
    }
    
    
    
    public static void initComputer() {
        listClients = utils.Server.clientSockets;
        System.out.println(listClients);

        JPanel panelContainer = new JPanel(new GridLayout(4, 3, 10, 10));
        panelContainer.setBackground(new Color(255, 204, 135, 0));

        // Thêm ComPuterPanel mới dựa trên phần tử cuối cùng của listClients
        if (!listClients.isEmpty()) {
            String imgPath = "C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\dashboard.png";
            addProduct(imgPath, listClients.get(listClients.size() - 1));
        }

        // Thêm các ComPuterPanel đã có vào panelContainer
        for (ComPuterPanel panel : listComputers) {
            panelContainer.add(panel);
        }

        mainPanel.setVerticalScrollBarPolicy(mainPanel.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainPanel.setHorizontalScrollBarPolicy(mainPanel.HORIZONTAL_SCROLLBAR_NEVER);
        panelContainer.setPreferredSize(new Dimension(mainPanel.getWidth(), 3000));
        mainPanel.getViewport().setOpaque(false);
        mainPanel.setViewportView(panelContainer);
    }


   
}
