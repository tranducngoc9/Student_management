package studentmanagement;
import java.sql.*;
import Helper.DatabaseHelper;
import model.SinhVien;


public class StudentManagement {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
	String url="jdbc:mysql://localhost:3306/appquanlysv";
        String user="root";
        String password="root";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("ket noi Database thanh cong !!!!");
        
        
       java.sql.Statement statement = connection.createStatement();
		

		ResultSet resultset = statement.executeQuery("SELECT * FROM appquanlysv.sinhvien where MaSinhVien =2");
		
		System.out.println("         Danh sach Class luc dau");
		while (resultset.next()) {
			System.out.println( resultset.getString(1) + "\t" + resultset.getString(2) + "\t" + resultset.getString(3) 
                        + "\t" + resultset.getString(4)+ "\t" + resultset.getInt(5) + "\t" + resultset.getString(6));
		}
                System.out.println(1==2);
    }}
        
        
        
        
        
    