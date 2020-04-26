<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE  html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquerry/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h3>Trainee Management System</h3>
		<br><br>
	</div>
	<div class="container" style="border-style: double;">
		<h4>Pick your operation</h4>
		<a href="management/addTrainee">Add a Trainee</a><br>
		<a href="management/deleteTrainee">Delete a Trainee</a><br>
		<a href="management/modifyTrainee">Modify a Trainee</a><br>
		<a href="management/retrieveTrainee">Retrieve a Trainee</a><br>
		<a href="management/showAllTrainee">Retrieve all Trainee</a><br>
	</div>
</body>
</html>