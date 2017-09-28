<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.search {
	height: 260px;
	width: 160px;
	position: absolute;
	top: 2cm;
	left: 1cm;
}

#header {
	background-color: #00FFFF;
	color: white;
	text-align: center;
	padding: 1px;
	height: 2em;
}

#nav {
	background-color: #FACC2E;
	left: 0;
}

div.link-list {
	width: 15em;
	position: absolute;
	top: 0;
	font-size: 80%;
	padding-left: 1%;
	padding-right: 1%;
	margin-left: 0;
	margin-right: 0;
}

#section {
	width: 600cm;
	float: left;
	
	width: 400px;
	padding: 10px;
	margin-left: 15em;
	
}

#footer {
	background-color: #00FFFF;
	color: white;
	clear: both;
	text-align: center;
	font: xx-large;
	height: 2em;
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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>PROFILE</title>
</head>
<body class="pro">
	<div id="header">
		<div style="float: right; font-size: x-large;">
			<a href="./logout"><font color="red">logout</font></a>
		</div>
		<div style="float: left; font-size: x-large;">
			<font color="red">USER : ${sessionScope.searched.username}</font>
		</div>
		<font color="black"
			style="font-style: italic; font-size: xx-large; font-family: fantasy;">

			Profile Page</font>
	</div>
	<c:if test="${empty sessionScope.searched }">
		<c:redirect url="login" />
	</c:if>

<div class="wrapper">
	<div id="nav" class="link-list">
		<form:form commandName="flightSearchDto">
			<fieldset class="search" title="SEARCH">
				<table>
					<tr>
						<td>Departure Location</td>
					</tr>
					<tr>
						<td><form:input path="depLoc" /></td>
					</tr>
					<tr>
						<td>Arrival Location</td>
					</tr>
					<tr>
						<td><form:input path="arrLoc" /></td>
					</tr>

					
					<tr>
						<td>Flight Date</td>
					</tr>
					<tr>
						
						<td><form:input path="travelDate" /></td>
					</tr>
					<tr>
						<td>Preference (f/d)</td>
					</tr>
					<tr>
						<td><form:select path="sortingPreference">
						<form:option value="f" label="FARE"></form:option>
						<form:option value="d" label="DURATION"></form:option>
						</form:select> </td>
						
					</tr>
					<tr>
						<td>Flight Class</td>
					</tr>
					<tr>
						<td><form:select path="flightClass">
						<form:option value="E" label="E"></form:option>
						<form:option value="B" label="B"></form:option>
						</form:select> </td>
					</tr>
					<tr>
						<td colspan="2" align="center"><form:button>Submit</form:button></td>
					</tr>
				</table>
			</fieldset>
		</form:form>
	</div>

	<br />
	<br />

	<div id="section">
		<c:if test="${!empty get}">
			<c:if test="${empty allFlights}">
				<h3>NO RESULTS !!! SORRY</h3>
			</c:if>

			<table border="2px" cellpadding="0" cellspacing="0" bgcolor="white"
				width="300px" >
				<tr>
					<th>FlightNO</th>
					<th>Arrival Location</th>
					<th>Departure Location</th>
					<th>Valid Till</th>
					<th>Flight Time</th>
					<th>Fare</th>
					<th>Seat Available</th>
					<th>Flight Class</th>
					<th>Flight Duration</th>
				</tr>
				<c:forEach items="${allFlights}" var="item">
					<tr>
						<td>${item.flightCode }</td>
						<td>${item.flightArrivalLocationCode }</td>
						<td>${item.flightDepartureLocationCode }</td>
						<td>${item.flightValidTill }</td>
						<td>${item.flightDepartureTime }</td>
						<td>${item.flightFare }</td>
						<td>${item.flightSeatAvailability }</td>
						<td>${item.flightTravelClass }</td>
						<td>${item.flightDuration }</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</div>
	<div id="footer">
		<font color="black"
			style="font-style: italic; font-size: x-large; font-family: fantasy;">
			FLIGHT SEARCH CORPORATION </font>
	</div>
</body>
</html>