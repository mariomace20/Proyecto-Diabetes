/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionMySQL {
    
    public String db = "dmbase";
    public String url="jdbc:mysql://localhost/"+db;
    public String user="root";
    public String pass="";
    
    public ConexionMySQL()
    {
        
    }
    
    public Connection conectar()
    {
        Connection link=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            link=DriverManager.getConnection(this.url,this.user,this.pass);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
        
    }
    
}
