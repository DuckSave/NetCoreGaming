/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.DichVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.connection;

/**
 *
 * @author duong
 */
public class DichVuDAO extends NetCoreDAO<DichVu, String>{

    @Override
    public void insert(DichVu entity) {
        String sql = "INSERT INTO DichVu (MaKH,TenSP,hinhanh,DonVi,Gia) VALUES (?,?,?,?,?)";
        connection.Update(sql, 
            entity.getMaKH(),
            entity.getTenSP(),
            entity.getHinhanh(),
            entity.getDonVi(),
            entity.getGia()); 
    }
    
    public void insertDV(DichVu entity) {
        String sql = "INSERT INTO DichVu (TenSP,hinhanh,DonVi,Gia) VALUES (?,?,?,?)";
        connection.Update(sql, 
            entity.getTenSP(),
            entity.getHinhanh(),
            entity.getDonVi(),
            entity.getGia()); 
    }
    
    

    @Override
    public void update(DichVu entity) {
        String sql="UPDATE DichVu SET TenSP=?, hinhanh=?, DonVi=?, Gia=? WHERE MaDV=?";
        connection.Update(sql, 
                entity.getTenSP(), 
                entity.getHinhanh(),
                entity.getDonVi(), 
                entity.getGia(), 
                entity.getMaDV());
    }

    @Override
    public void delete(String id) {
        String sql="DELETE FROM DichVu WHERE MaDV=?";
        connection.Update(sql, id);
    }
    
    public void deleteIntID(int id){
        String sql = "BEGIN TRANSACTION; -- Bắt đầu giao dịch\n" +
                    "\n" +
                    "BEGIN TRY\n" +
                    "    -- Kiểm tra xem trong TaiSan có MaKH của TaiKhoan cần xóa hay không\n" +
                    "    IF EXISTS (SELECT 1 FROM dbo.ChiTietHD WHERE MaDV = ?)\n" +
                    "    BEGIN\n" +
                    "        -- Thực hiện lệnh xóa trên bảng TaiSan nếu có dữ liệu\n" +
                    "        DELETE FROM dbo.ChiTietHD WHERE MaDV = ?;\n" +
                    "    END\n" +
                    "\n" +
                    "		DELETE FROM dbo.DichVu WHERE MaDV = ?;\n" +
                    "\n" +
                    "    -- Sao chép tất cả dữ liệu trong TaiKhoan vào bảng tạm\n" +
                    "    SELECT * INTO dbo.DichVu_Temp FROM dbo.DichVu;\n" +
                    "\n" +
                    "    -- Xóa tất cả dữ liệu trong TaiKhoan\n" +
                    "    DELETE FROM dbo.DichVu;\n" +
                    "\n" +
                    "    -- Sắp xếp lại giá trị seed về 0\n" +
                    "    DBCC CHECKIDENT('dbo.DichVu', RESEED, 0);\n" +
                    "\n" +
                    "    -- Insert lại dữ liệu từ bảng tạm vào TaiKhoan\n" +
                    "    INSERT INTO dbo.DichVu (TenSP, hinhanh, DonVi, Gia)\n" +
                    "    SELECT TenSP, hinhanh, DonVi, Gia FROM dbo.DichVu_Temp;\n" +
                    "\n" +
                    "    -- Drop bảng tạm\n" +
                    "    DROP TABLE dbo.DichVu_Temp;\n" +
                    "\n" +
                    "    COMMIT; -- Hoàn tất giao dịch nếu không có lỗi\n" +
                    "END TRY\n" +
                    "BEGIN CATCH\n" +
                    "    ROLLBACK; -- Quay trở lại trạng thái trước khi bắt đầu giao dịch nếu có lỗi\n" +
                    "    -- In ra hoặc ghi log lỗi\n" +
                    "    PRINT ERROR_MESSAGE();\n" +
                    "END CATCH;";

    connection.Update(sql, id, id, id);
    }

    
    public DichVu selectByIntID(int id) {
        String sql="SELECT * FROM DichVu WHERE MaDV=?";
        List<DichVu> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public DichVu selectByName(String name) {
        String sql="SELECT * FROM DichVu WHERE TenSP=?";
        List<DichVu> list = selectBySql(sql, name);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<DichVu> selectAll() {
        String sql="SELECT * FROM DichVu";
        return selectBySql(sql);
    }

    @Override
    protected List<DichVu> selectBySql(String sql, Object... args) {
        List<DichVu> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, args);
                while(rs.next()){
                    DichVu entity=new DichVu();
                    entity.setMaDV(rs.getInt("MaDV"));
                    entity.setHinhanh(rs.getString("hinhanh"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setDonVi(rs.getString("DonVi"));
                    entity.setGia(rs.getInt("Gia"));
                    
                    
                    
                    list.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    @Override
    public DichVu selectById(String id) {
        
        return null;
        
    }
    
}
