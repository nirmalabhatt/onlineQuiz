/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineQuiz_dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import onlineQuiz_Dbutil.DBconnection;
import onlineQuiz_Dto.UserDTO;

/**
 *
 * @author Nirmala
 */
public class UserDAO {
     private static PreparedStatement ps;
    static
    {
        try{
            ps= DBconnection.getConnection().prepareStatement("Select usertype from userdetail where id=? and password=?");
            
        }catch(SQLException ex)
        {
           ex.printStackTrace();
        }  
    }
    public static String validteUser(UserDTO user)throws SQLException
    {
       ps.setString(1, user.getId());
       ps.setString(2, user.getPassword());
       ResultSet rs= ps.executeQuery();
       if(rs.next())
           return rs.getString(1);
       return null;
       
    }
    
}
