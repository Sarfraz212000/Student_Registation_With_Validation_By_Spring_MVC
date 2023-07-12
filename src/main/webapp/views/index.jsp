<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<div align="center">

		<form:form action="register" method="POST" modelAttribute="student">
			<table border="1" cellpadding="5">
				<caption>
					<h2>Register Form</h2>
				</caption>
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
					<td><form:errors path="name" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Department:</td>
					<td><form:input path="depart" /></td>
					<td><form:errors path="depart" cssClass="error"></form:errors> </td>
				</tr>

				<tr>
					<td>Email:</td>
					<td><form:input path="email" /></td>
					<td><form:errors path="email" cssClass="error"></form:errors> </td>
					
				</tr>

				<tr>
					<td>Course:</td>
					<td><form:input path="course" /></td>
					<td><form:errors path="course" cssClass="error"></form:errors> </td>
				</tr>

				<tr>
					<td>Phone No:</td>
					<td><form:input path="phno" /></td>
					<td><form:errors path="phno" cssClass="error"></form:errors> </td>
				</tr>

			</table>
			<br>
			<td><input type="submit" value="register"></td>


		</form:form>

	</div>
</body>
</html>