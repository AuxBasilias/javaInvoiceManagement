/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
    	Connection con; 
	public connection()
	{
		try {
                        String url = "jdbc:mysql://localhost:3306/ebs_bd";
                        String user = "root";
                        String password = ""; 
			con=DriverManager.getConnection(url,user,password);
                        if (con!=null) {
                            System.out.println("connection établie");
                    }
			
		
		} catch (SQLException e) {
			
		
			System.out.println("Base de donnee introuvable");
		}}
               /* finally {
            if (con != null) {
                try {
                      con.close();
                    } 
                catch (SQLException ex) {
                        ex.printStackTrace();
                                          }
                            }
                           }
	}*/
	public Connection etablirconnection() {
		return con;
	}
        public static void main(String args[]){
            connection conn = new connection();
            conn.etablirconnection();
        }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//Sealed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!