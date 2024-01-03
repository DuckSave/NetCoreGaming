/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author duong
 */
public class connection{
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=NetCoreManager;encrypt=false;useUnicode=true;characterEncoding=UTF-8";
    private static String userName = "sa";
    private static String password = "lamproA2214";
    
//    Nạp driver
    
    static{
        try {
            Class.forName(driver);
        } 
        catch (ClassNotFoundException ex) {
            
        }
    }
    
    public static PreparedStatement getStmt(String sql, Object...args) throws SQLException{
        Connection conn = DriverManager.getConnection(dburl, userName, password);
        PreparedStatement pstmt = null;
        if(sql.trim().startsWith("{")){
            pstmt = conn.prepareCall(sql);
        }else{
            pstmt = conn.prepareStatement(sql);
        }
        
        for(int i = 0; i < args.length;i++){
            pstmt.setObject( i + 1, args[i]);
        }
        
        return pstmt;
    }
    
    public static void Update(String sql, Object...args){
        try {
            PreparedStatement stmt = connection.getStmt(sql, args);
            try {
                stmt.executeUpdate();
            } finally{
                stmt.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static ResultSet Query(String sql, Object...args) throws SQLException{
        try {
            PreparedStatement stmt = connection.getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        } 
    }
}
