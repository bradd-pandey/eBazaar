<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Login Page</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/ajax1.js"/>"></script>

</head>

<body>

	<h2>Login with Username and Password</h2>

	<form action="<spring:url value="/postLogin"></spring:url>"
		method="post">

		<p>
			<label for="userName"> User Name : </label> <input type="text"
				name="userName" id="userName" value="" />
		</p>

		<p>
			<label for="password"> Password: </label> <input id="password"
				name="password" type="password" />
		</p>
		<input type="submit" value="Login" />

	</form>

</body>
</html>
