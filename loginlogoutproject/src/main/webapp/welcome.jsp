<html>
<body>
<%  
String profile_msg=(String)request.getAttribute("firstname");  
if(profile_msg!=null){  
out.print("welcome "+profile_msg+" you are successfully logged in");  
}  
 %> 
</body>
</html>
