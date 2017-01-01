<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<title>cancel</title>
</head>
<body>
	<section>
		<h1>Check out cancelled ..</h1>
		<p>Your Check out process cancelled! Go to products to continue shopping..</p>
	</section>

	<section>
		<p>
			<spring:url value="/welcome" var="url" />
 			<a href="${url}"><button >Products</button></a>
		</p>
	</section>
</body>
</html>
