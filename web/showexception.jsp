l<%-- 
    Document   : showexception
    Created on : May 30, 2023, 9:35:18 AM
    Author     : Nirmala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Exception ex= (Exception)request.getAttribute("Exception");
    System.out.println("Exception is :"+ex);
    out.println("some Exception occured"+ex.getMessage());
%>