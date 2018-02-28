<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String str1 = request.getParameter("txtNum1");
		String str2 = request.getParameter("txtNum2");
		String str3 = request.getParameter("txtNum4");
		String str4 = request.getParameter("txtNum5");
		Integer num1 = !str1.equals("") ? Integer.parseInt(str1) : 0;
		Integer num2 = !str2.equals("") ? Integer.parseInt(str2) : 0;
		Integer num3 = !str3.equals("") ? Integer.parseInt(str3) : 0;
		Integer num4 = !str4.equals("") ? Integer.parseInt(str4) : 0;
	%>
	<input type="text" value=<%=num1%>> + 
	<input type="text" value=<%=num2%>>= 
	<input type="text" value=<%=String.valueOf(num1 + num2)%>>
	<br>
	<br>
	<input type="text" value=<%=num3%>> * 
	<input type="text" value=<%=num4%>> = 
	<input type="text" value=<%=String.valueOf(num3 * num4)%>>
	<br>
	<br>
</body>
</html>