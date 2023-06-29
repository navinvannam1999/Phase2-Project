<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>User Registeration Form</h3>

	<form method="post" action="/spring-app/user/details">
		<table>
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="fName" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lName" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add User" /></td>
			</tr>
		</table>
	</form>

</body>
</html>