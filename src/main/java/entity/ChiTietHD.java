/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

public class ChiTietHD {
    private int maCT;
    private int maHD;
    private int maDV;
    private int MaKH;
    private String tenSP;
    private int donGia;
    private int soLuong;
    private int soTN;
    private Date NgayChoi;

    public ChiTietHD() {
        // Constructor mặc định
    }

    public ChiTietHD(int maCT, int maHD, int maDV, String tenSP, int donGia, int soLuong, int soTN, Date NgayChoi) {
        this.maCT = maCT;
        this.maHD = maHD;
        this.maDV = maDV;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.soTN = soTN;
        this.NgayChoi = NgayChoi;
    }

    public ChiTietHD(int maHD, int soTN, Date NgayChoi) {
        this.maHD = maHD;
        this.soTN = soTN;
        this.NgayChoi = NgayChoi;
    }

    public ChiTietHD(int MaHD, int MaKH, int maDV, String tenSP, int donGia, int soLuong, Date NgayChoi) {
        this.maHD = MaHD;
        this.MaKH = MaKH;
        this.maDV = maDV;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.NgayChoi = NgayChoi;
    }

    
    
    public int getMaCT() {
        return maCT;
    }

    public void setMaCT(int maCT) {
        this.maCT = maCT;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public ChiTietHD(int MaKH) {
        this.MaKH = MaKH;
    } 

    public int getMaDV() {
        return maDV;
    }

    public void setMaDV(int maDV) {
        this.maDV = maDV;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoTN() {
        return soTN;
    }

    public void setSoTN(int soTN) {
        this.soTN = soTN;
    }

    public Date getNgayChoi() {
        return NgayChoi;
    }

    public void setNgayChoi(Date NgayChoi) {
        this.NgayChoi = NgayChoi;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    
    
}
