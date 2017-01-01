<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>products</title>
</head>
<body>

	<spring:url value="/product/addProduct" var="add" />
	<a href="${add}"><button style="margin: 15px">Add Product</button></a>

	<security:authorize access="isAuthenticated()">
		<p>Now, you are authorize to add products!</p>

		<form action="user" method="GET">
			Search User: <input type="text" name="firstName"
				placeholder="Enter First Name"> <input type="submit"
				value="Search">
		</form>

		<spring:url value="/doLogout" var="lg" />
		<a href="${lg}"><button style="margin: 15px">Logout</button></a>
	</security:authorize>

	<h1>Available Products</h1>

	<c:forEach items="${products}" var="product">
		<div style="float: left; padding: 20px">
			<img
				src="<c:url value="/resources/images/${product.productId}.png"/>"
				alt="image" style="width: 10%" />
			<h4>${product.name}</h4>
			<p>Description: ${product.description}</p>
			<p>Price: $ ${product.price}</p>
			<p>
				<a
					href=" <spring:url value="/product/productDetail?id=${product.productId}" /> ">
					<button>Details</button>
				</a>
			</p>
		</div>
	</c:forEach>

</body>
</html>