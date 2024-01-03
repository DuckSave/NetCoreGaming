/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entity.ThongKe;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.connection;

/**
 *
 * @author duong
 */
public class ThongKeDAO extends NetCoreDAO<ThongKe, String>{

    @Override
    public void insert(ThongKe entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ThongKe entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ThongKe selectById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ThongKe> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected List<ThongKe> selectBySql(String sql, Object... args) {
       List<ThongKe> list=new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, args);
                while(rs.next()){
                    ThongKe entity=new ThongKe();
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setTenTK(rs.getString("TenTK"));
                    entity.setNgay(rs.getDate("Ngay"));
                    entity.setSoTN(rs.getInt("SoTN"));
                    entity.setPhiDV(rs.getInt("PhiDV"));
                    entity.setMaHD(rs.getInt("MaHD")); //Thêm MaHD
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
    
    public List<ThongKe> calculateDailyRevenue(Date ngay) {
    List<ThongKe> result = new ArrayList<>();
    String sql = "{CALL CalculateDailyRevenue(?)}"; // Thay CalculateDailyRevenue bằng tên stored procedure thích hợp

    try {
            ResultSet rs = null;
            try {
                rs = connection.Query(sql, ngay);
                while(rs.next()){
                    ThongKe entity=new ThongKe();
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setTenTK(rs.getString("UserName"));
                    entity.setNgay(rs.getDate("Ngay"));
                    entity.setSoTN(rs.getInt("TongSoTN"));
                    entity.setPhiDV(rs.getInt("TongPhiDV"));
                    result.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    return result;
}


    
    
}
