<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body style="text-align: center; margin-top: 100">
  <h1>欢迎来到大表锅测试主页</h1>
  <form action="${pageContext.request.contextPath }/user/userLogin.action" method="get">
    <h1>
    	用户名：<input name="username" type="text">
    </h1>
    <h1>
    	密     码：<input name="password" type="password">
    </h1>
    
    <button type="reset"><h3>清空</h3></button>
    <button type="submit"  style="margin-left: 100"><h3>登录</h3></button>
    
    </form>
  </body>
</html>
