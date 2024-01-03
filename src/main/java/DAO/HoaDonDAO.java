package DAO;


import DAO.NetCoreDAO;
import entity.ChiTietHD;
import entity.HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.connection;

public class HoaDonDAO extends NetCoreDAO<HoaDon, Integer> {

    @Override
    public void insert(HoaDon entity) {
        String sql = "INSERT INTO HoaDon (MaKH, SoGC, NgayChoi) VALUES (?, ?, ?)";
        connection.Update(sql,
                entity.getMaKH(),
                entity.getSoGC(),
                entity.getNgayChoi());
    }

    @Override
    public void update(HoaDon entity) {
        String sql = "UPDATE HoaDon SET MaKH=?, SoGC=?, NgayChoi=? WHERE MaHD=?";
        connection.Update(sql,
                entity.getMaKH(),
                entity.getSoGC(),
                entity.getNgayChoi(),
                entity.getMaHD());
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM HoaDon WHERE MaHD=?";
        connection.Update(sql, id);
    }

    @Override
    public HoaDon selectById(Integer id) {
        String sql = "SELECT * FROM HoaDon WHERE MaHD=?";
        List<HoaDon> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM dbo.HoaDon";
        return selectBySql(sql);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, args);
                while (rs.next()) {
                    HoaDon entity = new HoaDon();
                    entity.setMaHD(rs.getInt("MaHD"));
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setSoTN(rs.getInt("SoGC"));
                    entity.setNgayChoi(rs.getDate("NgayChoi"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    
    public int getLatestHoaDonID() { 

        ResultSet rs = null;
        String sql = "SELECT MAX(MaHD) AS latestID FROM HoaDon";
            try {
                rs = connection.Query(sql);
                while (rs.next()) {
                   return rs.getInt("latestID");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        return 0;
    }
    
    public int getLatestHoaDonIDHaveMaKH(int MaKH) { 

        ResultSet rs = null;
        String sql = "SELECT MAX(MaHD) AS latestID FROM HoaDon WHERE MaKH = ?";
            try {
                rs = connection.Query(sql,MaKH);
                while (rs.next()) {return rs.getInt("latestID");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        return 0;
    } 
    
    //Lấy lấy MaHD cuối cùng có MaKH = ?
    public int selectSingleIntValue(String sql, int maKH, Date NgayChoi) {
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, maKH, NgayChoi);
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return 0;
    }
    
    
    public void updateLatestHoaDonForMaKH(int newMaKH, int newSoGC, Date newNgayChoi) {
        // Lấy ID của Hóa đơn mới nhất với MaKH = ? và sắp xếp theo NgayChoi giảm dần
        String selectLatestHoaDonIDSql = "SELECT MAX(MaHD) FROM HoaDon WHERE MaKH = ? AND NgayChoi = ?";
        int latestHoaDonID = selectSingleIntValue(selectLatestHoaDonIDSql,newMaKH,newNgayChoi);

        if (latestHoaDonID > 0) {
            // Thực hiện câu lệnh UPDATE
            String updateSql = "UPDATE HoaDon SET MaKH = ?, SoGC = ?, NgayChoi = ? WHERE MaHD = ?";
            connection.Update(updateSql, newMaKH, newSoGC, newNgayChoi, latestHoaDonID);
            System.out.println("Update HoaDon successfully");
        } else {
            System.out.println("Không tìm thấy Hóa đơn để cập nhật.");
        }
    }
    
    
    public static List selectByMaKHAndCurrentDate(int maKH , Date NgayChoi) throws SQLException {
        List list = new ArrayList<>();

        String sql =    "SELECT TOP 1\n" +
                        "    tk.SDT,\n" +
                        "    hd.MaHD,\n" +
                        "    tk.UserName,\n" +
                        "    hd.SoGC,\n" +
                        "    tk.MaKH,\n" +
                        "    hd.NgayChoi\n" +
                        "FROM \n" +
                        "    HoaDon hd\n" +
                        "JOIN \n" +
                        "    TaiKhoan tk ON hd.MaKH = tk.MaKH\n" +
                        "WHERE \n" +
                        "    hd.MaKH = ?\n" +
                        "    AND hd.NgayChoi = ?\n" +
                        "ORDER BY\n" +
                        "    hd.MaHD DESC;";

        ResultSet rs = null;
        
        try {
            rs = connection.Query(sql, maKH, NgayChoi);
            int MaHD;
            String userName;
            String SDT ; 
            int SoGC ; 
            int MKH ; 
            Date Ngay ; 
            
            
            while(rs.next()){
                SDT = rs.getString("SDT");
                MaHD = rs.getInt("MaHD"); 
                userName = rs.getString("UserName"); 
                SoGC = rs.getInt("SoGC");
                MKH = rs.getInt("MaKH");
                Ngay = rs.getDate("NgayChoi"); 
                list.add(SDT);
                list.add(MaHD);
                list.add(userName);
                list.add(SoGC);
                list.add(MKH);
                list.add(Ngay);
                return list;
            }
        } finally {
        } 
                
                
        return null;
        } 


    }