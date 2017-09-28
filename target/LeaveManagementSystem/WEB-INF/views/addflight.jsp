<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD FLIGHT</title>
</head>
<body>
	<h1>Add Flight</h1>
	<form:form commandName="addFDto">
		<fieldset>
			<table bordercolor="red" width="auto" align="center">
				<tr align="center">
					<th>ATTRIBUTES</th>
					<th>INSERT NEW</th>
				</tr>
				<tr align="center">
					<td>Flight Code</td>
					<td><form:input path="newFCode" /></td>
				</tr>
				<tr align="center">
					<td>Flight AirLines</td>
					<td><form:input path="newFAirLines" /></td>
				</tr>
				<tr align="center">
					<td>Departure Location</td>
					<td><form:input path="newFDepLocCode" /></td>
				</tr>
				<tr align="center">
					<td>Arrival Location</td>
					<td><form:input path="newFArrLocCode" /></td>
				</tr>
				<tr align="center">
					<td>Departure Time</td>
					<td><form:input path="newFDepTime" /></td>
				</tr>
				<tr align="center">
					<td>Duration</td>
					<td><form:input path="newFDur" /></td>
				</tr>
				<tr align="center">
					<td>Fare</td>
					<td><form:input path="newFFare" /></td>
				</tr>
				<tr align="center">
					<td>Travel Class</td>
					<td><form:input path="newFClass" /></td>
				</tr>
				<tr align="center">
					<td>Seat Availaibility</td>
					<td><form:input path="newFSeatAvail" /></td>
				</tr>
				<tr align="center">
					<td>Valid Till Date</td>
					<td><form:input path="newFValidTill" /></td>
				</tr>

				<tr align="center">
					<td align="center"><form:button name="addFlightFinish" value="AddFlightFinish">Submit</form:button></td>
					<td align="center"><form:button name="cancelFlightFinish" value="CancelFlightFinish">Cancel</form:button></td>
				</tr>
			</table>
		</fieldset>
	</form:form>
</body>
</html>