<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>aFLIGHT</title>
<style type="text/css">
.back {
	background-color: #CEF6F5;
}

#container {
}
</style>
</head>
<body class="back">
	<h1 align="center">ADMIN FLIGHT</h1>
	<a href="addflight">ADD NEW FLIGHT</a>
	<div id="container">
		
		<table border="5px" cellpadding="0" cellspacing="0" bgcolor="white"
			width="auto" bordercolor="red">
			<tr>
				<th>FlightId</th>
				<th>FlightCode</th>
				<th>Departure Location</th>
				<th>Arrival Location</th>
				<th>Valid Till</th>
				<th>Flight Time</th>
				<th>Fare</th>
				<th>Seat Available</th>
				<th>Flight Class</th>
				<th>Flight Duration</th>
				<th>OPERATIONS</th>
			</tr>
			<c:forEach items="${adminFlights}" var="item">
				<tr align="center">
					<td>${item.id }</td>
					<td>${item.flightCode }</td>
					<td>${item.flightArrivalLocationCode }</td>
					<td>${item.flightDepartureLocationCode }</td>
					<td>${item.flightValidTill }</td>
					<td>${item.flightDepartureTime }</td>
					<td>${item.flightFare }</td>
					<td>${item.flightSeatAvailability }</td>
					<td>${item.flightTravelClass }</td>
					<td>${item.flightDuration }</td>
					<td><a href="editflight?flight_id=${item.id}">-Edit-</a><a href="deleteflight?flight_id=${item.id}">-Delete-</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>