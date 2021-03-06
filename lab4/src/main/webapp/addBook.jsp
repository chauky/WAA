<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Book</title>
<link href="resources/styte.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form:form modelAttribute="book" action="books" method="post">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
<%-- 			<tr>
				<td>Title:</td>
				<td><form:input path="title" /></td>
				<td><form:errors path="make" cssClass="error"/></td>
			</tr> --%>
			<tr>
				<td>ISBN:</td>
				<td><input type="text" name="isbn" /></td>
			</tr>
			<tr>
				<td>Author:</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price" /></td>
			</tr>
		</table>
		<input type="submit" />

	</form:form>
</body>
</html>