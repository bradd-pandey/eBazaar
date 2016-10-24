<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Good choice, ${user.name}!</h3>

	<h2>Starbuck's ${roast} Roast Coffees:</h2>


	<table>
		<c:forEach var="coffee" items="${roastList}" varStatus="status">
			<c:choose>
				<c:when test="${(status.index)%2 eq 0}">
					<tr style="background-color: cyan">
				</c:when>
				<c:otherwise>
					<tr style="background-color: yellow">
				</c:otherwise>
			</c:choose>
			<td>${coffee}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="${flowExecutionUrl}" method="post">
		<button type="submit" id="back" name="_eventId_back">Back</button>
	</form>
</body>
</html>