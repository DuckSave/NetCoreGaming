/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import DAO.ChiTietHDDAO;
import DAO.HoaDonDAO;
import DashBoardPanel.DieuKhienPanel;
import DashBoardPanel.HoaDonPanel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.ChiTietHD;
import entity.DichVu;
import entity.HoaDon;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ui.ServerMenuForm;

/**
 *
 * @author duong
 */
public class lastUpdateHD {
    
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
        System.out.println(newHD.getSoGC());
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            HoaDonDAO hddao = new HoaDonDAO();
            ChiTietHDDAO cthd = new ChiTietHDDAO();
            Date ngay = newHD.getNgayChoi();
            String dmy = sdf.format(ngay);
            Date ngaychoi = sdf.parse(dmy);
            System.out.println(ngay);
            hddao.updateLatestHoaDonForMaKH(newHD.getMaKH(),newHD.getSoGC(),ngaychoi);
            cthd.updateLatestHoaDonForMaKH(newHD.getMaKH(),newHD.getSoGC(),ngaychoi);
            String sql = "SELECT MAX(MaHD) FROM HoaDon WHERE MaKH = ? AND NgayChoi = ?";
            int MaHD = hddao.selectSingleIntValue(sql,newHD.getMaKH(),ngaychoi);
            HoaDonPanel.HoaDon(newHD.getMaKH(), MaHD);
            ServerMenuForm.panelSlide1.show(4);
        } catch (Exception e) {
        }
        
        
    }
}

