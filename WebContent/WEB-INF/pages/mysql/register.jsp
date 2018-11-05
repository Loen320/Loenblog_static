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
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'BB.jsp' starting page</title>
  </head>
  <body >
  <form action="RegisterServlet"method="post" style="padding-top:-700px;">
	   输入用户名:<input name="name" type="text"><br><br>
	   输入密码:<input name="pwd" type="password"><br><br>
	   选择性别:<input type="radio"name="sex"value="男"checked>男
	        <input type="radio"name="sex"value="女">女<br><br>
	   选择家乡:
	   <select name="home">
		   <option value="上海">上海</option>
		   <option value="北京" selected>北京</option>
		   <option value="纽约">纽约</option>
   		</select><br>
               填写个人信息:<br>
	   <textarea name="info" row="5"cols="30"></textarea><br>
	   <input type="reset"value="重置"><input type="submit"value="注册">
   </form>
  </body>
</html>