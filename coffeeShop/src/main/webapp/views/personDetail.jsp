<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a person</title>
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
	<form action="/persons/updatePerson" method="POST">
		<h1>Add/Update a person</h1>
		<table cellspacing="50">
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName"
					value="${person.firstName}" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName"
					value="${person.lastName}" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" value="${person.email}" />
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password"
					value="${person.password}" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" value="${person.phone}" /></td>
			</tr>
			<tr>
				<td>Role:</td>
				<td><input type="text" name="role" value="${person.role}" /></td>
			</tr>
		</table>
		<!-- 	<input type="hidden" name="_csrf" value="<your_csrf_token>" /> -->
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> <input type="submit" value="update" />
	</form>
</body>
</html>