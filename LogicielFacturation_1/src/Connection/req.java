/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import Connection.connection;
import com.mysql.cj.xdevapi.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class req {
        Statement stListe;
	connection maconnexion = new connection();
  public req(){
       String requeteListe = " select activites.Niveau,equipet ,nom_elv,pren from activites,activite_pratiques,eleve \n where \n eleve.num_elv=activite_pratiques.num_elv \n and \n activites.Niveau = activite_pratiques.niveau ";
      try{
          
          stListe = (Statement) maconnexion.etablirconnection().createStatement();
      }catch(SQLException ex){
	           JOptionPane.showMessageDialog(null, "Aucun Element trouvé Merci");
	        }
              }
}



