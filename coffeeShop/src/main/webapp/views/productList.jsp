<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of products</title>
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
	<h1>All products</h1>
	<table border=1>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Type</th>
			<sec:authorize access="hasAuthority('ADMIN')">
				<th>Operation</th>
			</sec:authorize>
			<th>Order</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.productName}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td>${product.productType}</td>
				<sec:authorize access="hasAuthority('ADMIN')">
					<td style="width: 100px"><a href="productList/${product.id}">
							edit </a><a href='/products/productList'
						onclick="deleteProduct(${product.id})">| delete</a></td>
				</sec:authorize>
				<td style="width: 200px">
					<form action="order/${product.id}/2">
						<input type="text" name="quantity" value="1" size="2" /> <input
							type="submit" value="order" />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
	<sec:authorize access="hasAuthority('ADMIN')">
		<a href="addProduct"> Add a product</a>
	</sec:authorize>
</body>
</html>