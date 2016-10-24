<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/cart.js"/>"></script>
</head>
<body>

	<table>
		<tr>
			<th>Product</th>
			<th>Price</th>
			<th></th>
		</tr>
		<c:forEach items="${pList}" var="p">
			<tr>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td><button onclick="askQuantity(${p.id}); return false;">Add to cart</button></td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	<!-- ajax part -->
	<div id="pQuantity" style="display: none;">
		<form id="quantityForm" >
			Please enter quantity: 
			<input id="quantity" type="text" name="quantity" />
			<input id="productId" type="hidden" name="productId" />			
			<button onclick="ajaxCall(); return false;">Continue</button>
		</form>
	</div>

</body>
</html>