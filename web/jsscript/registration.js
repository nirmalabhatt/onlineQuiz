
let id,username,password,cpassword;
function addUser()
{
    id=$("#id").val();
    username=$("#username").val();
    password=$("#password").val();
    cpassword=$("#cpassword").val();
    if(validateUser())
    {
      if(password!==cpassword) 
      {
      // swal("Error!","password not match","error");
      alert("password not match");
        return ;     
      }
      else
      {
         let data={
             id:id,
              username:username,
              password:password
          }; 
          let xhr=$.post("RegistrationControllerServlet",data,processresponse);
         xhr.fail(handleError);
      }
    }   
}
function processresponse(responseText,textStatus,xhr)
{
  let str= responseText.trim();
  if(str==="success")
  {
   swal("success!","Registrarion done!! you can now login","success");
   alert("registration done");
   setTimeout(redirectUser,2000);
  }
  else if(str==="uap")  
   // swal("Error!","Id is Already present","error");
       alert("Id already exist");
else
    //swal("Error!","Registration faild! try again","error");
alert("registration faild");
    }
function handleError(xhr){
        //swal("Error!","problem in server communication"+xhr.statusText,"error");
        alert("problem in server communication");
}
function validateUser()
{
    if(id===""||username===""||password===""||cpassword==="")
    {
       // swal("Error!","Please fill data in all the fields","error");
       alert("please fill the data fild");
        return false;    
    }return true;   
}
function redirectUser(){
    window.location="Login.html";
}