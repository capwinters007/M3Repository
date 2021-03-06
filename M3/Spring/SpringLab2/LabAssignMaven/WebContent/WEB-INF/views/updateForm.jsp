<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE  html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Spring MVC 5 form-handling</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquerry/3.4.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h3>Update data</h3>
		<br>
		<hr>
			<form:form action="saveTrainee" class="form-horizontal" method="post" modelAttribute="trainee">
				<div class="form-group">
					<label for="Id" class="col-md-3 control-label">Trainee ID:</label>
						<div class="col-md-5">
							<form:input path="id" class="form-control"/>
						</div>
				</div>
				<div class="form-group">
					<label for="Id" class="col-md-3 control-label">Trainee Name:</label>
						<div class="col-md-5">
							<form:input path="name" class="form-control"/>
						</div>
				</div>
				<div class="form-group">
					<label for="Id" class="col-md-3 control-label">Trainee Location:</label>
						<div class="col-md-5">
							<form:input path="location" class="form-control"/>
						</div>
				</div>
				<div class="form-group">
					<label for="Id" class="col-md-3 control-label">Trainee Domain:</label>
						<div class="col-md-5">
							<form:input path="domain" class="form-control"/>
						</div>
				</div>
				<div class="form-group">
					<div class="col-md-offset-3 col-md-9">
						<input type="submit" class="btn-btn-warning" value="Update"/>
					</div>
				</div>
			</form:form>
	</div>
</html>