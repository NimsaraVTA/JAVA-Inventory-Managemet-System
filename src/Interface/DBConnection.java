
package Interface;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnection {
    
    public static Connection connect(){
    
    Connection conn=null;
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/newinventory","root","");
        //JOptionPane.showMessageDialog(null, "Connection Successfully");
        
    }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, e);
    
    }
    
    return conn;
    
    }
    
    
    
    
    }
    

