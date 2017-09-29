<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN</title>
<style type="text/css">
#footer {
	background-color: #00FFFF;
	color: white;
	clear: both;
	text-align: center;
	font: xx-large;
	height: 2em;
}

#header {
	background-color: #00FFFF;
	color: white;
	text-align: center;
	padding: 1px;
	height: 5em;
}

.wrapper {
	min-height: 100%;
	height: auto !important;
	height: 100%;
	margin: 0 auto -4em;
}

html, body {
	height: 100%;
	margin: 0;
}

#section {
	height: 2cm;
	width: 32cm;
	background-color: red;
}

iframe {
	display: block; /* iframes are inline by default */
	height: 100vh; /* Viewport-relative units */
	width: 100vw;
}
</style>
</head>
<body>

	<div id="header">
		<div style="float: right; font-size: x-large;">
			<a href="./logout"><font color="red">logout</font></a>
		</div>
		<div style="float: left; font-size: x-large;">
			<font color="red">USER : ${sessionScope.searched.userId}</font>
		</div>
		<h1 align="center">
			<font color="black">ADMIN PAGE</font>
		</h1>
	</div>

	<c:if test="${empty sessionScope.searched }">
		<c:redirect url="login" />
	</c:if>

	<div class="wrapper">
		<table bgcolor=#58FAF4 width="100%" border="0" cellpadding="0"
			cellspacing="0" style="font-size: large;">
			<tr>
				<td align="center"><a href="ahome" target="fContent">HOME</a></td>
				<td align="center"><a href="aflight" target="fContent">LEAVE</a></td>
				<td align="center"><a href="auser" target="fContent">USERS</a></td>
			</tr>
		</table>
		<iframe name="fContent" frameborder="0" scrolling="yes">
		WELCOME TO ADMIN PORTAL</iframe>
	</div>
	<div id="footer">
		<font color="black"
			style="font-style: italic; font-size: x-large; font-family: fantasy;">LEAVE MANAGEMENT SYSTEM </font>
	</div>
</body>
</html>