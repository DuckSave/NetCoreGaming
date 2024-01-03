
package DashBoardPanel;
import DAO.DichVuDAO;
import DAO.TaiKhoanDAO;
import static DashBoardPanel.DieuKhienPanel.mainPanel;
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
import java.lang.reflect.InvocationTargetException;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import static ui.ServerMenuForm.sendDVForAll;
import utils.DynamicArray;
import utils.MsgBox;
import utils.OpenFrame;
import utils.ProductPanel;
import utils.ServerThread;

public class DichVuPanel extends javax.swing.JPanel {

    /**
     * Creates new form DieuKhien
     */
    public DichVuPanel() {
        initComponents();
        
        SwingUtilities.invokeLater(new Runnable() {
        @Override
            public void run() {
                ListDichVu();
            }
        });
    }

    private DichVuDAO dvdao = new DichVuDAO();
    private List<DichVu> products; 
    private static List<ProductPanel> productPanels;
    private static String API;
    public static ServerThread curentClient;
    private static DynamicArray<ServerThread> listClients = utils.Server.clientSockets;
    private static DynamicArray<JLabel> clientLabels = new DynamicArray<>();
    private int curentID;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        btn_ThemSPDV = new javax.swing.JButton();
        btn_XoaSPDV = new javax.swing.JButton();
        btn_SuaSPDV = new javax.swing.JButton();
        btn_MoiSPDV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        imgaeDV = new javax.swing.JLabel();
        txt_TenSPDV = new javax.swing.JTextField();
        txt_DonViDV = new javax.swing.JTextField();
        txt_GiaSPDV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        ScrollPane1.setBorder(null);
        ScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollPane1.setAlignmentX(0.0F);
        ScrollPane1.setAlignmentY(0.0F);
        ScrollPane1.setHorizontalScrollBar(null);

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setForeground(new java.awt.Color(255, 153, 153));

        btn_ThemSPDV.setBackground(new java.awt.Color(0, 153, 153));
        btn_ThemSPDV.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\add-button.png")); // NOI18N
        btn_ThemSPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemSPDVActionPerformed(evt);
            }
        });

        btn_XoaSPDV.setBackground(new java.awt.Color(0, 153, 153));
        btn_XoaSPDV.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\delete.png")); // NOI18N
        btn_XoaSPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaSPDVActionPerformed(evt);
            }
        });

        btn_SuaSPDV.setBackground(new java.awt.Color(0, 153, 153));
        btn_SuaSPDV.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\repair.png")); // NOI18N
        btn_SuaSPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaSPDVActionPerformed(evt);
            }
        });

        btn_MoiSPDV.setBackground(new java.awt.Color(0, 153, 153));
        btn_MoiSPDV.setIcon(new javax.swing.ImageIcon("C:\\Users\\duong\\Downloads\\zip\\NetCoreGaming\\src\\main\\java\\icons\\reset.png")); // NOI18N
        btn_MoiSPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MoiSPDVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btn_ThemSPDV)
                .addGap(0, 0, 0)
                .addComponent(btn_XoaSPDV)
                .addGap(0, 0, 0)
                .addComponent(btn_SuaSPDV)
                .addGap(0, 0, 0)
                .addComponent(btn_MoiSPDV))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ThemSPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_XoaSPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_SuaSPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_MoiSPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        imgaeDV.setBackground(new java.awt.Color(204, 204, 204));
        imgaeDV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imgaeDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgaeDVMouseClicked(evt);
            }
        });

        txt_TenSPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenSPDVActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Product Name");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Price");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Unit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_GiaSPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_DonViDV, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_TenSPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(imgaeDV, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(imgaeDV, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TenSPDV, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_GiaSPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DonViDV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addComponent(ScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemSPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemSPDVActionPerformed
        dvdao.insertDV(readForm());
        ListDichVu();
        sendDVForAll();
        
    }//GEN-LAST:event_btn_ThemSPDVActionPerformed

    private void btn_MoiSPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MoiSPDVActionPerformed
        resetForm();
    }//GEN-LAST:event_btn_MoiSPDVActionPerformed

    private void imgaeDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgaeDVMouseClicked
        JFileChooser fileChooser = new JFileChooser();

        // Chỉ hiển thị các tệp hình ảnh
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif"));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            // Người dùng đã chọn một tệp
            pathImage = fileChooser.getSelectedFile().getPath();

            BufferedImage img = loadImage(pathImage);
            Image resizedImage = img.getScaledInstance(imgaeDV.getWidth(), imgaeDV.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(resizedImage);
            imgaeDV.setIcon((Icon) imageIcon);
        }
    }//GEN-LAST:event_imgaeDVMouseClicked

    private void btn_XoaSPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaSPDVActionPerformed
        
        int result = JOptionPane.showConfirmDialog(
                null,
                "Mọi dữ liệu liên quan đến dịch vụ sẽ mất bạn có muốn tiếp tục ?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION);

        // Xử lý kết quả từ hộp thoại
        if (result == JOptionPane.YES_OPTION) {
            DichVu dv = dvdao.selectByIntID(curentID);
            dvdao.deleteIntID(dv.getMaDV());
            ListDichVu();
            sendDVForAll();
        } 
        
    }//GEN-LAST:event_btn_XoaSPDVActionPerformed

    private void btn_SuaSPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaSPDVActionPerformed
        DichVu dv = readForm();
        System.out.println(dv.getHinhanh());
        dv.setMaDV(curentID);
        
        dvdao.update(dv);
        ListDichVu();
        sendDVForAll();
    }//GEN-LAST:event_btn_SuaSPDVActionPerformed

    private void txt_TenSPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenSPDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenSPDVActionPerformed


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JButton btn_MoiSPDV;
    private javax.swing.JButton btn_SuaSPDV;
    private javax.swing.JButton btn_ThemSPDV;
    private javax.swing.JButton btn_XoaSPDV;
    private javax.swing.JLabel imgaeDV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_DonViDV;
    private javax.swing.JTextField txt_GiaSPDV;
    private javax.swing.JTextField txt_TenSPDV;
    // End of variables declaration//GEN-END:variables


    private void addProduct(int MaDV,String name, String imagePath, String unit, int price) {
        ProductPanel productPanel = new ProductPanel(MaDV,name, imagePath, unit, price);
        productPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DichVu dv = new DichVu(MaDV, name, imagePath, price, unit, 1);
                curentID = dv.getMaDV();
                pathImage = dv.getHinhanh();
                System.out.println(curentID);
                writeForm(dv);

        }});
        productPanels.add(productPanel);
    }
    
    private void ListDichVu() {
        products = dvdao.selectAll();
        productPanels = new ArrayList<>();
        JPanel panelContainer = new JPanel();
//        panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
        panelContainer.setBackground(new Color(255,204,135,0));
        
        panelContainer.setSize(ScrollPane1.getWidth(), 1000);
        
        // add data
        for(DichVu product : products){
            addProduct(product.getMaDV(),product.getTenSP(), product.getHinhanh(), product.getDonVi(), product.getGia());
            System.out.println(product);
        }
        //add panel
        for (ProductPanel panel : productPanels) {
//            System.out.println(panel);
            panelContainer.add(panel);
           
        }
        ScrollPane1.setVerticalScrollBarPolicy(ScrollPane1.VERTICAL_SCROLLBAR_AS_NEEDED);
        ScrollPane1.setHorizontalScrollBarPolicy(ScrollPane1.HORIZONTAL_SCROLLBAR_NEVER);
        
        panelContainer.setPreferredSize(new Dimension(ScrollPane1.getWidth(), 3000));
        
        ScrollPane1.getViewport().setOpaque(false);
        ScrollPane1.setViewportView(panelContainer);

    }
    
    
//    ---------- Form Dich Vu ----------------
    private String pathImage;
    private String tenSP;
    private String Gia;
    private String DonVi;
    

    
    private void resetForm(){
        imgaeDV.setIcon(null);
        txt_TenSPDV.setText("");
        txt_GiaSPDV.setText("");
        txt_DonViDV.setText("");
    }
    
    private DichVu readForm() {
        
        return new DichVu(txt_TenSPDV.getText(), pathImage, Integer.parseInt(txt_GiaSPDV.getText()), txt_DonViDV.getText());
    }


    
    private void writeForm(DichVu dv){
        System.out.println(dv.getHinhanh());
        BufferedImage img = loadImage(dv.getHinhanh());
        Image resizedImage = img.getScaledInstance(imgaeDV.getWidth(), imgaeDV.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(resizedImage);
        imgaeDV.setIcon((Icon) imageIcon);
        txt_TenSPDV.setText(dv.getTenSP());
        txt_GiaSPDV.setText(String.valueOf(dv.getGia()));
        txt_DonViDV.setText(dv.getDonVi());
    }
    
//  private void writeFormDichVu(DichVu dv){
//        BufferedImage img = loadImage(dv.getHinhanh());
//        Image resizedImage = img.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
//        ImageIcon imageIcon = new ImageIcon(resizedImage);
//        
//  }
    
    private BufferedImage loadImage(String path) {
        try {
            File file = new File(path);
            if (file != null) {
                return ImageIO.read(file);
            } else {
                System.err.println("Không thể tìm thấy hình ảnh: " + path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
}
