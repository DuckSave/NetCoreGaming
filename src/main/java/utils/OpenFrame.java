/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import ui.LoginForm;
import ui.ServerMenuForm;
import ui.indexForm;

/**
 *
 * @author duong
 */
public class OpenFrame {
    private static Frame indexFrame = new indexForm();
    private static Frame serverMenuFrame = new ServerMenuForm();
    
    public static void OpenIndexForm(){
       
        indexFrame.setResizable(false);
        indexFrame.setLocationRelativeTo(null);
        indexFrame.setVisible(true);
        
    }
    
    public static void CloseIndexForm(){
        indexFrame.setVisible(false);
    }
    
    public static void OpenServerMenuForm(){
        
        serverMenuFrame.setBackground(new Color(0, 0, 0, 0));
        serverMenuFrame.setResizable(false);
        serverMenuFrame.setLocationRelativeTo(null);
        serverMenuFrame.setVisible(true);
    }
    
    public static void voidCloseServerMenuForm(){
        serverMenuFrame.setVisible(false);
    }
}
