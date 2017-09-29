<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>aUSER</title>
<style type="text/css">
.back {
	background-color: #CEF6F5;
}

#container {
	width: 15cm;
	height: 5cm;
	background-color: white;
}
</style>
</head>
<body class="back">
	<h1 align="center">ADMIN USER</h1>
	<a href="adduser">ADD NEW USER</a>
	<div>
		<table border="5px" cellpadding="0" cellspacing="0" bgcolor="white"
			bordercolor="red" title="Users" width="auto">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>Email/User Id</th>
				
			</tr>
			<c:forEach items="${adminUsers}" var="item">
				<tr align="center">
					<td>${item.id }</td>
					<td>${item.name }</td>
					<td>${item.userId }</td>
					
					<td><a href="edituser?user_id=${item.id}">Edit</a><a href="deleteuser?user_id=${item.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>