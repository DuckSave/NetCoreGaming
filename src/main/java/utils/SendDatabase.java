/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import DAO.TaiKhoanDAO;
import com.google.gson.Gson;
import entity.TaiKhoan;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author duong
 */
public class SendDatabase {
    public static void sendTaiKhoanData() {
//        TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
//        List<TaiKhoan> taiKhoanList = taiKhoanDAO.selectAll();
//        String taiKhoanJson = convertTaiKhoanToJson(taiKhoanList);
    }
    
    public static String convertTaiKhoanToJson() {
        TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
        System.out.println("check");
        List<TaiKhoan> taiKhoanList = taiKhoanDAO.selectAll();
        Gson gson = new Gson();
        return gson.toJson(taiKhoanList);

    }
}
