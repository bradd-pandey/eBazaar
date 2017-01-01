<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>payment</title>
</head>
<body>
<h1>Payment Details</h1>

<form:form modelAttribute="order" >
			<fieldset>
				<legend>Payment Details</legend>
				
			<%-- 	<form:select path="cardType">
   					<form:option value="" label="--- Select ---"/>
   						<form:option value="credit" label="Credit Card"/>
   						<form:option value="debit" label="Debit Card"/>
				</form:select>--%>
				
				<label for="cardNumber" >Card Number: </label>
				<form:input id="cardNumber" path="cardNumber" type="text" /> 
				<div style="text-align: center;">
					<form:errors path="cardNumber" cssStyle="color : red;" />
				</div>
				
				<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
				<button id="back" name="_eventId_backToshippingDetails">Back</button>
						
				<input type="submit" id="btnAdd" value="Continue"  name="_eventId_paymentDetails"/>
				<button id="btnCancel" name="_eventId_cancel">Cancel</button>
				
			</fieldset>
		</form:form>
	
</body>
</html>
