/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import entity.TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.connection;

/**
 *
 * @author duong
 */
public class TaiKhoanDAO extends NetCoreDAO<TaiKhoan, String>{

    @Override
    public void insert(TaiKhoan entity) {
        String sql = "INSERT INTO TaiKhoan (SDT,UserName,Password,Role,soGioChoi) VALUES (?,?,?,?,?)";
        connection.Update(sql, 
            entity.getSDT(),
            entity.getUserName(),
            entity.getPassword(),
            entity.isRole(),
            entity.getSoGioChoi());
    }

    @Override
    public void update(TaiKhoan entity) {
        String sql="UPDATE TaiKhoan SET SDT=?, UserName=?, Password=?, Role=?, soGioChoi=? WHERE MaKH=?";
        connection.Update(sql, 
                entity.getSDT(),
                entity.getUserName(),
                entity.getPassword(),
                entity.isRole(),
                entity.getSoGioChoi(),
                entity.getMaKH());
    }
    
    public void updateTK(TaiKhoan entity) {
        String sql="UPDATE TaiKhoan SET SDT=?, UserName=?, Password=? WHERE MaKH=?";
        connection.Update(sql, 
                entity.getSDT(),
                entity.getUserName(),
                entity.getPassword(),
                entity.getMaKH());
    }
    
    public void NapTien(TaiKhoan entity) {
        String sql="UPDATE TaiKhoan SET soGioChoi=? WHERE MaKH=?";
        connection.Update(sql, 
            entity.getSoGioChoi(),
            entity.getMaKH());
    }
    

    @Override
    public void delete(String id) {
        String sql="DELETE FROM TaiKhoan WHERE MaKH=?";
        connection.Update(sql, id);
    }
    
    public void deleteIntID(int id) {
    String sql =    "BEGIN TRANSACTION; -- Bắt đầu giao dịch\n" +
                    "\n" +
                    "BEGIN TRY\n" +
                    "    -- Kiểm tra xem trong TaiSan có MaKH của TaiKhoan cần xóa hay không\n" +
                    "    IF EXISTS (SELECT 1 FROM dbo.TaiSan WHERE MaKH = ?)\n" +
                    "    BEGIN\n" +
                    "        -- Thực hiện lệnh xóa trên bảng TaiSan nếu có dữ liệu\n" +
                    "        DELETE FROM dbo.TaiSan WHERE MaKH = ?;\n" +
                    "    END\n" +
                    "\n" +
                    "		DELETE FROM dbo.TaiKhoan WHERE MaKH = ?;\n" +
                    "\n" +
                    "    -- Sao chép tất cả dữ liệu trong TaiKhoan vào bảng tạm\n" +
                    "    SELECT * INTO dbo.TaiKhoan_Temp FROM dbo.TaiKhoan;\n" +
                    "\n" +
                    "    -- Xóa tất cả dữ liệu trong TaiKhoan\n" +
                    "    DELETE FROM dbo.TaiKhoan;\n" +
                    "\n" +
                    "    -- Sắp xếp lại giá trị seed về 0\n" +
                    "    DBCC CHECKIDENT('dbo.TaiKhoan', RESEED, 0);\n" +
                    "\n" +
                    "    -- Insert lại dữ liệu từ bảng tạm vào TaiKhoan\n" +
                    "    INSERT INTO dbo.TaiKhoan (SDT, UserName, Password, Role, soGioChoi, tiendichvu)\n" +
                    "    SELECT SDT, UserName, Password, Role, soGioChoi, tiendichvu FROM dbo.TaiKhoan_Temp;\n" +
                    "\n" +
                    "    -- Drop bảng tạm\n" +
                    "    DROP TABLE dbo.TaiKhoan_Temp;\n" +
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




    @Override
    public TaiKhoan selectById(String id) {
        String sql="SELECT * FROM TaiKhoan WHERE MaKH=?";
        List<TaiKhoan> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public TaiKhoan selectByIntID(int id) {
        String sql="SELECT * FROM TaiKhoan WHERE MaKH=?";
        List<TaiKhoan> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public TaiKhoan selectAccount(String userName){
        String sql = "SELECT * FROM TaiKhoan WHERE UserName = ?";
        List<TaiKhoan> list = selectBySql(sql, userName);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    @Override
    public List<TaiKhoan> selectAll() {
        String sql="SELECT * FROM dbo.TaiKhoan";
        return selectBySql(sql);
    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
        List<TaiKhoan> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, args);
                while(rs.next()){
                    TaiKhoan entity=new TaiKhoan();
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setSDT(rs.getString("SDT"));
                    entity.setUserName(rs.getString("UserName"));
                    entity.setPassword(rs.getString("Password"));
                    entity.setRole(rs.getBoolean("Role"));  
                    entity.setSoGioChoi(rs.getInt("soGioChoi"));
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
    
    public List<TaiKhoan> search(String keyword) {
        String sql = "SELECT * FROM TaiKhoan WHERE UserName LIKE ? OR SDT LIKE ? OR MaKH LIKE ?";
        String likeKeyword = "%" + keyword + "%";
        return selectBySql(sql, likeKeyword, likeKeyword, likeKeyword);
    }
    
}
