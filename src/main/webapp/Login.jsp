<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body style="background-color: aquamarine;">
<h1 align="center">Login Form</h1>
	<br>
	<br>
	<div align="center">
	<form action="LoginRegister" method="post">
			<br>
			<br>
			<br>
			<br>
			<table
				style="height: 300px; width: 300px; background-color: skyblue; margin-left: 20px">
<tr>${message}</td>
<td></td>
</tr>
				<tr>
					<td>User Name :</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="Login"></td>
					<td><a href="Registration.jsp">Registration</a></td>
				</tr>
			</table>
	</form>
	</div>
</body>
</html>