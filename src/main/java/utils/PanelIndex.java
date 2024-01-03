/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utils;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author duong
 */
public class PanelIndex extends JPanel{

    Image icon;
    
    public PanelIndex(String path){
        try {
            icon = new ImageIcon(path).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
            if (icon != null) {
            Graphics2D gd = (Graphics2D) g.create();
            gd.drawImage(icon, 0, 0, getWidth(), getHeight(), null);
            gd.dispose();
        }
    }

}
   

