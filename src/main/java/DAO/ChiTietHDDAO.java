package DAO;


import DAO.NetCoreDAO;
import entity.ChiTietHD;
import utils.connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChiTietHDDAO extends NetCoreDAO<ChiTietHD, Integer> {

    @Override
    public void insert(ChiTietHD entity) {
        String sql = "INSERT INTO ChiTietHD (MaHD, MaKH, MaDV, TenSP, DonGia, SoLuong,NgayChoi) VALUES (?, ?, ?, ?, ?, ?, ?)";
        connection.Update(sql,
                entity.getMaHD(),
                entity.getMaKH(),
                entity.getMaDV(),
                entity.getTenSP(),
                entity.getDonGia(),
                entity.getSoLuong(),
                entity.getNgayChoi());
    }
    
    public void insertHD(ChiTietHD entity) {
        String sql = "INSERT INTO ChiTietHD (MaHD, SoGC, NgayChoi) VALUES (?, ?, ?)";
        connection.Update(sql,
                entity.getMaHD(),
                entity.getSoTN(),
                entity.getNgayChoi());
    }
    
    public void insertDV(ChiTietHD entity) {
        String sql = "INSERT INTO ChiTietHD (MaDV, TenSP, DonGia, SoLuong, NgayChoi) VALUES (?, ?, ?, ?, ?)";
        connection.Update(sql,
                entity.getMaDV(),
                entity.getTenSP(),
                entity.getDonGia(),
                entity.getSoLuong(),
                entity.getNgayChoi());
    }

    @Override
    public void update(ChiTietHD entity) {
        String sql = "UPDATE ChiTietHD SET MaHD=?, MaDV=?, TenSP=?, DonGia=?, SoLuong=?, SoGC=?, PhiDV=? WHERE MaCT=?";
        connection.Update(sql,
                entity.getMaHD(),
                entity.getMaDV(),
                entity.getTenSP(),
                entity.getDonGia(),
                entity.getSoLuong(),
                entity.getSoTN(),
                entity.getNgayChoi(),
                entity.getMaCT());
    }
    
    
    public static void lastUpdateHD(){
        
        
    }

    @Override
    public void delete(Integer id) {
        String sql = "DELETE FROM ChiTietHD WHERE MaCT=?";
        connection.Update(sql, id);
    }

    @Override
    public ChiTietHD selectById(Integer id) {
        String sql = "SELECT * FROM ChiTietHD WHERE MaCT=?";
        List<ChiTietHD> list = selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ChiTietHD> selectAll() {
        String sql = "SELECT * FROM dbo.ChiTietHD";
        return selectBySql(sql);
    }

    public List<Object[]> selectAllHoaDon(int maHD, Date ngayChoi) { 
        List<Object[]> list = new ArrayList<>();
        String sql =    "SELECT \n" +
                        " CTHD.TenSP,\n" +
                        " SUM(CTHD.SoLuong) AS SoLuong, \n" +
                        " SUM(CTHD.DonGia) AS DonGia\n" +
                        "FROM \n" +
                        " ChiTietHD CTHD\n" +
                        "WHERE \n" +
                        " CTHD.MaHD = ?\n" +
                        " AND CTHD.NgayChoi = ? GROUP BY CTHD.TenSP";
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql,maHD,ngayChoi);
                while (rs.next()) {
                    String TenSP = rs.getString("TenSP");
                    int SoLuong = rs.getInt("SoLuong");
                    int DonGia = rs.getInt("DonGia");
                    Object[] row = { TenSP,SoLuong,DonGia};
                    list.add(row);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            
        }
        return list;
        
    }

    @Override
    protected List<ChiTietHD> selectBySql(String sql, Object... args) {
        List<ChiTietHD> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, args);
                while (rs.next()) {
                    ChiTietHD entity = new ChiTietHD();
                    entity.setMaCT(rs.getInt("MaCT"));
                    entity.setMaHD(rs.getInt("MaHD"));
                    entity.setMaDV(rs.getInt("MaDV"));
                    entity.setTenSP(rs.getString("TenSP"));
                    entity.setDonGia(rs.getInt("DonGia"));
                    entity.setSoLuong(rs.getInt("SoLuong"));
                    entity.setSoTN(rs.getInt("SoGC"));
                    entity.setNgayChoi(rs.getTime("NgayChoi"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            
        }
        return list;
    }
    
    public List<Object[]> TinhTongDichVu (Date startDate, Date endDate) { 
        String sql = "{call CalculateDailyTotalChiTietHD (?, ?)}"; 
        List<Object[]> result = new ArrayList<>();

        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, startDate, endDate);
                while (rs.next()) {
                    Date ngayChoi = rs.getDate("NgayChoi");
                    int tongSoLuong = rs.getInt("TongSoLuong");
                    Object[] row = { ngayChoi, tongSoLuong };
                    result.add(row);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            
        }

        return result;
    }
        
        public List<Object[]> TinhTongNapTien (Date startDate, Date endDate) { 
        String sql = "{call CalculateDailyTotalInRange (?, ?)}"; 
        List<Object[]> result = new ArrayList<>();

        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, startDate, endDate);
                while (rs.next()) {
                    Date ngayChoi = rs.getDate("Ngay");
                    int tongSoLuong = rs.getInt("TongSoTien");Object[] row = { ngayChoi, tongSoLuong };
                    result.add(row);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            
        }

        return result;
    }
        
        public List<Object[]> TinhTongCaHai(Date startDate, Date endDate) {
            String sql = "{call CalculateTotalRevenueInRange (?, ?)}";
            List<Object[]> result = new ArrayList<>();

            try {
                ResultSet rs = null;
                try {
                    rs = connection.Query(sql, startDate, endDate);
                    while (rs.next()) {
                        Date ngayChoi = rs.getDate("Ngay");
                        int tongDoanhThu = rs.getInt("TongTaiSan");
                        Object[] row = { ngayChoi, tongDoanhThu };
                        result.add(row);
                    }
                } finally {
                    if (rs != null) {
                        rs.getStatement().getConnection().close();
                    }
                }
            } catch (SQLException ex) {
                
            }

            return result;
        }
        
        
            public List<Object[]> selectDetailsByMaHDAndNgayChoi(int maHD, Date ngayChoi) {
        String sql = "SELECT TenSP, SoLuong, DonGia FROM ChiTietHD WHERE MaHD = ? AND NgayChoi = ?";
        List<Object[]> result = new ArrayList<>();

        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, maHD, ngayChoi);
                while (rs.next()) {
                    String tenSP = rs.getString("TenSP");
                    int soLuong = rs.getInt("SoLuong");
                    int donGia = rs.getInt("DonGia");
                    Object[] row = { tenSP, soLuong, donGia };
                    result.add(row);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            
        }

        return result;
    }
            
            
    public void updateLatestHoaDonForMaKH(int newMaKH, int newSoGC, Date newNgayChoi) {
        // Lấy ID của Hóa đơn mới nhất với MaKH = ? và sắp xếp theo NgayChoi giảm dần
        String selectLatestHoaDonIDSql = "SELECT MAX(MaHD) FROM HoaDon WHERE MaKH = ? AND NgayChoi = ?";
        int latestHoaDonID = selectSingleIntValue(selectLatestHoaDonIDSql,newMaKH,newNgayChoi);

        if (latestHoaDonID > 0) {
            // Thực hiện câu lệnh UPDATE
            String updateSql = "UPDATE ChiTietHD SET SoGC = ? WHERE MaHD = ? AND MaKH = ? AND NgayChoi = ?";
            connection.Update(updateSql, newSoGC, latestHoaDonID, newMaKH, newNgayChoi);
            System.out.println("Update ChiTietHD successfully");
        } else {
            System.out.println("Không tìm thấy Hóa đơn để cập nhật.");
        }
    }
    
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
            
        }
        return 0;
    }
        
        
}