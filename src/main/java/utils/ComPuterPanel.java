/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author duong
 */
public class ComPuterPanel extends JPanel{
    private JLabel imageLabel;
    private JLabel nameLabel;
    public ComPuterPanel(String imagePath, String name) {
        setLayout(new GridLayout(2, 1));
//        setBackground(Color.red);
        BufferedImage img = loadImage(imagePath);
        int panelWidth = 445;
        int panelHeight = 600;
        Image resizedImage = img.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(resizedImage);
        
        imageLabel = new JLabel(imageIcon);
        nameLabel = new JLabel(name);
        add(imageLabel);
        add(nameLabel);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(panelWidth, panelHeight));
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
