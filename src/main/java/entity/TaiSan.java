package entity;
import java.util.Date;

public class TaiSan {
    private int MaTS;
    private int MaKH;
    private int SoTN;
    private Date NgayChoi;

    
    
    // Constructor
    
    
    
    public TaiSan() {
    }

    public TaiSan(int maTS, int maKH, int soTN, Date ngayChoi) {
        this.MaTS = maTS;
        this.MaKH = maKH;
        this.SoTN = soTN;
        this.NgayChoi = ngayChoi;
    }

    public TaiSan(int MaKH, int SoTN, Date NgayChoi) {
        this.MaKH = MaKH;
        this.SoTN = SoTN;
        this.NgayChoi = NgayChoi;
    }
    
    

    // Getter methods
    public int getMaTS() {
        return MaTS;
    }

    public int getMaKH() {
        return MaKH;
    }

    public int getSoTN() {
        return SoTN;
    }

    public Date getNgayChoi() {
        return NgayChoi;
    }

    // Setter methods (if needed)
    public void setMaTS(int maTS) {
        this.MaTS = maTS;
    }

    public void setMaKH(int maKH) {
        this.MaKH = maKH;
    }

    public void setSoTN(int soTN) {
        this.SoTN = soTN;
    }

    public void setNgayChoi(Date ngayChoi) {
        this.NgayChoi = ngayChoi;
    }
}
