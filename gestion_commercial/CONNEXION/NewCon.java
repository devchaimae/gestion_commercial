package gestion_commercial.CONNEXION;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



/**
 *
 * @author didiy
 */
public class NewCon {
     private static Connection instance;
  private static  Statement stmt;  
   
       

public NewCon() {

}  
 public static Statement getStatement() { 
      try{
     stmt = (Statement) NewCon.instance.createStatement();
     
     }
     catch(Exception e)
{ 
    
    System.out.println(e);
    System.exit(0);
} 
      
      return stmt;
 }

public static Connection getInstance() {

if (instance == null) {
    try{
  Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Driver O.K.");

      String url = "jdbc:mysql://localhost:3306/megecbase";
      String user = "root";
      String passwd = "";

     instance = (Connection) DriverManager.getConnection(url, user, passwd);
      System.out.println("Connexion effective !");   

 
}
catch(Exception e)
{ System.out.println(e);
}  


}

return instance;

}


}