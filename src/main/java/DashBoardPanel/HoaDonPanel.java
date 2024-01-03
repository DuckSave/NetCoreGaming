
package DashBoardPanel;


import utils.HoaDonPrinter;
import DAO.ChiTietHDDAO;
import DAO.HoaDonDAO;



import entity.ChiTietHD;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import utils.ResizableImageLabel;

public class HoaDonPanel extends javax.swing.JPanel {
    private static HoaDonDAO hd = new HoaDonDAO(); 
    private static ChiTietHDDAO cthd = new ChiTietHDDAO();
    private static DefaultTableModel tblModel;     
    public static int MaKH;
    public static int MaHD;
    private static List data = new ArrayList<>();
    private static List<Object[]> chiTietHDList;
    public HoaDonPanel() {
        
        initComponents();
    }
    
    
    



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Pan1 = new javax.swing.JTable();
        txt_MaHD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_SoGC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_NgayChoi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_SDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_Ma1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        giangsinh = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Pan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Sản Phẩm", "Số Lượng ", "Giá"
            }
        ));
        jScrollPane3.setViewportView(tbl_Pan1);

        kGradientPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 220));

        txt_MaHD.setEditable(false);
        txt_MaHD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_MaHD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_MaHD.setText("0");
        txt_MaHD.setOpaque(false);
        txt_MaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaHDActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txt_MaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 117, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Mã HD        :");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 118, -1));

        txt_Username.setEditable(false);
        txt_Username.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_Username.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_Username.setText("0");
        txt_Username.setOpaque(false);
        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 117, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Tên KH       :");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 118, -1));

        txt_SoGC.setEditable(false);
        txt_SoGC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_SoGC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_SoGC.setText("0");
        txt_SoGC.setOpaque(false);
        txt_SoGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoGCActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txt_SoGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 117, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("số giờ chơi :");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 118, -1));

        txt_NgayChoi.setEditable(false);
        txt_NgayChoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_NgayChoi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_NgayChoi.setText("0");
        txt_NgayChoi.setOpaque(false);
        kGradientPanel1.add(txt_NgayChoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 117, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Ngày chơi  :");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 118, -1));

        txt_SDT.setEditable(false);
        txt_SDT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_SDT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_SDT.setText("0");
        txt_SDT.setOpaque(false);
        kGradientPanel1.add(txt_SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 117, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Số ĐT         :");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 118, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel8.setText("HÓA ĐƠN");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btn_Ma1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\printer.png")); // NOI18N
        btn_Ma1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Ma1MouseClicked(evt);
            }
        });
        kGradientPanel1.add(btn_Ma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 510));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 510, 600));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\giangsinh (1).jpg")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout giangsinhLayout = new javax.swing.GroupLayout(giangsinh);
        giangsinh.setLayout(giangsinhLayout);
        giangsinhLayout.setHorizontalGroup(
            giangsinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 380, Short.MAX_VALUE)
        );
        giangsinhLayout.setVerticalGroup(
            giangsinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giangsinhLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(giangsinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 380, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_MaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaHDActionPerformed

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void txt_SoGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoGCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoGCActionPerformed

    private void btn_Ma1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ma1MouseClicked
        PrinterHD();
    }//GEN-LAST:event_btn_Ma1MouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Ma1;
    private com.k33ptoo.components.KGradientPanel giangsinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private static com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private static javax.swing.JTable tbl_Pan1;
    private static javax.swing.JTextField txt_MaHD;
    private static javax.swing.JTextField txt_NgayChoi;
    private static javax.swing.JTextField txt_SDT;
    private static javax.swing.JTextField txt_SoGC;
    private static javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static Date ngay = new Date();
    static String ngaychoi = sdf.format(ngay);
    
   
    
    public static void HoaDon(int MaKH, int MaHD) {

        try {            
            Date curentDate = sdf.parse(ngaychoi);  
            data = hd.selectByMaKHAndCurrentDate(MaKH, curentDate);
            txt_SDT.setText((String) data.get(0));  // Adjust index based on your data
            txt_MaHD.setText(String.valueOf(data.get(1)));
            txt_Username.setText((String) data.get(2));
            txt_SoGC.setText(String.valueOf(data.get(3)));
            txt_NgayChoi.setText(String.valueOf(data.get(5)));
        } catch (ParseException ex) {         
        } catch (SQLException ex) {
            
        }
        
        
        try {    
            Date curentDate = sdf.parse(ngaychoi);
            chiTietHDList = cthd.selectAllHoaDon(MaHD, curentDate);
            tblModel = (DefaultTableModel) tbl_Pan1.getModel(); 
            tblModel.setColumnIdentifiers(new String[]{"Tên SP" , "Số Lượng" , "Đơn Giá"});
            tblModel.setRowCount(0);
            for(Object[] ct : chiTietHDList){                
                tblModel.addRow(ct);
            }
                
 

        } catch (Exception e) {
           
        }

    }
    
    public static void PrinterHD() {
        String[][] chiTietHD = new String[chiTietHDList.size()][];
        for (int i = 0; i < chiTietHDList.size(); i++) {
            Object[] chiTiet = chiTietHDList.get(i);
            chiTietHD[i] = new String[chiTiet.length];

            for (int j = 0; j < chiTiet.length; j++) {
                chiTietHD[i][j] = String.valueOf(chiTiet[j]);
            }
        }

        // In mảng chiTietHD để kiểm tra kết quả
        for (String[] chiTiet : chiTietHD) {
            for (String value : chiTiet) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        String sdt = txt_SDT.getText();
        String maHD = txt_MaHD.getText();
        String userName = txt_Username.getText();
        String soGC = txt_SoGC.getText();
        HoaDonPrinter.inHoaDon(sdt, maHD, userName, soGC, ngaychoi, chiTietHD);
        
        
    }
    
   
}
