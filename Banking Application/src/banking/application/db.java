
package banking.application;
import java.sql.Connection;
import java.sql.DriverManager;
public class db {
    
    static String url = "jdbc:mysql://localhost:3306/banking";
    static String user = "root";
    static String pass = "";
    public static Connection myconn() {
        Connection con  = null;
        try {
            con = DriverManager.getConnection(url,user,pass);
            return con;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
          
}

