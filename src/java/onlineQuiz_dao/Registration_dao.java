
package onlineQuiz_dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import onlineQuiz_Dbutil.DBconnection;
import onlineQuiz_Dto.UserDetail;

public class Registration_dao 
{
    private static PreparedStatement ps,ps1;
    static
    {
        try{
            ps= DBconnection.getConnection().prepareStatement("Select * from userdetail where id=?");
            ps1= DBconnection.getConnection().prepareStatement("insert into userdetail values(?,?,?,?)");
            
        }catch(SQLException ex)
        {
           ex.printStackTrace();
        }  
    }
    public static boolean searchUser(String id)throws SQLException
    {
        ps.setString(1, id);
        return ps.executeQuery().next();
    }
    public static boolean regesterUser(UserDetail user)throws SQLException
    {
        ps1.setString(1, user.getId());
        ps1.setString(2, user.getUsername());
        ps1.setString(3, user.getPassword());
        ps1.setString(4, "student");
        return ps1.executeUpdate()==1;
        
    }
    
}
