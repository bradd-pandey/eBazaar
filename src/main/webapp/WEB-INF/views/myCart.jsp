<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>my cart</title>
</head>
<body>
	<h1>My Cart</h1>
	<h4></h4>
	<table border="1">
		<tr>
			<th>Product</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Sub Total</th>
		</tr>
		<c:forEach items="${myCart.orderLineList}" var="orderLine">
			<tr>
				<td>${orderLine.product.name}</td>
				<td>${orderLine.quantity}</td>
				<td>${orderLine.product.price}</td>
				<td></td>
				<td><button onclick="removeProduct(${orderLine.productId}); return false;">Remove</button></td>
			</tr>
		</c:forEach>
		<tr><td colspan='3' align="right">Total Price</td><td>$120.0</td></tr>
	</table>
	<spring:url value="/orderFlow" var="url" />
 	<a href="${url}">Check out</a>
	
</body>
</html>