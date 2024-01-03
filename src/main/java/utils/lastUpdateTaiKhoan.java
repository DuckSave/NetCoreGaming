/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import DAO.ChiTietHDDAO;
import DAO.HoaDonDAO;
import DAO.TaiKhoanDAO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.ChiTietHD;
import entity.DichVu;
import entity.HoaDon;
import entity.TaiKhoan;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author duong
 */
public class lastUpdateTaiKhoan {
    public static void processJsonData(String jsonString) {

        // Chuyển đổi thành danh sách TaiKhoan và DichVu
        TaiKhoan newTK = parseJsonToTaiKhoan(jsonString);

        // Chèn dữ liệu vào cơ sở dữ liệu
        insertTaiKhoanDataIntoDatabase(newTK);
    }

    private static TaiKhoan parseJsonToTaiKhoan(String jsonString) {
        Gson gson = new Gson();
        Type TaiKhoanListType = new TypeToken<TaiKhoan>() {}.getType();
        return gson.fromJson(jsonString, TaiKhoanListType);
    }
    
    private static void insertTaiKhoanDataIntoDatabase(TaiKhoan newTK) {
        TaiKhoanDAO tkdao = new TaiKhoanDAO();

        tkdao.update(newTK);
        
        System.out.println("Last update Tai Khoan succsessfully");
    }
}
