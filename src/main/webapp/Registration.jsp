<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body style="background-color: aquamarine;">
<h1 align="center">Registration Form</h1>
<div align="center">
<form action="LoginRegister" method="post">
		
			<br>
			<br>
			<br>
			<br>
			<table
				style="height: 300px; width: 300px; background-color: skyblue; margin-left: 20px">

				<tr>
					<td>User Name :</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" id="text" name="email"></td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td><input type="text" id="mobileNumber" name="mobileNumber"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="Register"></td>
					<td></td>
				</tr>
			</table>
	</form>
</div>
</body>
</html>