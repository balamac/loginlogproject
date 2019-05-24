<%@ include file="index.jsp" %>  
<hr/>  
  
<h3>Login Form</h3>  
<%  
String profile_msg=(String)request.getAttribute("message");  
if(profile_msg!=null){  
out.print(profile_msg);  
}  
String success_msg=(String)request.getAttribute("success");  
if(success_msg!=null){  
out.print(success_msg);  
} 
 
 %>  
 <br/>  
<form action="loginProcess" method="post">  
UserId:<input type="text" name="userId"/><br/><br/>  
PassWord:<input type="password" name="passWord"/><br/><br/>  
<input type="submit" value="login"/>
</form>  