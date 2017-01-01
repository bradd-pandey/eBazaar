
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>user details</title>
</head>
<body>

<form:form>
	
    <h3>User Summary:</h3>
    
        <p>
        First Name: ${user.firstName}<br/>
        Last Name: ${user.lastName}<br/>        
        Gender: ${user.gender}<br/>
         </p>
 </form:form>       
 <spring:url value="/product/showProduct" var="url2" />
 	<a href="${url2}"><button >Products</button></a>
       
</body>
</html>