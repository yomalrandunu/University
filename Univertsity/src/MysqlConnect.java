import java.sql.*;
import javax.swing.*;
public class MysqlConnect {
    Connection conn =null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/University?useSSL=false","root","Yomal1@123");
            JOptionPane.showMessageDialog(null,"Connected to Database");
            return conn;
            //spring.datasource.url=jdbc:mysql://localhost/mkyong?useSSL=false;
//spring.datasource.username=root;
//spring.datasource.password=password;
//spring.datasource.driver-class-name=com.mysql.jdbc.Drive;
            
        }catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,e);
          return null;
        }
       
    }
}
