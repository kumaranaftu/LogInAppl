<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</br></br></br>
<%String usrName= (String)request.getAttribute("username");%>
<div align="center" style="color:#00FF00">
 <h1>Hi <%=usrName %> You have successfully logged in....</h1>
 </div>
</body>
</html>