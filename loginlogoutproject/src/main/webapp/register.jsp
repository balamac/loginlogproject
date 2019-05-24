<%@ include file="index.jsp" %>  
<hr/>  
  
<h3>Register Form</h3>  
<%  
String failure_msg=(String)request.getAttribute("failure");  
if(failure_msg!=null){  
out.print(failure_msg);  
}  
 %>  
 <br/>  
 please enter the below details
<form action="register" method="get">  
UserId:<input type="text" name="userId"/><br/><br/>  
PassWord:<input type="password" name="passWord"/><br/><br/>  
<input type="submit" value="register"/>
</form>  