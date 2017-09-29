<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.editfield {
	height: 2.5in;
	width: 6in;
}
</style>
<title>EDIT USER</title>
</head>
<body>
<H1>EDIT USER</H1>
<form:form commandName="editUDto">
		<fieldset class="editfield">
			<table bordercolor="red" width="auto" align="center">
				<tr align="center">
					<th>ATTRIBUTES</th>
					
					<th>INSERT NEW</th>
				</tr>
				<tr align="center">
					<td>User ID</td>
					<td><form:input path="uid" readonly="true"/></td>
				</tr>
				<tr align="center">
					<td>Name</td>
					
					<td><form:input path="name" /></td>
				</tr>
				<tr align="center">
					<td>Username</td>
					
					<td><form:input path="username" /></td>
				</tr>
				<tr align="center">
					<td>Password</td>
					
					<td><form:input path="password" /></td>
				</tr>
				<tr align="center">
					<td align="center"><form:button name="completeUEditing" value="CompleteUEditing">Submit</form:button></td>
					<td align="center"><form:button name="cancelUEditing" value="CancelUEditing">Cancel</form:button></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>
</html>