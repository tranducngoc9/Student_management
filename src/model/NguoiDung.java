
package model;

public class NguoiDung {
    private  String TenDangNhap, matKhau, VaiTro;
   
    public NguoiDung() {
    }
    public String getTenDangNhap() {
        return TenDangNhap;
    }
    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }
    
    public NguoiDung(String TenDangNhap, String matKhau, String VaiTro) {
        this.TenDangNhap = TenDangNhap;
        this.matKhau = matKhau;
        this.VaiTro = VaiTro;
    }    
}
