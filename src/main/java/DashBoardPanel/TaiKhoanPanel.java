
package DashBoardPanel;


import DAO.ChiTietHDDAO;
import DAO.HoaDonDAO;
import DAO.TaiKhoanDAO;
import DAO.TaiSanDAO;
import entity.ChiTietHD;
import entity.DichVu;
import entity.HoaDon;
import entity.TaiKhoan;
import entity.TaiSan;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import ui.ServerMenuForm;
import static ui.ServerMenuForm.sendTaiKhoan;
import static ui.ServerMenuForm.sendTkForAll;
import utils.MsgBox;


public class TaiKhoanPanel extends javax.swing.JPanel {

    private static TaiKhoanDAO tkdao = new TaiKhoanDAO();
    private static TaiSanDAO tsdao = new TaiSanDAO();
    private static ChiTietHDDAO cthddao = new ChiTietHDDAO();
    private static DefaultTableModel tblModel;
    private static List<TaiKhoan> listTaiKhoan = new ArrayList<>();
    
    
    
    public TaiKhoanPanel() {
        initComponents();
        initTB();
        fillTable();
    }
    
    private int index = -1;
    private int curentID;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_TaiKhoan = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txt_searchBar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_SDT = new javax.swing.JTextField();
        txt_TenTK = new javax.swing.JTextField();
        txt_MK = new javax.swing.JTextField();
        rdo_Server = new javax.swing.JRadioButton();
        rdo_Client = new javax.swing.JRadioButton();
        txt_ThoiGianChoi = new javax.swing.JTextField();
        txt_NapTien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_updatePrice = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btn_ThemTK = new javax.swing.JButton();
        btn_XoaTk = new javax.swing.JButton();
        btn_SuaTK = new javax.swing.JButton();
        btn_MoiTK = new javax.swing.JButton();
        bttn_NapTien = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        tbl_TaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbl_TaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã ", "số ĐT", "tên TK ", "Mật Khẩu ", "vai Trò ", "Thời gian choi"
            }
        ));
        tbl_TaiKhoan.setRowHeight(25);
        tbl_TaiKhoan.setRowMargin(3);
        tbl_TaiKhoan.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tbl_TaiKhoan.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tbl_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TaiKhoanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_TaiKhoan);

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));

        txt_searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchBarKeyReleased(evt);
            }
        });

        jLabel12.setText("tìm kiếm ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_searchBar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 102));

        buttonGroup1.add(rdo_Server);
        rdo_Server.setText("SERVER");

        buttonGroup1.add(rdo_Client);
        rdo_Client.setText("CLIENT");
        rdo_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_ClientActionPerformed(evt);
            }
        });

        txt_NapTien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NapTienKeyReleased(evt);
            }
        });

        jLabel13.setText("Số điện thoại ");

        jLabel14.setText("tên TK");

        jLabel15.setText("Mật khẩu ");

        jLabel16.setText("Nạp tiền ");

        jLabel17.setText("thời gian chơi ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_MK, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txt_TenTK)
                            .addComponent(txt_SDT)
                            .addComponent(txt_NapTien)
                            .addComponent(txt_ThoiGianChoi)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rdo_Server, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(rdo_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_NapTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_ThoiGianChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdo_Server)
                    .addComponent(rdo_Client))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 102));

        jLabel18.setText("Cập nhật giá ");

        txt_updatePrice.setText("5000");
        txt_updatePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updatePriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_updatePrice)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_updatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 153));
        jPanel8.setForeground(new java.awt.Color(255, 153, 153));
        jPanel8.setLayout(new java.awt.GridLayout(1, 4, 1, 1));

        btn_ThemTK.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\add-button.png")); // NOI18N
        btn_ThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemTKActionPerformed(evt);
            }
        });
        jPanel8.add(btn_ThemTK);

        btn_XoaTk.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\delete.png")); // NOI18N
        btn_XoaTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTkActionPerformed(evt);
            }
        });
        jPanel8.add(btn_XoaTk);

        btn_SuaTK.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\repair.png")); // NOI18N
        btn_SuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaTKActionPerformed(evt);
            }
        });
        jPanel8.add(btn_SuaTK);

        btn_MoiTK.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\reset.png")); // NOI18N
        btn_MoiTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MoiTKActionPerformed(evt);
            }
        });
        jPanel8.add(btn_MoiTK);

        bttn_NapTien.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\money.png")); // NOI18N
        bttn_NapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_NapTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttn_NapTien, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(553, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttn_NapTien)
                        .addGap(64, 64, 64))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(398, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdo_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_ClientActionPerformed
        
    }//GEN-LAST:event_rdo_ClientActionPerformed

    private void txt_updatePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updatePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_updatePriceActionPerformed

    private void btn_ThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemTKActionPerformed
        insertAccount();
        sendTkForAll();
        clearForm();
    }//GEN-LAST:event_btn_ThemTKActionPerformed

    private void btn_MoiTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MoiTKActionPerformed
        clearForm();
        
    }//GEN-LAST:event_btn_MoiTKActionPerformed

    private void btn_XoaTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTkActionPerformed
        deleteAccount();
        sendTkForAll();
        clearForm();
    }//GEN-LAST:event_btn_XoaTkActionPerformed

    private void btn_SuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaTKActionPerformed
        updateAccount();
        sendTkForAll();
    }//GEN-LAST:event_btn_SuaTKActionPerformed

    private void tbl_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TaiKhoanMouseClicked
        
        if (evt.getClickCount() == 1) {
            index = tbl_TaiKhoan.getSelectedRow();
            
            System.out.println(index);
            edit();
        }
    }//GEN-LAST:event_tbl_TaiKhoanMouseClicked

    private void bttn_NapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_NapTienActionPerformed
        NapTien();
        LichSuNapTien();
        sendTkForAll();
        clearForm();
    }//GEN-LAST:event_bttn_NapTienActionPerformed

    private void txt_NapTienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NapTienKeyReleased
        NhapTien();
    }//GEN-LAST:event_txt_NapTienKeyReleased

    private void txt_searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchBarKeyReleased
        search();
    }//GEN-LAST:event_txt_searchBarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MoiTK;
    private javax.swing.JButton btn_SuaTK;
    private javax.swing.JButton btn_ThemTK;
    private javax.swing.JButton btn_XoaTk;
    private javax.swing.JButton bttn_NapTien;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdo_Client;
    private javax.swing.JRadioButton rdo_Server;
    private javax.swing.JTable tbl_TaiKhoan;
    private javax.swing.JTextField txt_MK;
    private javax.swing.JTextField txt_NapTien;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenTK;
    private javax.swing.JTextField txt_ThoiGianChoi;
    private javax.swing.JTextField txt_searchBar;
    private javax.swing.JTextField txt_updatePrice;
    // End of variables declaration//GEN-END:variables

    private void initTB(){
        tblModel = (DefaultTableModel) tbl_TaiKhoan.getModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã KH", "SDT", "Tên TK","Mật Khẩu","Vai Trò","Thời Gian Chơi"});
        index = -1;
        
    }
    
    public static void fillTable() {
        listTaiKhoan = tkdao.selectAll();
        tblModel.setRowCount(0);
        for (TaiKhoan tk : listTaiKhoan) {
            tblModel.addRow(new Object[]{tk.getMaKH(),tk.getSDT(),tk.getUserName(),tk.getPassword(),tk.isRole(),tk.getSoGioChoi()});
        }
    }
    
    private TaiKhoan readForm(){
        String sdt = txt_SDT.getText();
        String taiKhoan = txt_TenTK.getText().trim();
        String matKhau = txt_MK.getText().trim();
        boolean vaitro ;
        String tg = txt_ThoiGianChoi.getText();
        String[] sttg = tg.split(":",3);
        int newTG = Integer.parseInt(sttg[0]) * 60 + Integer.parseInt(sttg[1]);
        if(rdo_Server.isSelected()){
            vaitro = true;
        }else{
            vaitro = false;
        }
        return new TaiKhoan(sdt, taiKhoan, matKhau, vaitro, newTG);
    }
    
    private void writeForm(TaiKhoan tk){
        txt_SDT.setText(tk.getSDT());
        txt_TenTK.setText(tk.getUserName());
        txt_MK.setText(tk.getPassword());
        txt_ThoiGianChoi.setText(String.valueOf(tk.getSoGioChoi()));
        
       
    }
    
    private void clearForm(){
        index = -1;
        txt_TenTK.setText("");
        txt_MK.setText("");
        txt_SDT.setText("");
        txt_NapTien.setText("");
        txt_ThoiGianChoi.setText("");
        txt_NapTien.setText("");
        txt_searchBar.setText("");        
    }
    
    private void insertAccount(){

            if(IsValidate()){
                tkdao.insert(readForm());
                fillTable();
            }
            else{
                MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin");
            }
   
    }
    
    private void updateAccount(){

        if(isValidate()){          
            TaiKhoan tkupdate = new TaiKhoan(txt_SDT.getText(),txt_TenTK.getText(),txt_MK.getText());
            tkupdate.setMaKH(curentID);
            tkdao.updateTK(tkupdate);
            fillTable();
            
        }
    }
    
    private void deleteAccount(){
        TaiKhoan crAC = tkdao.selectAccount(txt_TenTK.getText());
        if(crAC != null){
            int id = crAC.getMaKH();
            tkdao.deleteIntID(id);
            fillTable();
        }else{
            MsgBox.alert(this, "Vui lòng chọn tài khoản");
        }
    }

    
    private boolean isValidate(){
        
        if(txt_TenTK.getText() == "") return false;
        if(txt_MK.getText() == "") return false;
        if(txt_ThoiGianChoi.getText() == "") return false;
        if(txt_SDT.getText() == "") return false;

        return true;
    }
    
    void edit() {
        curentID = (int) tbl_TaiKhoan.getValueAt(index, 0);
        TaiKhoan tk = tkdao.selectByIntID(curentID);
        writeForm(tk);

    }
    
    private void LichSuNapTien(){
        
        TaiKhoan tk = tkdao.selectAccount(txt_TenTK.getText());
        int MaKH = tk.getMaKH();
        int SoTN = Integer.parseInt(txt_NapTien.getText());
        Date ngay = new Date();
        
       TaiSan taisan = new TaiSan(MaKH, SoTN, ngay);
       tsdao.insert(taisan);
    }
    
    private void NhapTien() {
        try {
            int giaChoi = Integer.parseInt(txt_updatePrice.getText());
            long soTien = Integer.parseInt(txt_NapTien.getText());

            // Tính số giờ, phút, giây dựa trên quy đổi 5000 bằng 1 giờ
            int soGioChoi = (int) (soTien / giaChoi);
            int soPhutChoi = (int) ((soTien % giaChoi) * 60 / giaChoi);
            int soGiayChoi = (int) (((soTien % giaChoi) * 60 % giaChoi) * 60 / giaChoi);

            // Hiển thị số giờ, phút, giây vào lbl_GioChoi
            txt_ThoiGianChoi.setText(String.format("%02d:%02d:%02d", soGioChoi, soPhutChoi, soGiayChoi));
        } catch (NumberFormatException e) {

            txt_ThoiGianChoi.setText("00:00:00");
        }
    }
    
    private void NapTien(){
        if(IsValidate()){
            TaiKhoan tk = tkdao.selectAccount(txt_TenTK.getText());
            int tgcu = tk.getSoGioChoi();
            String tg = txt_ThoiGianChoi.getText();
            String[] sttg = tg.split(":",3);
            int newTG = Integer.parseInt(sttg[0]) * 60 + Integer.parseInt(sttg[1]) + tgcu;
            TaiKhoan naptien = new TaiKhoan(tk.getMaKH(), newTG);
            tkdao.NapTien(naptien);
        fillTable();
        }
    }
  
    private boolean IsValidate(){
        if(txt_TenTK.getText().equals("")) return false;
        if(txt_MK.getText().equals("")) return false;
        if(txt_SDT.getText().equals("")) return false;
        if(txt_ThoiGianChoi.getText().equals("")) return false;
        if(txt_ThoiGianChoi.getText().equals("")) return false;
        return true;
    }
    
    private void search(){
        if(txt_searchBar.getText().equals("")){
            fillTable();
        }else{
            TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
            List<TaiKhoan> searchResults = taiKhoanDAO.search(txt_searchBar.getText());
            tblModel.setRowCount(0);
            for (TaiKhoan tk : searchResults) {
                tblModel.addRow(new Object[]{tk.getMaKH(),tk.getSDT(),tk.getUserName(),tk.getPassword(),tk.isRole(),tk.getSoGioChoi()});
            }
        }
    }
    
}
