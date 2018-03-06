<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stadiums currently</title>
</head>
<body>
	<h1>Stadiums currently in the shop</h1>
	<table>
	<c:forEach var="stadium" items="${stadiums}">
	<tr>
		<td>${stadium.name}</td>
		<td>${stadium.city}</td>
		<td>${stadium.state}</td>
		<td><a href="stadiums/${stadium.stadiumKey}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	

		<a href="addstadium"> Add a stadium</a> 

</body>
</html>