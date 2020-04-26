<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
    <form:form action="deleteFromDB/${trainee.id }" modelAttribute="trainee" method="get">
	<div class="container">
	<h3>Confirm delete</h3>
	</div>
	<div class="container">
	
		<table class="table table-bordered" style="text-align: center;">
			<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>
			<tr>
				<td>${trainee.id}</td>
				<td>${trainee.name}</td>
				<td>${trainee.location}</td>
				<td>${trainee.domain}</td>
			</tr>
		</table><br>
		<div class="form-group">
			<div class="col-md-offset-3 col-md-9">
			<input type="submit" class="btn-btn-warning" value="Delete"/>
			</div>
		</div>
		</div>
	</form:form>
	
</body>
</html>