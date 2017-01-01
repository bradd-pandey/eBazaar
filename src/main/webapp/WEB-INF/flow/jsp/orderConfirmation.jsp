<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>confirmation</title>
</head>

<body>

	<h1>Order Confirmation</h1>
	<form:form modelAttribute="order" >
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />

		 
		<div>
			<div>
				<address><strong>Shipping Address:</strong> <br>
					
					${order.shippingAddress.street} <br>
					${order.shippingAddress.state}
					,${order.shippingAddress.zipcode} <br>
					${order.shippingAddress.country} <br>
				</address>
			</div>
			<h4>Order Summary:</h4>
			<table border="1">
				<thead>
					<tr>
						<th>Product</th>
						<th>Quantity</th>
						<th>Rate</th>
						<th>Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="cartItem" items="${order.orderLineList}">
						<tr>
							<td><em>${cartItem.product.name}</em></td>
							<td style="text-align: center">${cartItem.quantity}</td>
							<td>${cartItem.product.price}</td>
							<td>${cartItem.getSubTotal()}</td>
						</tr>
					</c:forEach> 
					<tr><td colspan='3' align="center">Total Price</td><td>$ ${order.getTotalPrice()}</td></tr>

					
				</tbody>
				</table><br>
			
			<button id="back" name="_eventId_backToPaymentDetails">Back</button>

			<button type="submit" name="_eventId_orderConfirmation">Confirm</button>
			<button id="btnCancel" name="_eventId_cancel">Cancel</button>
		</div>

	</form:form>

</body>
</html>
