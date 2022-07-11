package Helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHelper {
    public static Connection ConnectDatabase() throws Exception{
        String url="jdbc:mysql://localhost:3306/appquanlysv";
        String user="root";
        String password="root";
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("ket noi Database thanh cong !!!!");
        
        return con;
    }
}
