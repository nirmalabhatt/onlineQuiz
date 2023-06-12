<%-- 
    Document   : addQuestionJSP
    Created on : Jun 9, 2023, 1:11:11 PM
    Author     : Nirmala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Question</title>
    <link rel="stylesheet" type="text/css" href="stylesheet/addPaper.css">
</head>
<body>
     <%
            String id = (String) session.getAttribute("id");
            if(id == null){
                response.sendRedirect("accessdenied.html");
                return;   
            }%>
    <h1>Add Question</h1>
    <form action="AddQuestionServlet" method="post">
        <label for="subId">Subject ID:</label>
        <input type="text" id="subId" name="subId" required><br>

        <label for="subject">Subject:</label>
        <input type="text" id="subject" name="subject" required><br>

        <label for="question">Question:</label>
        <textarea id="question" name="question" required></textarea><br>

        <label for="option1">Option 1:</label>
        <input type="text" id="option1" name="option1" required><br>

        <label for="option2">Option 2:</label>
        <input type="text" id="option2" name="option2" required><br>

        <label for="option3">Option 3:</label>
        <input type="text" id="option3" name="option3" required><br>

        <label for="option4">Option 4:</label>
        <input type="text" id="option4" name="option4" required><br>

        <label for="correctOption">Correct Option:</label>
        <select id="correctOption" name="correctOption" required>
            <option value="option1">Option 1</option>
            <option value="option2">Option 2</option>
            <option value="option3">Option 3</option>
            <option value="option4">Option 4</option>
        </select><br>

        <input type="button" value="Next" onclick="onNextButtonClick()">
        <input type="button" value="Cancel" onclick="window.location.href='adminOptions.jsp'">
        <input type="button" value="Done" onclick="onDoneButtonClick()">

    </form>
</body>
</html>

