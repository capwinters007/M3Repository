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
		<h3 style="text-align: center;">Enter Trainee Details</h3>
		<hr>
	</div>
	<div>
		<form:form class="form-horizontal" method="post" action="saveTrainee" modelAttribute="trainee">
			<form:hidden path="id"/>
			
				<div class="form-group">
					<label for="Id" class="col-md-3 control-label">Trainee ID:</label>
						<div class="col-md-5">
							<form:input path="id" class="form-control"/>
						</div>
				</div>
				
				<div class="form-group">
					<label for="Name" class="col-md-3 control-label">Trainee Name:</label>
						<div class="col-md-5">
							<form:input path="name" class="form-control"/>
						</div>
				</div>
				
				<div class="form-group">
					<label for="Location" class="col-md-3 control-label">Trainee Location:</label>
					<div class="col-md-5">
						<form:radiobutton path="location" value="Chennai"/> Chennai
						<form:radiobutton path="location" value="Bangalore"/> Bangalore
						<form:radiobutton path="location" value="Pune"/> Pune
						<form:radiobutton path="location" value="Mumbai"/> Mumbai
					</div>
				</div>
				
				<div class="form-group">
					<label for="Domain" class="col-md-3 control-label">Trainee Domain:</label>
					<div class="col-md-5">
						<form:select class="form-control" path="domain">
							<form:option value="JEE left-shift" label="JEE"/>
							<form:option value="ADAPT" label="ADAPT"/>
							<form:option value="Internship" label="Internship"/>
						</form:select> 
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-md-offset-5 col-md-9">
						<form:button class="btn btn-primary" onclick="Insertion successfull">Submit</form:button>
					</div>
				</div>
		</form:form>
	</div>
</body>
</html>