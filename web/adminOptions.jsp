<%-- 
    Document   : adminOptions
    Created on : Jun 7, 2023, 11:28:34 AM
    Author     : Nirmala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="jsscript/adminOption.js"></script>
         <script src="jsscript/jquery.js"></script>
         <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
         <link rel="stylesheet" href="stylesheet/admin.css">
        <title>Admin Options Page</title>
    </head>
    <body>
        <%
            String id = (String) session.getAttribute("id");
            if(id == null){
                response.sendRedirect("accessdenied.html");
                return;   
            }
            out.println("<div class='subcandidate'><h1>Admin Options Page</h1></div><br><br>"+
             "<div class='logout'><a href ='Login.html'>Logout</a></div>"+ 
                    "<div class='container'>"+
                    "<div class='box'>"+
                        "<div id='dv1' onclick='addQuestions()'>"+
                        "<img src='images/bckg10.jpg' height='255px' width='255px'/>"+
                        "<h4>Set Questions</h4></div>"+
                        "<div id='dv2' onclick='editQuestions()'>"+
                        "<img src='images/bckg.jpg' height='255px' width='255px'/>"+
                        "<h4>Edit Questions </h4></div> "+
                        "<div id='dv3' onclick='viewPerformance()'>"+
                        "<img src='images/bckg6.jpg' height='255px' width='255px'/>"+
                        "<h4>View Performance</h4></div>"+
                        "<div id='dv4' onclick='deleteUser()'>"+
                        "<img src='images/bckg2.png' height='255px' width='255px'/>"+
                        "<h4>Delete user</h4></div> "+
                    "</div>"+
                    "<br><br><div align='center' id ='result'></div>"+
                    "</div>");
            %>
        
    </body>
</html>
