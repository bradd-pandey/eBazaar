<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<spring:url value="/product" var="show" />
	<a href="${show}"><button>Go to Products</button></a>

	<spring:url value="/userinput" var="user" />
	<a href="${user}"><button>Register User</button></a>

	<security:authorize access="isAnonymous()">
		<spring:url value="/login" var="ur" />
		<a href="${ur}"><button>Login</button></a>
	</security:authorize>

	<h1>e-Bazaar</h1>
	<p>The evolution continues ..</p>
	<br>
	<div>
		<h5>Triple P Members:</h5>
		<p>Pandey Bharat</p>
		<p>Pandeya Govinda</p>
		<p>Pramita Dhakal</p>
		<br> <br>
	</div>
	
	<div>
	<p><strong>
	© Triple P </strong><br>
	into the @CodeWorld ;
	</p>
	</div>

</body>
</html>
