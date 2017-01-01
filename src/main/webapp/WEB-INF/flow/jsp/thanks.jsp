<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>thanks</title>
</head>
<body>
	<section>
		<h1>Thank you!</h1>
		
	</section>
	<h4>Thanks for shopping with us. Have a good day!</h4>
	<section>
		
		<p>
			<spring:url value="/product/showProduct" var="url" />
			<a href="${url}"><button>Back to products</button></a>
		</p>
	</section>
</body>
</html>
