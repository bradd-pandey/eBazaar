<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%--@page errorPage="loginerror.jsp"--%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="${flowExecutionUrl}" method="post">
	
		<input type="hidden" name="_eventId" value="performLogin"> 
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
 
		<p>Login: </p>
		<p> Name : <input type="text" id="name" name="name" /></p>
		<p> Password : <input type="password" id="password" name="password" /></p>
		<p> <input type="submit" value="Submit" /> </p>
	</form>
</body>
</html>