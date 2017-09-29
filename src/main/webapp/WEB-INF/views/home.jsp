<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.login {
	height: 5em;
	width: 75em;
	left:13cm;
}

.font-style {
	font-family: Papyrus, fantasy;
	color: #1619E0;
	font-size: 25px;
	font-weight: normal;
	font-style: italic;
	text-align: center;
}

#header {
	background-color: #00FFFF;
	color: white;
	text-align: center;
	margin-top: 0;
}

#section {
	float: left;
	height: 100%;
}

html, body {
	height: 100%;
	margin: 0;
}

.wrapper {
	min-height: 100%;
	height: auto !important;
	height: 100%;
	margin: 0 auto -4em;
}

#footer {
	background-color: #00FFFF;
	color: #2EFEF7;
	clear: both;
	text-align: center;
	font: xx-large;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
</head>
<body>
	<div class="wrapper">
		<div id="header">
			<h1 align="center">
				<font color="black"
					style="font-style: italic; font-size: x-large; font-family: fantasy;">Welcome
					to Flight Portal</font>
			</h1>
		</div>

		<div class="login" id="section" align="center">
			<a href="./login"><font class="font-style">LOGIN</font></a>
			<a href="./register"><font class="font-style">SIGN UP</font></a>
		</div>
	</div>
	<div id="footer">
		<font color="black"
			style="font-style: italic; font-size: x-large; font-family: fantasy;">
			FLIGHT SEARCH </font>
	</div>
</body>
</html>