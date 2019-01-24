<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
  <script type="text/javascript">
  </script>
  <body>
  <form action="">
  请输入你的姓名:<input name="uname" id="name"type="text"/>
  <input name="tijiao" type="submit" value="确定"/>
  <p style="color: red;"><s:property value="content"/></p>
  <p style="color: blue">${content}</p>
   </form>
  </body>
</html>
