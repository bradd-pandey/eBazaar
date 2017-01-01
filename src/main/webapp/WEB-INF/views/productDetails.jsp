<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/cart.js"/>"></script>
<title>Products</title>
</head>
<body>
	<h1>Product Details</h1>
	<p>
		<strong>Product ID : </strong>${product.productId}
	</p>
	<p>
		<strong>Name : </strong>${product.name}
	</p>
	<p>
		<strong>Description : </strong>${product.description}
	</p>

	<p>
		<strong>Price : </strong>$ ${product.price}
	</p>
	<p>
		<strong>Manufacturer :</strong> ${product.manufacturer}
	</p>
	<p>
		<strong>Category :</strong> ${product.category.categoryName}
	</p>
	<p>
		<strong>Available units in stock: </strong> ${product.unitsInStock}
	</p>

	<p>
		<spring:url value="/product/showProduct" var="url" />
		<a href="${url}"><button>Back</button></a>
		
		<button onclick="askQuantity(${product.productId}); return false;">Order Now</button>
			<a href="<spring:url value="/order/showCart"/>"> <button>Show Cart</button> </a>	
	</p>

	<!-- ajax part -->

	<div id="pQuantity" style="display: none;">
		<form id="quantityForm">
			Please enter quantity: <input id="quantity" type="text" name="quantity" value="1" /> 
			<input id="productId" type="hidden" name="productId" />
			<button onclick="ajaxCall(); return false;">Add to Cart</button>
		</form>
	</div>

</body>
</html>