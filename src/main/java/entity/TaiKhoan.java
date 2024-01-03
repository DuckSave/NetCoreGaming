/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Time;

/**
 *
 * @author duong
 */
public class TaiKhoan {
    int MaKH;
    String SDT;
    String UserName;
    String Password;
    boolean role;
    int soGioChoi;
    int tiendichvu;

    public TaiKhoan(int MaKH, String SDT, String UserName, String Password, boolean role, int soGioChoi) {
        this.MaKH = MaKH;
        this.SDT = SDT;
        this.UserName = UserName;
        this.Password = Password;
        this.role = role;
        this.soGioChoi = soGioChoi;
    }
 

    public TaiKhoan(String SDT, String UserName, String Password, boolean role, int soGioChoi) {
        this.SDT = SDT;
        this.UserName = UserName;
        this.Password = Password;
        this.role = role;
        this.soGioChoi = soGioChoi;
    }

    public TaiKhoan(String SDT, String UserName, String Password) {
        this.SDT = SDT;
        this.UserName = UserName;
        this.Password = Password;
    }

    public TaiKhoan(int MaKH, int soGioChoi) {
        this.MaKH = MaKH;
        this.soGioChoi = soGioChoi;
    }
    
    
    

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public TaiKhoan() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public int getSoGioChoi() {
        return soGioChoi;
    }

    public void setSoGioChoi(int soGioChoi) {
        this.soGioChoi = soGioChoi;
    }

    public int getTiendichvu() {
        return tiendichvu;
    }

    public void setTiendichvu(int tiendichvu) {
        this.tiendichvu = tiendichvu;
    }

    
  
}
