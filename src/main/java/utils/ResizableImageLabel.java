/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author duong
 */
public class ResizableImageLabel extends JLabel{
    private Image originalImage;

    public  ResizableImageLabel(ImageIcon icon) {
        super(icon);
        this.originalImage = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (originalImage != null) {
            // Draw the image scaled to the size of the label
            g.drawImage(originalImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
