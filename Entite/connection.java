/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Boubacar
 */
public class connection {
      public static void main(String[] args) {      
    try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/megecbase","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from compte");  
while(rs.next())  {
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"   "+rs.getDate(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));  
}

 String requette="INSERT INTO `megecbase`.`compte` (`Nom`, `Prenoms`, `Date_naissance`, `ville`, `adresse`, `login`, `motdepasse`) VALUES ('Bah', 'Ousmane danbelé', '2018-06-30', 'Fès', 'marché', 'totocar', 'oumra');";
stmt.executeUpdate(requette);


  // the mysql insert statement
     /* String query = " insert into users (`Nom`, `Prenoms`, `Date_naissance`, `ville`, `adresse`, `login`, `motdepasse`)"
        + " values (?, ?, ?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, "9");
      preparedStmt.setString(2, "Rubble");
      preparedStmt.setString(3, "1988-02-23");
      preparedStmt.setString(4, "rees");
      preparedStmt.setString (5, "zert");
      preparedStmt.setString(7, "ert");
      preparedStmt.setString(8, "5248");

      // execute the preparedstatement
      preparedStmt.execute();*/

con.close();  
}catch(Exception e){ System.out.println(e);}  
}  

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

