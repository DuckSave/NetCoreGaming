package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ProductPanel extends JPanel {
    private JLabel imageLabel;
    private JLabel nameLabel;
    private JLabel priceUnitLabel;

    public String getNameLabel() {
        return nameLabel.getText();
    }

    public ProductPanel(int MaDV, String name, String imagePath, String unit, int price) {
        setLayout(new BorderLayout());

        // Tải và resize hình ảnh
        BufferedImage img = loadImage(imagePath);
        int panelWidth = 150;
        int panelHeight = 150;
        Image resizedImage = img.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(resizedImage);

        imageLabel = new JLabel(imageIcon);
        nameLabel = new JLabel(name);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 16)); // Chữ in đậm và kích thước là 18
        nameLabel.setForeground(Color.GRAY);
        priceUnitLabel = new JLabel(price + "/" + unit);
        priceUnitLabel.setHorizontalAlignment(SwingConstants.CENTER);
        priceUnitLabel.setFont(new Font("Arial", Font.BOLD, 16));
        priceUnitLabel.setForeground(Color.GRAY); 

        JPanel textPanel = new JPanel(new GridLayout(2, 1));
        textPanel.setOpaque(false); // Đặt panel văn bản là không có màu nền để thấy được màu nền của panel chính
        textPanel.add(nameLabel);
        textPanel.add(priceUnitLabel);

        add(imageLabel, BorderLayout.CENTER);
        add(textPanel, BorderLayout.SOUTH);

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(panelWidth, panelHeight));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        // Đặt màu nền đen nhạt với độ mờ (opacity) là 50%
        g2d.setColor(new Color(176, 196, 222, 128)); // RGB và Alpha (0-255), 128 là 50%
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g2d.dispose();
    }

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
