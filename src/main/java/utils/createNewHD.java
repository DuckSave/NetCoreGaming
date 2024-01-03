/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import DAO.ChiTietHDDAO;
import DAO.HoaDonDAO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.ChiTietHD;
import entity.DichVu;
import entity.HoaDon;
import java.lang.reflect.Type;
import java.util.List;

/**
 *
 * @author duong
 */
public class createNewHD {
    public static void processJsonData(String jsonString) {

        // Chuyển đổi thành danh sách TaiKhoan và DichVu
        HoaDon newHD = parseJsonToHoaDon(jsonString);

        // Chèn dữ liệu vào cơ sở dữ liệu
        insertHoaDonDataIntoDatabase(newHD);
    }

    private static HoaDon parseJsonToHoaDon(String jsonString) {
        Gson gson = new Gson();
        Type dichVuListType = new TypeToken<HoaDon>() {}.getType();
        return gson.fromJson(jsonString, dichVuListType);
    }
    
    private static void insertHoaDonDataIntoDatabase(HoaDon newHD) {
        HoaDonDAO hddao = new HoaDonDAO();
        hddao.insert(newHD);
        
        System.out.println("Crerate new HD succsessfully");
    }
}
