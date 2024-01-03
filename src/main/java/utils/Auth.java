/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entity.TaiKhoan;

/**
 *
 * @author duong
 */
public class Auth {
   
    public static TaiKhoan user = null;

    public static void clear() {
        Auth.user = null;
    }
   
    public static boolean isLogin() {
        return Auth.user != null;
    }
   
    public static boolean isManager() {
        if(isLogin() && user.isRole()){
            return true;
        }
        
        return false;
    }
}
