package utils;
import DAO.ChiTietHDDAO;
import DAO.DichVuDAO;
import DAO.HoaDonDAO;
import DashBoardPanel.DieuKhienPanel;
import DashBoardPanel.HoaDonPanel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.ChiTietHD;
import entity.DichVu;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import ui.ServerMenuForm;


public class reciveServices {
    
    public static void processJsonData(String jsonString) {

        // Chuyển đổi thành danh sách TaiKhoan và DichVu
        List<DichVu> dichVuList = parseJsonToDichVuList(jsonString);

        // Chèn dữ liệu vào cơ sở dữ liệu
        insertDichVuDataIntoDatabase(dichVuList);
    }

    private static List<DichVu> parseJsonToDichVuList(String jsonString) {
        Gson gson = new Gson();
        Type dichVuListType = new TypeToken<List<DichVu>>() {}.getType();
        return gson.fromJson(jsonString, dichVuListType);
    }




private static void insertDichVuDataIntoDatabase(List<DichVu> dichVuList) {
    ChiTietHDDAO CTHDDAO = new ChiTietHDDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    for (DichVu dv : dichVuList) {
        // Lấy các giá trị từ đối tượng DichVu
        int maKH = dv.getMaKH();
        int MaHD = hddao.getLatestHoaDonIDHaveMaKH(maKH);
        System.out.println(MaHD);
        int maDV = dv.getMaDV();
        String tenSP = dv.getTenSP();
        int gia = dv.getGia();
        int soLuong = dv.getSoluong();
        System.out.println(soLuong);
        // Chuyển đổi từ java.util.Date sang java.sql.Date
        java.util.Date ngayChoiUtil = dv.getNgayChoi();
        java.sql.Date ngayChoi = new java.sql.Date(ngayChoiUtil.getTime());

        // Tạo đối tượng HoaDonDV mới
        ChiTietHD newhd = new ChiTietHD(MaHD,maKH, maDV, tenSP, gia, soLuong, ngayChoi);
        CTHDDAO.insert(newhd);
        HoaDonPanel.HoaDon(maKH, MaHD);
        ServerMenuForm.panelSlide1.show(4);
        
    }
}


}
