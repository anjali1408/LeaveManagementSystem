<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD USER</title>
</head>
<body>
<h1>Add User</h1>
<form:form commandName="addUDto">
		<fieldset>
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
					<td align="center"><form:button name="addUserFinish" value="AddUserFinish">Register</form:button></td>
					<td align="center"><form:button name="cancelUserFinish" value="CancelUserFinish">Cancel</form:button></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>
</html>