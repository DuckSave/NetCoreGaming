/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DashBoardPanel;

import DAO.ChiTietHDDAO;
import java.awt.BorderLayout;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import static uiclient.TKePanel.ceb_TienNap;
import static uiclient.TKePanel.cek_DichVu;
import static uiclient.TKePanel.jPanel2;
import static uiclient.TKePanel.lbl_Tong;
import static uiclient.TKePanel.txt_Ngay1;
import static uiclient.TKePanel.txt_Ngay2;

/**
 *
 * @author duong
 */
public class ThongKePanel extends javax.swing.JPanel {
    private ChiTietHDDAO hddao = new ChiTietHDDAO();
    private JFreeChart barChart;
    
    public ThongKePanel() {
        initComponents();
        barChart = createBarChart();
        // Create a ChartPanel and add it to the jPanel2
        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(chartPanel, BorderLayout.CENTER);
        jPanel2.validate();  //
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cek_DichVu = new javax.swing.JCheckBox();
        ceb_TienNap = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txt_Ngay1 = new com.toedter.calendar.JDateChooser();
        txt_Ngay2 = new com.toedter.calendar.JDateChooser();
        btn_ThongKe = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Pan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lbl_Tong = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        kGradientPanel1.setkEndColor(new java.awt.Color(67, 192, 157));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\lgServer.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("THỐNG KÊ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText("Loại thống kê");

        cek_DichVu.setText("Dịch vụ ");
        cek_DichVu.setOpaque(false);
        cek_DichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cek_DichVuActionPerformed(evt);
            }
        });

        ceb_TienNap.setText("Tiền Nạp ");
        ceb_TienNap.setOpaque(false);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Chọn Tất Cả ");

        txt_Ngay1.setBackground(new java.awt.Color(255, 255, 255));
        txt_Ngay1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TỪ NGÀY", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        txt_Ngay1.setOpaque(false);

        txt_Ngay2.setBackground(new java.awt.Color(255, 255, 255));
        txt_Ngay2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TỪ NGÀY", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        txt_Ngay2.setOpaque(false);

        btn_ThongKe.setText("THỐNG KÊ");
        btn_ThongKe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_ThongKe.setkEndColor(new java.awt.Color(0, 102, 102));
        btn_ThongKe.setkStartColor(new java.awt.Color(102, 102, 102));
        btn_ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cek_DichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ceb_TienNap, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Ngay1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(txt_Ngay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txt_Ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cek_DichVu)
                .addGap(18, 18, 18)
                .addComponent(ceb_TienNap)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setText("Kết Quả Thống Kê");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 231, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 660, 370));

        tbl_Pan.setBackground(new java.awt.Color(0, 153, 153));
        tbl_Pan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tbl_Pan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày Thống Kê", "Doanh Thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Pan);
        if (tbl_Pan.getColumnModel().getColumnCount() > 0) {
            tbl_Pan.getColumnModel().getColumn(0).setResizable(false);
            tbl_Pan.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 660, 120));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setText("Tổng ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        lbl_Tong.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_Tong.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Tong.setText("0");
        jPanel1.add(lbl_Tong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 185, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cek_DichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cek_DichVuActionPerformed

    }//GEN-LAST:event_cek_DichVuActionPerformed

    private void btn_ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongKeActionPerformed
        ThongKe();
    }//GEN-LAST:event_btn_ThongKeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_ThongKe;
    public static javax.swing.JCheckBox ceb_TienNap;
    public static javax.swing.JCheckBox cek_DichVu;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    public static javax.swing.JLabel lbl_Tong;
    private javax.swing.JTable tbl_Pan;
    public static com.toedter.calendar.JDateChooser txt_Ngay1;
    public static com.toedter.calendar.JDateChooser txt_Ngay2;
    // End of variables declaration//GEN-END:variables
    public void ThongKe() {
        Date startDate = txt_Ngay1.getDate();
        Date endDate = txt_Ngay2.getDate();
        String typeLoai = "";
        if(cek_DichVu.isSelected() && ceb_TienNap.isSelected()){
            typeLoai = "Tong";
        } else {
            if (cek_DichVu.isSelected()) {
                typeLoai = "DichVu";
            } else if (ceb_TienNap.isSelected()) {
                typeLoai = "TienNap";
            } else { 
                typeLoai = "Tong" ; 
                cek_DichVu.setSelected(true);
                ceb_TienNap.setSelected(true);
            }            
        }

        

        switch (typeLoai) {
            case "DichVu":
                TinhThongKeDichVu(startDate, endDate);
                break;

            case "TienNap":
                TinhThongKeNapTien(startDate, endDate);
                break;

            case "Tong":
                TinhThongKeCaHai(startDate, endDate);
                break;

            default:
                throw new AssertionError();
        }
    }

    public void TinhThongKeDichVu(Date startDate, Date endDate) {
        List<Object[]> result = hddao.TinhTongDichVu(startDate, endDate);
        fillToThongKe(result);
    }

    private void TinhThongKeNapTien(Date startDate, Date endDate) {
        List<Object[]> result = hddao.TinhTongNapTien(startDate, endDate);
        fillToThongKe(result);
    }

    private void TinhThongKeCaHai(Date startDate, Date endDate) {
        List<Object[]> result = hddao.TinhTongCaHai(startDate, endDate);
        fillToThongKe(result);
    }

    private void fillToThongKe(List<Object[]> result) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Ngay Trong Tuần");
        model.addColumn("Doanh Thu");
        int totalRevenue = 0;

        for (Object[] row : result) {
            model.addRow(row);
            totalRevenue += (int) row[1];
        }

        tbl_Pan.setModel(model);
        lbl_Tong.setText(String.valueOf(totalRevenue));
        updateBarChart(model);

    }
    
    private JFreeChart createBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createBarChart(
                "Doanh Thu",
                "ngày tháng năm ",
                "Doanh Thu",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);
        CategoryPlot plot = chart.getCategoryPlot();

        return chart;
    }

    // Method to update the bar chart based on the table data
    private void updateBarChart(DefaultTableModel model) {
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setDataset(createDataset(model));
    }

    // Method to create a dataset for the bar chart based on the table data
    private CategoryDataset createDataset(DefaultTableModel model) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int row = 0; row < model.getRowCount(); row++) {
            String category = model.getValueAt(row, 0).toString();
            int value = Integer.parseInt(model.getValueAt(row, 1).toString());
            dataset.addValue(value, "Doanh Thu", category);
            
        }

        return dataset;
    }

}
