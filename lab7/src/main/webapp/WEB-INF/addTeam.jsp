<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Team</title>
<!-- <link href="resources/styte.css" rel="stylesheet" type="text/css" /> -->
</head>
<body>
	<form:form modelAttribute="addteam" action="teams" method="post">
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
			
 			<form:select path="players">
				<c:forEach var="player" items="${players}">
					<option><c:out value="${player}" /></option>
				</c:forEach>
			</form:select> 
		</table>
		<input type="submit" />

	</form:form>
</body>
</html>