<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Starbuck's</title>
</head>
<body>
	<c:choose>
		<c:when test="${user eq null}">
			You'll need to Login to get Starbucks Advice!</br>

			<form action="login">
				<p>
					<input type="submit" value="Login" />
				</p>
			</form>
		</c:when>
		<c:otherwise>

			<h3>Hi ${user.name}, how are you today?</h3>

			<h2>Ask for advice about your favorite roast:</h2>

			<form action="${flowExecutionUrl}" method="post">
				<input type="hidden" name="_eventId" value="performAdviceList"> 
				<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
				<select name="roastKey">
					<option value="-">--Select Roast--</option>

					<c:forEach var="roast" items="${roasts}">
						<option value="${roast.key}">${roast.value}</option>
					</c:forEach>
				</select>


				<p>
					<input type="submit" value="Submit" />
				</p>
			</form>

			<!-- <form action="logout" method="post">
				<p>
					<input type="submit" value="Logout" />
				</p>
			</form> -->
			<form action="${flowExecutionUrl}" method="post">
				<button type="submit" id="logout" name="_eventId_logout">Logout</button>
			</form>
		</c:otherwise>
	</c:choose>


</body>
</html>