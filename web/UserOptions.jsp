<%-- 
    Document   : UserOptions
    Created on : Jun 8, 2023, 1:49:46 PM
    Author     : Nirmala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jsscript/UserOption.js"></script>
         <script src="jsscript/jquery.js"></script>
         <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
         <link rel="stylesheet" href="stylesheet/admin.css">
        <title> user Options page</title>
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
                    "<div id='dv1' onclick='playQuiz()'><h4>start to play </h4> <img src='images/bckg10.jpg' height='255px' width='255px'/>"+
                    "<div id='dv2' onclick='Quizchallange()'><h4>Start Quiz challange</h4> <img src='images/bckg7.jpg' height='255px' width='255px'/>"+
                    "<br><br><div align='center' id ='result'></div>"+
                    "</div>");
            %>
    </body>
</html>
