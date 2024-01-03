package entity;


import java.util.Date;

public class HoaDon {
    private int maHD;
    private int maKH;
    private int SoGC;
    private Date ngayChoi;

    public HoaDon() {
        // Constructor mặc định
    }

    public HoaDon(int maHD, int maKH, int soTN, Date ngayChoi) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.SoGC = soTN;
        this.ngayChoi = ngayChoi;
    }

    public HoaDon(int maKH, int soTN, Date ngayChoi) {
        this.maKH = maKH;
        this.SoGC = soTN;
        this.ngayChoi = ngayChoi;
    }
    
    

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

    public int getSoGC() {
        return SoGC;
    }

    public void setSoTN(int soTN) {
        this.SoGC = soTN;
    }

    public Date getNgayChoi() {
        return ngayChoi;
    }

    public void setNgayChoi(Date ngayChoi) {
        this.ngayChoi = ngayChoi;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD=" + maHD +
                ", maKH=" + maKH +
                ", soTN=" + SoGC +
                ", ngayChoi=" + ngayChoi +
                '}';
    }
}