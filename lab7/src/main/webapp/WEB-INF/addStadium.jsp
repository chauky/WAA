<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Stadium</title>
</head>
<body>
	<form:form modelAttribute="stadium" action="stadiums" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" name="state" /></td>
			</tr>
<%-- 			<form:select>
				<c:forEach var="match" items="${matches}">
					<option><c:out value="${match}" /></option>
				</c:forEach>
			</form:select> --%>

		</table>
		<input type="submit" />

	</form:form>
</body>
</html>