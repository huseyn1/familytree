
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OracleDao {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    private static final String DB_DRIVER_CLASSS="oracle.jdbc.driver.OracleDriver";
    private static final String URL="jdbc:orcle:thin:@localhost:1521:ORCL";
    private static final String USERNAME="hr";
    private static final String PASSWORD="hr";
    
    public void registrDriver(){
        try {
            Class.forName(DB_DRIVER_CLASSS);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void getConnection(){
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void closeConnection(){
        try {
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
}
