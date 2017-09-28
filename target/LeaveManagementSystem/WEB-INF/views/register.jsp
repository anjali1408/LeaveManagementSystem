<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
	.fie{
	width: 20%;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Register Page</h1>
	<form:form commandName="registerUser">
		<fieldset class="fie">
			<table>
				<tr>
					<td>Name</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><form:input path="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
				<td>Privilege</td>
				<td>
				<form:select path="uPrivilege">
				<form:option value="general" label="GENERAL"></form:option>
				<form:option value="admin" label="ADMIN"></form:option>
				</form:select>
				</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><form:button>Register</form:button></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>
</html>