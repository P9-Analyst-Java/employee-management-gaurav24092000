<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>

	<style type="text/css">
	.error{
		color:red
	}
	</style>
	
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="dcd0ff">
	<h1 align="center">Welcome to Online Help Services</h1>
	<br>
	<form:form action="helloagain" modelAttribute="emp">
	
	Username: <form:input path="name"/>
		<form:errors path="name" cssClass="error"/><br>
	
	Contact Number: <form:input path="contactNumber"/>
		<form:errors path="contactNumber" cssClass="error"/><br>
	
	Email ID: <form:input path="email"/>
		<form:errors path="email" cssClass="error"/><br>
	
	Confirm Email ID: <form:input path="confirmEmail"/>
		<form:errors path="confirmEmail" cssClass="error"/><br>
	
	<form:checkbox path="agree" value="I agree"/>I agree<br>
		<form:errors path="agree" cssClass="error"/><br>
	
	<input type="submit" value="submit">
	
	</form:form>
</body>
</html>
