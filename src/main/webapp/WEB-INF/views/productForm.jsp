<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product form</title>
</head>
<body>

	<h1>Add new Product</h1>
	<form:form modelAttribute="newProduct" enctype="multipart/form-data">
		<p>
			Product ID:
			<form:input id="productId" path="productId" type="text" />
			<form:errors path="productId" cssStyle="color : red;" />
		</p>

		<p>
			Product Name:
			<form:input id="productName" path="name" type="text" />
			<form:errors path="name" cssStyle="color : red;" />
		</p>

		<p>
			Unit Price:
			<form:input id="price" path="price" type="text" />
		</p>

		<p>
			Description:
			<form:textarea id="description" path="description" rows="2" />
		</p>

		<p>
			Manufacturer:
			<form:input id="manufacturer" path="manufacturer" type="text" />
			<form:errors path="manufacturer" cssStyle="color : red;" />
		</p>

		<p>
			Category:
			<form:select id="category" path="category.categoryName">
				<form:option value="0" label="--Select Category" />
				<form:options items="${categories}" itemLabel="categoryName"
					itemValue="categoryName" />
			</form:select>
		</p>

		<p>
			Stock Units:
			<form:input id="unitsInStock" path="unitsInStock" type="text" />
		</p>

		<p>
			Order Units:
			<form:input id="unitsInOrder" path="unitsInOrder" type="text" />
		</p>

		<p>
			Image:
			<form:input id="productImage" path="productImage" type="file" />
		</p>

		<p>
			<input type="submit" id="btnAdd" value="Add Product" />
		</p>

	</form:form>
	<p>
		<spring:url value="/product" var="show" />
		<a href="${show}"><button>Cancel</button></a>
	</p>

</body>
</html>