/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import DAO.DichVuDAO;
import DAO.TaiKhoanDAO;
import com.google.gson.Gson;
import entity.DichVu;
import entity.TaiKhoan;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import DashBoardPanel.DichVuPanel;
import DashBoardPanel.DieuKhienPanel;
import DashBoardPanel.HoaDonPanel;
import DashBoardPanel.TaiKhoanPanel;
import DashBoardPanel.ThongKePanel;
import DashBoardPanel.ThongKePanel;
import utils.DynamicArray;
import utils.OpenFrame;
import utils.ProductPanel;
import utils.ServerThread;

/**
 *
 * @author duong
 */
public class ServerMenuForm extends javax.swing.JFrame {

    /**
     * Creates new form ServerMenuForm
     */
    public ServerMenuForm() {
        initComponents();
//        setBackground(new Color(0, 0, 0, 0));
        dashboardPanel.setBackground(new Color(0, 0, 0, 0));
        panelSlide1.init(new DieuKhienPanel(),new DichVuPanel(),new TaiKhoanPanel(),new ThongKePanel(), new HoaDonPanel() );
        panelSlide1.setAnimate(11);
        
        utils.Server.startServer();

        
    }
    private DichVuDAO dvdao = new DichVuDAO();
    private List<DichVu> products = dvdao.selectAll();
    private static List<ProductPanel> productPanels;
    private static String API;
    public static ServerThread curentClient;
    private static DynamicArray<ServerThread> listClients = utils.Server.clientSockets;
    private static DynamicArray<JLabel> clientLabels = new DynamicArray<>();
    private int WidthDashBoard = 1024;
    private int HeightDashBoard = 600;
    private JPanel curentDashBoard;
    private JPanel selectDashBoard;
    

    public static void MoMay(){
        API = "MoMay-clientNumber";
        for(ServerThread client : listClients){ 
            if(client == curentClient){
                client.getOut().println(API);
            } 
        }
    }
    
    
    
    public static void sendTaiKhoan(){
        curentClient = listClients.get(listClients.size()-1);
        TaiKhoanDAO tkdao = new TaiKhoanDAO();
        List<TaiKhoan> listAccount = tkdao.selectAll();
        Gson gson = new Gson();
        String API = gson.toJson(listAccount);
        curentClient.getOut().println("sendAccount-"+API);
    }
    
    public static void sendTkForAll(){
        TaiKhoanDAO tkdao = new TaiKhoanDAO();
        List<TaiKhoan> listAccount = tkdao.selectAll();
        Gson gson = new Gson();
        String API = gson.toJson(listAccount);
        for(ServerThread client : listClients){
            client.getOut().println("reload Account-"+API);
        }
    }

        
    public static void sendDichVu(){
        curentClient = listClients.get(listClients.size()-1);
        DichVuDAO dvdao = new DichVuDAO();
        List<DichVu> listDichVu = dvdao.selectAll();
        Gson gson = new Gson();
        String API = gson.toJson(listDichVu);
        curentClient.getOut().println("sendService-"+API);
    }
    
    public static void sendDVForAll(){
        DichVuDAO dvdao = new DichVuDAO();
        List<DichVu> listDichVu = dvdao.selectAll();
        Gson gson = new Gson();
        String API = gson.toJson(listDichVu);
        for(ServerThread client : listClients){
            client.getOut().println("reload services-"+API);
        }
    }
    
    public static void getMaKHformClient(ServerThread curentClient){
        System.out.println(curentClient.getName());
        curentClient.getOut().println("Get MaKH from Client-");
    }
    
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardPanel = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_DieuKhien = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_DichVu = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_TaiKhoan = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ThongKe = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_ThongKe1 = new com.k33ptoo.components.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelSlide1 = new ui.PanelSlide();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardPanel.setkBorderRadius(20);
        dashboardPanel.setkEndColor(new java.awt.Color(0, 153, 153));
        dashboardPanel.setkStartColor(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\lgServer.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(35, 35));
        jLabel1.setMinimumSize(new java.awt.Dimension(35, 35));
        jLabel1.setPreferredSize(new java.awt.Dimension(35, 35));

        jButton1.setText("exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_DieuKhien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_DieuKhien.setkEndColor(new java.awt.Color(204, 255, 204));
        txt_DieuKhien.setkStartColor(new java.awt.Color(0, 153, 153));
        txt_DieuKhien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_DieuKhienMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\dashboard.png")); // NOI18N
        jLabel4.setText("a");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Điều Khiển");

        javax.swing.GroupLayout txt_DieuKhienLayout = new javax.swing.GroupLayout(txt_DieuKhien);
        txt_DieuKhien.setLayout(txt_DieuKhienLayout);
        txt_DieuKhienLayout.setHorizontalGroup(
            txt_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_DieuKhienLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        txt_DieuKhienLayout.setVerticalGroup(
            txt_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        txt_DichVu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_DichVu.setkEndColor(new java.awt.Color(204, 255, 204));
        txt_DichVu.setkStartColor(new java.awt.Color(0, 153, 153));
        txt_DichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_DichVuMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\customer-service.png")); // NOI18N
        jLabel3.setText("a");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Dịch Vụ");

        javax.swing.GroupLayout txt_DichVuLayout = new javax.swing.GroupLayout(txt_DichVu);
        txt_DichVu.setLayout(txt_DichVuLayout);
        txt_DichVuLayout.setHorizontalGroup(
            txt_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_DichVuLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        txt_DichVuLayout.setVerticalGroup(
            txt_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        txt_TaiKhoan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_TaiKhoan.setkEndColor(new java.awt.Color(204, 255, 204));
        txt_TaiKhoan.setkStartColor(new java.awt.Color(0, 153, 153));
        txt_TaiKhoan.setOpaque(false);
        txt_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_TaiKhoanMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\search.png")); // NOI18N
        jLabel5.setText("a");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Tài Khoản");

        javax.swing.GroupLayout txt_TaiKhoanLayout = new javax.swing.GroupLayout(txt_TaiKhoan);
        txt_TaiKhoan.setLayout(txt_TaiKhoanLayout);
        txt_TaiKhoanLayout.setHorizontalGroup(
            txt_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_TaiKhoanLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        txt_TaiKhoanLayout.setVerticalGroup(
            txt_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_TaiKhoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(txt_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)))
        );

        txt_ThongKe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_ThongKe.setkEndColor(new java.awt.Color(204, 255, 204));
        txt_ThongKe.setkStartColor(new java.awt.Color(0, 153, 153));
        txt_ThongKe.setkTransparentControls(false);
        txt_ThongKe.setOpaque(false);
        txt_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ThongKeMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\analytics.png")); // NOI18N
        jLabel7.setText("a");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Thống Kê");

        javax.swing.GroupLayout txt_ThongKeLayout = new javax.swing.GroupLayout(txt_ThongKe);
        txt_ThongKe.setLayout(txt_ThongKeLayout);
        txt_ThongKeLayout.setHorizontalGroup(
            txt_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_ThongKeLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txt_ThongKeLayout.setVerticalGroup(
            txt_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_ThongKeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(txt_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)))
        );

        txt_ThongKe1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_ThongKe1.setkEndColor(new java.awt.Color(204, 255, 204));
        txt_ThongKe1.setkStartColor(new java.awt.Color(0, 153, 153));
        txt_ThongKe1.setkTransparentControls(false);
        txt_ThongKe1.setOpaque(false);
        txt_ThongKe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ThongKe1MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\Bill.png")); // NOI18N
        jLabel11.setText("a");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Hoa Don");

        javax.swing.GroupLayout txt_ThongKe1Layout = new javax.swing.GroupLayout(txt_ThongKe1);
        txt_ThongKe1.setLayout(txt_ThongKe1Layout);
        txt_ThongKe1Layout.setHorizontalGroup(
            txt_ThongKe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_ThongKe1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txt_ThongKe1Layout.setVerticalGroup(
            txt_ThongKe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txt_ThongKe1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(txt_ThongKe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)))
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardPanelLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashboardPanelLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ThongKe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_ThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_DichVu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_DieuKhien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_DichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_ThongKe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 600));
        dashboardPanel.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout panelSlide1Layout = new javax.swing.GroupLayout(panelSlide1);
        panelSlide1.setLayout(panelSlide1Layout);
        panelSlide1Layout.setHorizontalGroup(
            panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        panelSlide1Layout.setVerticalGroup(
            panelSlide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(panelSlide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_DieuKhienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DieuKhienMouseClicked

        panelSlide1.show(0);
    }//GEN-LAST:event_txt_DieuKhienMouseClicked

    private void txt_DichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DichVuMouseClicked
        panelSlide1.show(1);

    }//GEN-LAST:event_txt_DichVuMouseClicked

    private void txt_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TaiKhoanMouseClicked
        panelSlide1.show(2);
    }//GEN-LAST:event_txt_TaiKhoanMouseClicked

    private void txt_ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ThongKeMouseClicked
        panelSlide1.show(3);
    }//GEN-LAST:event_txt_ThongKeMouseClicked

    private void txt_ThongKe1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ThongKe1MouseClicked
         panelSlide1.show(4);
    }//GEN-LAST:event_txt_ThongKe1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServerMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           
                OpenFrame.OpenServerMenuForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel dashboardPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static ui.PanelSlide panelSlide1;
    private com.k33ptoo.components.KGradientPanel txt_DichVu;
    private com.k33ptoo.components.KGradientPanel txt_DieuKhien;
    private com.k33ptoo.components.KGradientPanel txt_TaiKhoan;
    private com.k33ptoo.components.KGradientPanel txt_ThongKe;
    private com.k33ptoo.components.KGradientPanel txt_ThongKe1;
    // End of variables declaration//GEN-END:variables
}
