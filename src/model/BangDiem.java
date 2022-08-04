
package model;
public class BangDiem {
    private  int Ma;
    private String MaSinhVien;
    float Toan;
    float Van ;
    float Anh;

    public BangDiem() {
    }

    public BangDiem(int Ma, String MaSinhVien, float Toan, float Van, float Anh) {
        this.Ma = Ma;
        this.MaSinhVien = MaSinhVien;
        this.Toan = Toan;
        this.Van = Van;
        this.Anh = Anh;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int Ma) {
        this.Ma = Ma;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float Toan) {
        this.Toan = Toan;
    }

    public float getVan() {
        return Van;
    }

    public void setVan(float Van) {
        this.Van = Van;
    }

    public float getAnh() {
        return Anh;
    }

    public void setAnh(float Anh) {
        this.Anh = Anh;
    }
    
    
    
}
