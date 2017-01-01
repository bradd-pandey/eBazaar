
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Registration</title>
</head>
<body>


	<h1>User Registration</h1>

	<form:form commandName="user" action="user_save" method="post">

		<legend>Registration</legend>


		<p>
			<label for="firstName">First Name: </label>
			<form:input path="firstName" />
			<form:errors path="firstName" cssStyle="color : red;" />

		</p>
		<p>
			<label for="lastName">Last Name: </label>
			<form:input path="lastName" />
			<form:errors path="lastName" cssStyle="color : red;" />


		</p>
		<p>
			<label for="userName">User Name: </label>
			<form:input path="login.userName" />
			<form:errors path="login.userName" cssStyle="color : red;" />

		</p>

		<p>
			<label for="password">Password: </label>
			<form:input path="login.password" type="password" />
			<form:errors path="login.password" cssStyle="color : red;" />

		</p>

		<p>
			<label for="confirmPassword">Confirm Password: </label>
			<form:input path="login.confirmPassword" type="password" />
			<form:errors path="login.password" cssStyle="color : red;" />
		</p>

		<p>
			<label for="email">Email: </label>
			<form:input path="email" type="email" />
			<form:errors path="email" cssStyle="color : red;" />
		</p>

		<p>Gender
		<p>
			<form:select path="gender">
				<form:option value="" label="Select Gender" />
				<form:option value="male" label="Male" />
				<form:option value="female" label="Female" />
			</form:select>
			<form:errors path="gender" cssStyle="color : red; " />
		<p id="buttons"></p>
		<p>
			phone:
			<form:input path="phone.area" />
			<form:errors path="phone.area" cssStyle="color : red;" />
			<form:input path="phone.prefix" id="zipCode" />
			<form:errors path="phone.prefix" cssStyle="color : red; " />
			<form:input path="phone.number" />
			<form:errors path="phone.number" cssStyle="color : red; " />
		</p>
		
		<p>
			<input id="submit" type="submit" value="Register" />
		</p>

	</form:form>

</body>
</html>
