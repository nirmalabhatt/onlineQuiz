function addQuestions(){
    swal("Admin","Redirecting to add questions page!","success").then(value=>{
        window.location="addQuestionJSP.jsp";
        
    });
}
function editQuestions(){
    swal("Admin","Redirecting to edit Questions page!","success").then(value=>{
        window.location="editQuestions.jsp";
        
    });
}
function viewPerformance(){
    swal("Admin","Redirecting to view Performance page!","success").then(value=>{
        window.location="ViewPerformance.jsp";
        
    });
}
function deleteUser(){
    swal("Admin","Redirecting to Delete user  page!","success").then(value=>{
        window.location="DeleteUser.jsp";
        
    });
}


