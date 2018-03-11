<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of orders</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="/resources/ajax.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/styles.css">
<jsp:include page="/views/navigationBar.jsp" />
</head>
<body>
	<h1>All orders can be seen under Admin role</h1>
	<sec:authorize access="hasAuthority('ADMIN')">
		<table border=1>
			<tr>
				<th>Date</th>
				<th>Name</th>
				<th>Product</th>
				<th>Quantity</th>
			</tr>
			<c:forEach var="order" items="${orders}">
				<tr>
					<td>${order.orderDate}</td>
					<td>N${order.person.firstName} ${order.person.lastName}</td>
					<c:forEach var="orderLine" items="${order.orderLines}">
						<td>${orderLine.product.productName}</td>
						<td>${orderLine.quantity}</td>
					</c:forEach>
				</tr>
			</c:forEach>
		</table>
	</sec:authorize>

	<!-- <a href="addOrder"> Add a order</a> -->

</body>
</html>