/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author DUC LUU
 */
public class DichVu {
    public int MaDV; 
    public int MaKH;
    public String tenSP ; 
    public String hinhanh;
    public String DonVi; 
    public int Gia ; 
    public int soluong = 0;
    public Date NgayChoi;


//    public DichVu(int MaDV, String tenSP, String hinhanh, String DonVi, int Gia) {
//        this.MaDV = MaDV;
//        this.tenSP = tenSP;
//        this.hinhanh = hinhanh;
//        this.DonVi = DonVi;
//        this.Gia = Gia;
//    }

    public DichVu(String name, String imagePath,int price,String unit) {
        this.tenSP = name;
        this.hinhanh = imagePath;
        this.DonVi = unit;
        this.Gia = price;
    }

    public DichVu(int MaDV, String name, String imagePath,int price, String unit, int sl) {
        this.MaDV = MaDV;
        this.tenSP = name;
        this.hinhanh = imagePath;
        this.Gia = price;
        this.DonVi = unit;
        this.soluong = sl;
    }

    public DichVu(int MaKH, int MaDV,String tenSP, int Gia, int soluong, Date NgayChoi) {
        this.MaDV = MaDV;
        this.MaKH = MaKH;
        this.tenSP = tenSP;
        this.Gia = Gia;
        this.NgayChoi = NgayChoi;
    }
    
    

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }
       
    public int getMaDV() {
        return MaDV;
    }

    public DichVu() {
    }

    public void setMaDV(int MaDV) {
        this.MaDV = MaDV;
    }

    public DichVu(int MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Date getNgayChoi() {
        return NgayChoi;
    }

    public void setNgayChoi(Date NgayChoi) {
        this.NgayChoi = NgayChoi;
    }
    
}
