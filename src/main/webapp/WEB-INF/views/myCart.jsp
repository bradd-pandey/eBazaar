<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>my cart</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/cart.js"/>"></script>
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
				<td>${orderLine.getSubTotal()}</td>
				<td><button onclick="removeProduct(${orderLine.productId}); return false;">Remove</button></td>
			</tr>
		</c:forEach>
		<tr><td colspan='3' align="center">Total Price</td><td>$ ${myCart.getTotalPrice()}</td></tr>
	</table><br>
	<spring:url value="/product/showProduct" var="url2" />
 	<a href="${url2}"><button >Add More Product</button></a>
 	<spring:url value="/orderFlow" var="url3" />
 	<a href="${url3}"><button >Check out</button></a>	
 	
	
</body>
</html>