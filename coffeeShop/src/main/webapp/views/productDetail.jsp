<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a product</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<jsp:include page="/views/navigationBar.jsp" />
</head>
<body>
	<form action="/products/updateProduct" method="POST">
		<h1>Add a product</h1>
		<table cellspacing="50">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="productName"
					value="${product.productName}" /></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><input type="text" name="description"
					value="${product.description}" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price" value="${product.price}" />
				</td>
			</tr>

			<tr>
				<td>Type:</td>
				<td><input type="text" name="productType"
					value="${product.productType}" /></td>
			</tr>
		</table>
		<!-- 	<input type="hidden" name="_csrf" value="<your_csrf_token>" /> -->
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> <input type="submit" value="update" />
	</form>

</body>
</html>