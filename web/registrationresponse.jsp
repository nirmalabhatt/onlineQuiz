<%-- 
    Document   : registrationresponse
    Created on : May 30, 2023, 9:09:29 AM
    Author     : Nirmala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    boolean result=(boolean)request.getAttribute("result");
      boolean userfound=(boolean)request.getAttribute("userfound");
      if(userfound==true)
      out.println("uap");
      else if(result==true)
      out.println("success");
      else
      out.println("error");
  
%>