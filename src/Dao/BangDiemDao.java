
package Dao;

import Helper.DatabaseHelper;
import model.BangDiem;
import java.sql.Connection;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BangDiemDao {
    public boolean insert(BangDiem bd) throws Exception{

        String sql  =  "INSERT INTO `appquanlysv`.`ketqua` (`MaSinhVien`, `Toan`, `Van`, `Anh`) VALUES (?,?,?,?)";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            pstmt.setString(1, bd.getMaSinhVien());
            pstmt.setFloat(2, bd.getToan());
            pstmt.setFloat(3, bd.getVan());
            pstmt.setFloat(4, bd.getAnh());
            return pstmt.executeUpdate() > 0 ;
        }
    }
    
    public boolean update(BangDiem bd) throws Exception{
        
        String sql  =  "UPDATE `appquanlysv`.`ketqua` SET `Toan` = ?, `Van` = ?, `Anh` = ? WHERE (`MaSinhVien` = ?)";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            
            pstmt.setFloat(1, bd.getToan());
            pstmt.setFloat(2, bd.getVan());
            pstmt.setFloat(3, bd.getAnh());
            pstmt.setString(4, bd.getMaSinhVien());
            return pstmt.executeUpdate() > 0 ;
        }
    }
    
    public boolean deleteByMaSinhVien(String maSinhVien) throws Exception{

        String sql  =  "DELETE FROM `appquanlysv`.`ketqua` WHERE (`MaSinhVien` = ?)";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            pstmt.setString(1, maSinhVien);
            return pstmt.executeUpdate() > 0 ;
        }
    }
    
    public BangDiem findByMaSinhVien(String maSinhVien) throws Exception{

        String sql  =  "SELECT * FROM `appquanlysv`.`ketqua` where (`MaSinhVien` = ?)";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            pstmt.setString(1, maSinhVien);
            
            try(ResultSet rs = pstmt.executeQuery();){
                if (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMa(rs.getInt(1));
                    bd.setMaSinhVien(rs.getString(2));
                    bd.setToan(rs.getFloat(3));
                    bd.setVan(rs.getFloat(4));
                    bd.setAnh(rs.getFloat(5));
                    
                    return bd;
                }
                
            }
            return null;
        }
    }
    
    public List<BangDiem> findAll() throws Exception{

        String sql  =  "SELECT * FROM appquanlysv.ketqua";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            try(ResultSet rs = pstmt.executeQuery();){
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMa(rs.getInt(1));
                    bd.setMaSinhVien(rs.getString(2));
                    bd.setToan(rs.getFloat(3));
                    bd.setVan(rs.getFloat(4));
                    bd.setAnh(rs.getFloat(5));
                    list.add(bd);
                }
                return list;
            }
        }
    }
    
    public List<BangDiem> findTop(int top) throws Exception{

        String sql  =  "SELECT * ,(Toan + Van + Anh)/3  as DTB FROM appquanlysv.ketqua order by dtb desc LIMIT "+ top +"";
        try(
            Connection con = DatabaseHelper.ConnectDatabase();
            PreparedStatement pstmt = con.prepareStatement(sql);)
        {
            
            try(ResultSet rs = pstmt.executeQuery();){
                List<BangDiem> list = new ArrayList<>();
                while (rs.next()) {
                    BangDiem bd = new BangDiem();
                    bd.setMa(rs.getInt(1));
                    bd.setMaSinhVien(rs.getString(2));
                    bd.setToan(rs.getFloat(3));
                    bd.setVan(rs.getFloat(4));
                    bd.setAnh(rs.getFloat(5));
                    list.add(bd);
                }
                return list;
            }
        }
    }
}
