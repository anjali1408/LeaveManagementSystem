<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<c:url var="loginAction" value="/login"></c:url>
	<form:form action="${loginAction}" commandName="user">
		<table align="center">
			<tr>
				<td colspan=2><h1 style="text-align: center; color: red;">WELCOME
						TO LEAVE MANAGEMENT SYSTEM</h1></td>
			</tr>
			<tr>
				<td colspan=2><h1 style="text-align: center; color: green;">Login</h1></td>
			</tr>
			<tr>
				<td style="text-align: center; color: purple;"><form:label
						path="userId">
						<spring:message text="UserID" />
					</form:label></td>
				<td style="text-align: center;"><form:input path="userId" /></td>
			</tr>
			<tr>
				<td style="text-align: center; color: purple;"><form:label
						path="password">
						<spring:message text="Password" />
					</form:label></td>
				<td style="text-align: center;"><form:input type="password"
						path="password" /></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td colspan=2 align="center"><input type="submit"
					value="<spring:message text="Login"/>" /></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td colspan=2 align="center">${errorMessage}</td>
			</tr>
		</table>
	</form:form>
</body>
</html>