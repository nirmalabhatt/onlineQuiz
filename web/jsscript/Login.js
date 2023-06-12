let id,password;
 function connectUser()
{
    id=$("#id").val();
    
    password=$("#password").val();
    console.log(id);
    console.log(password);
    if(validateEmptyString()){
     let data={ id:id,password:password}; 
     let xhr=$.post("LoginControllerServlet",data,
         function (responseText,textResponse, jqXHR){
             if(responseText.trim() === "error"){
                 swal("error!!", "please enter userid/password","error");
             }else if(responseText.trim().indexOf("jsessionid") !== -1){
                // alert("login success");
              swal("Good job!", "Login Success!", "success");
                 window.location = responseText.trim();
             }
         });
         xhr.fail(handleError);
   }
}
function validateEmptyString(){
    if(id === "" || password === "" ){
        swal("Error!","All field are mandatory","error");
        return false;
    }
    return true;
}

function handleError(xhr){
        swal("Error!","problem in server communication"+xhr.statusText,"error");
       
    }
   