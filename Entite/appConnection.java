/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Boubacar
 */
public class appConnection {
   private static String url = "jdbc:mysql://localhost:3306/megecbase";
  private static String user = "root";
  private static String passwd = "";
  private static Connection connect;
   
  public static Connection getInstance(){
    if(connect == null){
      try {
        connect = DriverManager.getConnection(url, user, passwd);
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }      
    return connect;  
}
}
