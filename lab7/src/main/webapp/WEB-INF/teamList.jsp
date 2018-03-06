<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of teams currently </title>
</head>
<body>
	<h1>teams currently in the shop</h1>
	<table>
		<c:forEach var="team" items="${teams}">
			<tr>
				<td>${team.name}</td>
				<td>${team.city}</td>
				<td>${team.mascot}</td>
				<td><select>
						<c:forEach var="player" items="${team.players}">
							<option><c:out value="${player}" /></option>
						</c:forEach>
				</select></td>
				<td>${team.homeUniform}</td>
				<td>${team.visitUniform}</td>
				<td><select>
						<c:forEach var="home" items="${team.matchesAsHome}">
							<option><c:out value="${home}" /></option>
						</c:forEach>
				</select></td>
				<td><select>
						<c:forEach var="vistor" items="${team.matchesAsVisitor}">
							<option><c:out value="${visitor}" /></option>
						</c:forEach>
				</select></td>
				<td><a href="teams/${team.teamKey}">edit</a></td>
			</tr>
		</c:forEach>
	</table>

	<a href="addTeam"> Add a team</a>

</body>
</html>