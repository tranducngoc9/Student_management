package Dao;

import model.SinhVien;
import java.sql.Connection;
import Helper.DatabaseHelper;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public boolean delete(String maSinhVien) throws Exception{

        String sql  =  "DELETE FROM `appquanlysv`.`sinhvien` WHERE (`MaSinhVien` = ?)";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            pstmt.setString(1, maSinhVien);
            return pstmt.executeUpdate() > 0 ;
        }
    }
    public SinhVien findID(String maSinhVien) throws Exception{

        String sql  =  "SELECT * FROM appquanlysv.sinhvien where MaSinhVien = ?";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            pstmt.setString(1, maSinhVien);
            try(ResultSet rs = pstmt.executeQuery()){   // So sanh
                if(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    return sv;
                    }

            }
            return null;  // Neu mà tim khong thay thi tra ve null
        }
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(rs.getString(1));
        sv.setHoTen(rs.getString(2));
        sv.setEmail(rs.getString(3));
        sv.setSoDT(rs.getString(4));
        sv.setGioiTinh(rs.getInt(5));
        sv.setDiaChi(rs.getString(6));
        return sv;
    }


    public List< SinhVien> findAll() throws Exception{

        String sql  =  "SELECT * FROM appquanlysv.sinhvien";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            try(ResultSet rs = pstmt.executeQuery()){
                List<SinhVien> list = new ArrayList<>();
                while(rs.next()){
                    SinhVien sv = createSinhVien(rs);
                    list.add(sv);
                    }
                return list;

            }
        }
    }
    
}
