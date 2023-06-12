/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package onlineQuiz_Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import onlineQuiz_Dto.UserDetail;
import onlineQuiz_dao.Registration_dao;


public class RegistrationControllerServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd=null;
        UserDetail user= new UserDetail();
        user.setId(request.getParameter("id"));
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));   
         try
        {
         boolean result=false,userfound=false;
         if(!Registration_dao.searchUser(user.getId()))
         {
             result=Registration_dao.regesterUser(user);
         }
         else
         {
           userfound=true;  
         }
         request.setAttribute("result", result);
         request.setAttribute("userfound", userfound);
         request.setAttribute("username", user.getUsername());
         rd=request.getRequestDispatcher("registrationresponse.jsp");
        }
        catch(SQLException ex)
        {
          ex.printStackTrace();
          request.setAttribute("Exception", ex);
          rd=request.getRequestDispatcher("showexception.jsp");

        }
        finally
        {
            rd.forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
