
package onlineQuiz_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import onlineQuiz_Dbutil.DBconnection;
import onlineQuiz_Dto.QuestionDTO;
import onlineQuiz_Dto.QuestionStore;

public class QuestionDao {
     private static PreparedStatement ps,ps1;
    static
    {
        try{
            ps= DBconnection.getConnection().prepareStatement("insert into questions values(?,?,?,?,?,?,?,?)");
            ps1= DBconnection.getConnection().prepareStatement("select count(*)from questions");

            
        }catch(SQLException ex)
        {
           ex.printStackTrace();
        } 
    }
     public static String getExamId()throws SQLException
    {
       ResultSet rs= ps1.executeQuery();
        rs.next();
        return "SB"+(100+rs.getInt(1)+1); 
    }
     public static void addQuestions(QuestionStore qstore)throws SQLException
    {
         ArrayList <QuestionDTO> questionsList=qstore.getAlluestions();
         for(QuestionDTO q:questionsList){
             ps.setString(1, q.getSubid());
             ps.setString(2, q.getSubject());
             ps.setString(3, q.getQuestion());
             ps.setString(5, q.getAns1());
             ps.setString(6, q.getAns2());
             ps.setString(7, q.getAns3());
             ps.setString(8, q.getAns4());
             ps.setString(9, q.getCorrectsns());
              ps.executeUpdate();
            }
    }
}