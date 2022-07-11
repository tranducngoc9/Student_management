package Dao;

import java.sql.PreparedStatement;
import  java.sql.ResultSet;
import model.NguoiDung;
import Helper.DatabaseHelper;

public class NguoiDungDao {   
    // Tao phuong thuc checklogin truyen vao tham so Tendangnhap va matkhau
    public NguoiDung checkLogin( String TenDangNhap, String MatKhau ) throws  Exception{
        //Kiem tra lay thong tin tendangnhap, matkhau, vaitro voi dk ten dang nhap va mat khau phai dung                        
        String sql = "select TenDangNhap, MatKhau from appquanlysv.nguoidung " + "where TenDangNhap=? and MatKhau=?";
        try(  
            PreparedStatement pstmt = DatabaseHelper.ConnectDatabase().prepareStatement(sql);
            ){
            pstmt.setString(1, TenDangNhap);  // Dau hoi 1 la gia tri TendDangNhap duoc truyen vao
            pstmt.setString(2, MatKhau);      // Dau hoi 2 la gia tri MatKhau duoc truyen vao
            //Thuc hien cau lenh truy van o tren
            try(ResultSet rs =  pstmt.executeQuery();){
                //neu co du lieu doc duoc thi goi next va tra ve true
                if (rs.next()) {  
                    NguoiDung nd = new NguoiDung();
                    nd.setTenDangNhap(TenDangNhap);
                    nd.setMatKhau(MatKhau);
                    return nd;  // tra ve du lieu nguoi dung
                }
            }
        return  null; // Cho biet ten dang nhap that bai
    }
}}
