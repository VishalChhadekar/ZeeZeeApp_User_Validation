<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<centre>
	<h1>ZEE ZEE Web Portal</h1>
	<sf:form action="/submitlogin" method="post" modelAttribute="login">
		<table border="2">

			<tr>
				<td>UserName</td>
				<td><sf:input path="userName" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><sf:password path="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" name="submit" /></td>
				<td><input type="reset" value="cancel"></td>

			</tr>

		</table>


	</sf:form> </centre>
</body>
</html>