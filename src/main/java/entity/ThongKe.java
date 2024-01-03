package entity;

import java.util.Date;

public class ThongKe {
    private int maHD;
    private int maKH;
    private String tenTK;
    private Date ngay;
    private int soTN;
    private int phiDV;

    // Constructors
    public ThongKe() {
    }

    public ThongKe(int maHD, int maKH, String tenTK, Date ngay, int soTN, int phiDV) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.tenTK = tenTK;
        this.ngay = ngay;
        this.soTN = soTN;
        this.phiDV = phiDV;
    }

    // Getters and Setters
    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getSoTN() {
        return soTN;
    }

    public void setSoTN(int soTN) {
        this.soTN = soTN;
    }

    public int getPhiDV() {
        return phiDV;
    }

    public void setPhiDV(int phiDV) {
        this.phiDV = phiDV;
    }

    // toString method
    @Override
    public String toString() {
        return "ThongKe{" +
                "maHD=" + maHD +
                ", maKH=" + maKH +
                ", tenTK='" + tenTK + '\'' +
                ", ngay=" + ngay +
                ", soTN=" + soTN +
                ", phiDV=" + phiDV +
                '}';
    }
}
