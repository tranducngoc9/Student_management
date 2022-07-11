package studentmanagement;
import java.sql.*;


public class StudentManagement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
	String url="jdbc:mysql://localhost:3306/appquanlysv";
        String user="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("ket noi Database thanh cong !!!!");
        
        
        
        
        String sql = "select * from appquanlysv.nguoidung where TenDangNhap=? and MatKhau=?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        
        pstmt.setString(1, "admin");  // Dau hoi 1 la gia tri TendDangNhap duoc truyen vao
        pstmt.setString(2, "1234");      // Dau hoi 2 la gia tri MatKhau duoc truyen vao
        
        ResultSet resultset =  pstmt.executeQuery();
		while (resultset.next()) {
			System.out.println( resultset.getString(1) + "\t" + resultset.getString(2) + "\t" + resultset.getString(3) );
		}
    }    
}
    