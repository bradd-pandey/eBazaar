<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>shipping</title>
</head>
<body>
<h1>Shipping</h1>
Language :
	<a href="?language=en_US">English</a>|<a href="?language=ne_NP">Nepali</a><br><br>
<form:form modelAttribute="order" >
			<fieldset>
				<legend>Shipping Details</legend>
				
				<!-- <label for="street">Street:</label> -->
				 <spring:message code="shipping.street" text="default text" />
				<form:input id="street" path="shippingAddress.street" type="text" />
				<div style="text-align: center;">
					<form:errors path="shippingAddress.street" cssStyle="color : red;" />
				</div>
				
				<!-- <label for="city">City:</label> -->
				<spring:message code="shipping.city" text="default text" />
				<form:input id="city" path="shippingAddress.city" type="text" />
				<div style="text-align: center;">
					<form:errors path="shippingAddress.city" cssStyle="color : red;" />
				</div>
				
				<!-- <label for="state">State:</label> -->
				<spring:message code="shipping.state" text="default text" />
				<form:input id="state" path="shippingAddress.state" type="text" />
				<div style="text-align: center;">
					<form:errors path="shippingAddress.state" cssStyle="color : red;" />
				</div>
				
				<!-- <label  for="zipCode">Zip Code:</label> -->
				<spring:message code="shipping.zipcode" text="default text" />
				<form:input id="zipCode" path="shippingAddress.zipcode" type="text" />
				<div style="text-align: center;">
					<form:errors path="shippingAddress.zipcode" cssStyle="color : red;" />
				</div>
				
				<!-- <label for="country">Country:</label> -->
				<spring:message code="shipping.country" text="default text" />
				<form:input id="country" path="shippingAddress.country" type="text" /> 
				<div style="text-align: center;">
					<form:errors path="shippingAddress.country" cssStyle="color : red;" />
				</div>
				
				<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
				<!-- <button id="back" name="_eventId_backToCustomerDetails">Back</button> -->
						
				<input type="submit" id="btnAdd" value="Continue"  name="_eventId_shippingDetails"/>
				<button id="btnCancel" name="_eventId_cancel">Cancel</button>
				
			</fieldset>
		</form:form>
	
</body>
</html>
