<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	e-Bazaar
</h1>
<h4>into the @CodeWorld ;</h4><br><br>

<div>
<h3>Triple P Members:</h3>
<h4>Pandey Bharat</h4>
<h4>Pandeya Govinda</h4>
<h4>Pramita Dhakal</h4><br><br>
</div>

 <spring:url value="/orderFlow" var="url" />
 <a href="${url}">Login</a>

<P>Time Check: ${serverTime}</P>
</body>
</html>
