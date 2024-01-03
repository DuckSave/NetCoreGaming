/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uiclient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
public class UIindex extends javax.swing.JFrame {
    private Timer timerDichVu;
    private Timer timerDieuKhien;
    private Timer timerTaiKhoan;
    private int currentWidthDichVu;
    private int currentWidthDieuKhien;
    private int currentWidthTaiKhoan;
    private final int targetWidth = 900; // Sửa giá trị này để bằng chiều ngang của pan_Form
    private final int formWidth = 860;
    public UIindex() {
        initComponents();
        initializeTimers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_DichVu = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_DieuKhien = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_TaiKhoan = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pan_DieuKhien = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pan_DichVu = new javax.swing.JPanel();
        Pan_1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_TenSP = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_GiaSP = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_ThemSP = new javax.swing.JButton();
        btn_XoaSP = new javax.swing.JButton();
        btn_SuaSP = new javax.swing.JButton();
        btn_MoiSP = new javax.swing.JButton();
        pan_TaiKhoan = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Pan1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_TiemKiem = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txt_STD = new javax.swing.JTextField();
        txt_TenTK = new javax.swing.JTextField();
        txt_MK = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txt_ThoiGianChoi = new javax.swing.JTextField();
        txt_NapTien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_updateGia = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btn_ThemTK = new javax.swing.JButton();
        btn_XoaTk = new javax.swing.JButton();
        btn_SuaTK = new javax.swing.JButton();
        btn_MoiTK = new javax.swing.JButton();
        pan_Form = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(27, 41, 54));
        kGradientPanel1.setkStartColor(new java.awt.Color(26, 39, 52));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackGo.png"))); // NOI18N

        txt_DichVu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_DichVu.setkEndColor(new java.awt.Color(203, 27, 29));
        txt_DichVu.setkStartColor(new java.awt.Color(251, 253, 238));
        txt_DichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_DichVuMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer-service.png"))); // NOI18N
        jLabel3.setText("a");

        jLabel6.setText("Dịch Vụ");

        javax.swing.GroupLayout txt_DichVuLayout = new javax.swing.GroupLayout(txt_DichVu);
        txt_DichVu.setLayout(txt_DichVuLayout);
        txt_DichVuLayout.setHorizontalGroup(
            txt_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_DichVuLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        txt_DichVuLayout.setVerticalGroup(
            txt_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        txt_DieuKhien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_DieuKhien.setkEndColor(new java.awt.Color(164, 44, 45));
        txt_DieuKhien.setkStartColor(new java.awt.Color(245, 242, 242));
        txt_DieuKhien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_DieuKhienMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dashboard.png"))); // NOI18N
        jLabel4.setText("a");

        javax.swing.GroupLayout txt_DieuKhienLayout = new javax.swing.GroupLayout(txt_DieuKhien);
        txt_DieuKhien.setLayout(txt_DieuKhienLayout);
        txt_DieuKhienLayout.setHorizontalGroup(
            txt_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_DieuKhienLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 168, Short.MAX_VALUE))
        );
        txt_DieuKhienLayout.setVerticalGroup(
            txt_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txt_TaiKhoan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_TaiKhoan.setkEndColor(new java.awt.Color(240, 144, 28));
        txt_TaiKhoan.setkStartColor(new java.awt.Color(251, 253, 238));
        txt_TaiKhoan.setOpaque(false);
        txt_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_TaiKhoanMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        jLabel5.setText("a");

        jLabel7.setText("Tài Khoản ");

        javax.swing.GroupLayout txt_TaiKhoanLayout = new javax.swing.GroupLayout(txt_TaiKhoan);
        txt_TaiKhoan.setLayout(txt_TaiKhoanLayout);
        txt_TaiKhoanLayout.setHorizontalGroup(
            txt_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_TaiKhoanLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        txt_TaiKhoanLayout.setVerticalGroup(
            txt_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jLabel2.setText("Điều Khiển ");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txt_DieuKhien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(txt_DichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(txt_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pan_DieuKhien.setBackground(new java.awt.Color(255, 153, 51));
        pan_DieuKhien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 246, 241));
        jPanel4.setLayout(new java.awt.GridLayout(4, 4));
        pan_DieuKhien.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 580));

        getContentPane().add(pan_DieuKhien, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 10, 602));

        pan_DichVu.setBackground(new java.awt.Color(255, 246, 241));
        pan_DichVu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pan_1.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout Pan_1Layout = new javax.swing.GroupLayout(Pan_1);
        Pan_1.setLayout(Pan_1Layout);
        Pan_1Layout.setHorizontalGroup(
            Pan_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        Pan_1Layout.setVerticalGroup(
            Pan_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pan_DichVu.add(Pan_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, 600));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 141, 121));

        jScrollPane1.setViewportView(txt_TenSP);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 141, -1));

        jScrollPane2.setViewportView(txt_GiaSP);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 141, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hình ảnh ");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 143, 121));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tên");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 151, 131, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("giá ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, 143, 22));

        pan_DichVu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 390, 220));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4));

        btn_ThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-button.png"))); // NOI18N
        btn_ThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemSPActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ThemSP);

        btn_XoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jPanel2.add(btn_XoaSP);

        btn_SuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/repair.png"))); // NOI18N
        jPanel2.add(btn_SuaSP);

        btn_MoiSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jPanel2.add(btn_MoiSP);

        pan_DichVu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 251, 390, 80));

        getContentPane().add(pan_DichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 10, 602));

        pan_TaiKhoan.setBackground(new java.awt.Color(255, 102, 102));
        pan_TaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Pan1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_Pan1);

        pan_TaiKhoan.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, 503, 530));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("tìm kiếm ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TiemKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txt_TiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pan_TaiKhoan.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 503, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("SERVER");

        jRadioButton2.setText("CLIENT");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
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
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NapTien, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ThoiGianChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_MK, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txt_TenTK)
                            .addComponent(txt_STD))))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_STD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NapTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ThoiGianChoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(47, 47, 47))
        );

        pan_TaiKhoan.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 280, 270));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setText("Cập nhật giá ");

        txt_updateGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updateGiaActionPerformed(evt);
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
                .addComponent(txt_updateGia, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txt_updateGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pan_TaiKhoan.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 280, 40));

        jPanel8.setBackground(new java.awt.Color(255, 204, 153));
        jPanel8.setForeground(new java.awt.Color(255, 153, 153));
        jPanel8.setLayout(new java.awt.GridLayout(1, 4, 1, 1));

        btn_ThemTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-button.png"))); // NOI18N
        btn_ThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemTKActionPerformed(evt);
            }
        });
        jPanel8.add(btn_ThemTK);

        btn_XoaTk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jPanel8.add(btn_XoaTk);

        btn_SuaTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/repair.png"))); // NOI18N
        jPanel8.add(btn_SuaTK);

        btn_MoiTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jPanel8.add(btn_MoiTK);

        pan_TaiKhoan.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 341, 280, 70));

        getContentPane().add(pan_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 10, 600));

        javax.swing.GroupLayout pan_FormLayout = new javax.swing.GroupLayout(pan_Form);
        pan_Form.setLayout(pan_FormLayout);
        pan_FormLayout.setHorizontalGroup(
            pan_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        pan_FormLayout.setVerticalGroup(
            pan_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(pan_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 850, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DichVuMouseClicked
        closeAllPanelsExcept(pan_DichVu);
        
    }//GEN-LAST:event_txt_DichVuMouseClicked

    private void txt_DieuKhienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DieuKhienMouseClicked

        closeAllPanelsExcept(pan_DieuKhien);
    }//GEN-LAST:event_txt_DieuKhienMouseClicked

    private void txt_TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TaiKhoanMouseClicked
        closeAllPanelsExcept(pan_TaiKhoan);
    }//GEN-LAST:event_txt_TaiKhoanMouseClicked

    private void btn_ThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThemSPActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txt_updateGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updateGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_updateGiaActionPerformed

    private void btn_ThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThemTKActionPerformed

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
            java.util.logging.Logger.getLogger(UIindex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIindex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIindex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIindex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIindex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pan_1;
    private javax.swing.JButton btn_MoiSP;
    private javax.swing.JButton btn_MoiTK;
    private javax.swing.JButton btn_SuaSP;
    private javax.swing.JButton btn_SuaTK;
    private javax.swing.JButton btn_ThemSP;
    private javax.swing.JButton btn_ThemTK;
    private javax.swing.JButton btn_XoaSP;
    private javax.swing.JButton btn_XoaTk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel pan_DichVu;
    private javax.swing.JPanel pan_DieuKhien;
    private javax.swing.JPanel pan_Form;
    private javax.swing.JPanel pan_TaiKhoan;
    private javax.swing.JTable tbl_Pan1;
    private com.k33ptoo.components.KGradientPanel txt_DichVu;
    private com.k33ptoo.components.KGradientPanel txt_DieuKhien;
    private javax.swing.JTextPane txt_GiaSP;
    private javax.swing.JTextField txt_MK;
    private javax.swing.JTextField txt_NapTien;
    private javax.swing.JTextField txt_STD;
    private com.k33ptoo.components.KGradientPanel txt_TaiKhoan;
    private javax.swing.JTextPane txt_TenSP;
    private javax.swing.JTextField txt_TenTK;
    private javax.swing.JTextField txt_ThoiGianChoi;
    private javax.swing.JTextField txt_TiemKiem;
    private javax.swing.JTextField txt_updateGia;
    // End of variables declaration//GEN-END:variables

    
    private void initializeTimers() {
        currentWidthDichVu = 0;
        currentWidthDieuKhien = 0;
        currentWidthTaiKhoan = 0;

        int delay = 7; // Đặt độ trễ giữa mỗi tick của timer (điều chỉnh nếu cần)

        timerDichVu = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentWidthDichVu < targetWidth && currentWidthDichVu < formWidth) {
                    currentWidthDichVu += 10; // Điều chỉnh kích thước mỗi bước nếu cần
                    pan_DichVu.setSize(currentWidthDichVu, pan_DichVu.getHeight());
                } else {
                    timerDichVu.stop();
                }
            }
        });

        timerDieuKhien = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentWidthDieuKhien < targetWidth && currentWidthDieuKhien < formWidth) {
                    currentWidthDieuKhien += 10; // Điều chỉnh kích thước mỗi bước nếu cần
                    pan_DieuKhien.setSize(currentWidthDieuKhien, pan_DieuKhien.getHeight());
                } else {
                    timerDieuKhien.stop();
                }
            }
        });

        timerTaiKhoan = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentWidthTaiKhoan < targetWidth && currentWidthTaiKhoan < formWidth) {
                    currentWidthTaiKhoan += 10; // Điều chỉnh kích thước mỗi bước nếu cần
                    pan_TaiKhoan.setSize(currentWidthTaiKhoan, pan_TaiKhoan.getHeight());
                } else {
                    timerTaiKhoan.stop();
                }
            }
        });
    }
private void closeAllPanelsExcept(JPanel selectedPanel) {
    timerDichVu.stop();
    timerDieuKhien.stop();
    timerTaiKhoan.stop();

    currentWidthDichVu = 0;
    currentWidthDieuKhien = 0;
    currentWidthTaiKhoan = 0;

    pan_DichVu.setSize(currentWidthDichVu, pan_DichVu.getHeight());
    pan_DieuKhien.setSize(currentWidthDieuKhien, pan_DieuKhien.getHeight());
    pan_TaiKhoan.setSize(currentWidthTaiKhoan, pan_TaiKhoan.getHeight());

    if (selectedPanel == pan_DichVu) {
        timerDichVu.start();
    } else if (selectedPanel == pan_DieuKhien) {
        timerDieuKhien.start();
    } else if (selectedPanel == pan_TaiKhoan) {
        timerTaiKhoan.start();
    }
}
    private void openDichVu() {
        timerDieuKhien.stop();
        timerTaiKhoan.stop();
        timerDichVu.start();
    }

    private void openDieuKhien() {
        timerDichVu.stop();
        timerTaiKhoan.stop();
        timerDieuKhien.start();
    }

    private void openTaiKhoan() {
        timerDichVu.stop();
        timerDieuKhien.stop();
        timerTaiKhoan.start();
    }
}
