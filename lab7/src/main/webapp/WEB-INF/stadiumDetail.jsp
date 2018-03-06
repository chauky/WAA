<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stadium</title>
</head>
<body>
	<form action="../stadiums/${stadium.stadiumKey}" method="post">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" value="${stadium.name}" /> </td>
		</tr>
		<tr>
			<td>City:</td>
			<td><input type="text" name="city" value="${stadium.city}" /> </td>
		</tr>
		<tr>
			<td>State:</td>
			<td><input type="text" name="state" value="${stadium.state}" /> </td>
		</tr>
	</table>
	<input type="submit" value="update"/>
	</form>
	<form action="delete?stadiumKey=${stadium.stadiumKey}" method="post">
		<button type="submit">Delete</button>
	</form>
</body>
</html>