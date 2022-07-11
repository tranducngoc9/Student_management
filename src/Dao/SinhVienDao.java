package Dao;

import model.SinhVien;
import java.sql.Connection;
import Helper.DatabaseHelper;
import  java.sql.PreparedStatement;

public class SinhVienDao {
    public boolean insert(SinhVien sv) throws Exception{

        String sql  =  "INSERT INTO `appquanlysv`.`sinhvien` (`MaSinhVien`, `HoTen`, `Email`, `SoDT`, `GioiTinh`, `DiaChi`) VALUES (?,?,?,?,?,?)";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            pstmt.setString(1, sv.getMaSinhVien());
            pstmt.setString(2, sv.getHoTen());
            pstmt.setString(3, sv.getEmail());
            pstmt.setString(4, sv.getSoDT());
            pstmt.setInt(5, sv.getGioiTinh());
            pstmt.setString(6, sv.getDiaChi());
            return pstmt.executeUpdate() > 0 ;
        }
    }
    //UPDATE `appquanlysv`.`sinhvien` SET `MaSinhVien` = '2', `HoTen` = '2', `Email` = '2', `SoDT` = '2', `GioiTinh` = '2', `DiaChi` = '2' WHERE (`MaSinhVien` = '1');
    public boolean update(SinhVien sv) throws Exception{

        String sql  =  "UPDATE `appquanlysv`.`sinhvien` SET `HoTen` =?, `Email` = ?, `SoDT` = ?, `GioiTinh` = ?, `DiaChi` = ? WHERE (`MaSinhVien` = ?)";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            pstmt.setString(1, sv.getHoTen());
            pstmt.setString(2, sv.getEmail());
            pstmt.setString(3, sv.getSoDT());
            pstmt.setInt(4, sv.getGioiTinh());
            pstmt.setString(5, sv.getDiaChi());
            pstmt.setString(6, sv.getMaSinhVien());
            return pstmt.executeUpdate() > 0 ;
        }
    }
}
