
package onlineQuiz_Dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection 
{
     private static Connection conn= null;
       static
       {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-BMH1KMQ:1521/XE","onlinequiz","project");
            System.out.println("Connection opened successfully");
        }
        catch(ClassNotFoundException ex){
             ex.printStackTrace();
             System.exit(0);
        }
         catch(SQLException ex)
         {
         System.out.println("error in query string:"+ex.getMessage());
         ex.printStackTrace();
             
         }
        }
      
       public static void closeConnection()
       {
         try
         {
             if (conn!=null)
             conn.close();
            
         }  
         catch(SQLException ex)
         {
         System.out.println("error is:"+ex);
         ex.printStackTrace();
             
         }
       }
    
        public static Connection getConnection()
       {
           return conn;
       }
}

