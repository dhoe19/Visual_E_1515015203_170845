import java.sql.*;
import javax.swing.JOptionPane;
public class Koneksi {
    private static Connection con;
    
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_visual","root","");
            JOptionPane.showMessageDialog(null,"Koneksi Sukses kk");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi fail dude: " +e.getMessage());
        }
        return con; 
    }
}
