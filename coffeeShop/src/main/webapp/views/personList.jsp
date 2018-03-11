<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of persons</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="/resources/ajax.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/resources/styles.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<jsp:include page="/views/navigationBar.jsp" />
</head>
<body>
	<h1>All persons</h1>
	<table border=1>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Role</th>
			<th></th>
		</tr>
		<c:forEach var="person" items="${persons}">
			<tr>
				<td>${person.firstName}</td>
				<td>${person.lastName}</td>
				<td>${person.email}</td>
				<td>${person.phone}</td>
				<td>${person.role}</td>
				<td><a href="personList/${person.id}">edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<sec:authorize access ="hasAuthority('ADMIN')">
		<a href="addPerson"> Add a person</a>
	</sec:authorize>

</body>
</html>