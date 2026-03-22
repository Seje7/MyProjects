/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales_management;
import java.sql.Connection;
import java.sql.DriverManager;
public class db {
    
    static String url = "jdbc:mysql://localhost:3306/pos";
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
