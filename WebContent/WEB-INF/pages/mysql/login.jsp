<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录注册页面</title>
  </head>
  <body >
         <form action="LoginServlet"  method="post"  style="padding-top:-700px;">
		用户名：<input type="text" name="name"value=""><br><br>
 		密码：  <input type="password" name="pwd"value=""><br><br>
	                <input type="submit"value="登录"name="login"><input type="reset"value="重置"><br>
	 </form>
	 <form action="/pages?view=/mysql/register">
	 	<input type="submit"value="新用户注册">
         </form>
    
  </body>
</html>