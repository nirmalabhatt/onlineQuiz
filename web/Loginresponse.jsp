<%-- 
    Document   : Loginresponse
    Created on : May 31, 2023, 9:20:59 PM
    Author     : Nirmala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String id=(String)request.getAttribute("id");
    String result=(String)request.getAttribute("result");
    if(id!=null && result!=null)
    {
    HttpSession sess=request.getSession();
    sess.setAttribute("id", id);
    String url="";
    if(result.equalsIgnoreCase("Admin"))
    {
        url="AdminOptionServlet;jsessionid="+sess.getId();
    }
    else
    {
        url="UserOptionServlet;jsessionid="+sess.getId();

    }
    out.println(url);
}
else
{
out.println("error");
}
    
    %>
