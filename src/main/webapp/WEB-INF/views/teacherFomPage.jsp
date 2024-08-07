<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>assess</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body style="padding: 0; margin: 0; background-color: #e7e7e7">
	<div class="container-fluid">
		<div class="row">
			<%@ include file="headerPage.jsp"%>
		</div>
		<div class="row">
		<div class="col-4">
		</div>
			<div class="col-4">
			<br/>
			<h2>New Teacher Registration</h2>
			<br/>
			<div>
			<form action="addTeacher" method="post">
					<div class="mb-3 row">
						<label for="staticEmail" class="col-sm-2 col-form-label">First Name</label>
						<div class="col-sm-10">
							<input type="text"  class="form-control"
								id="staticEmail" name="firstName">
						</div>
					</div>
					<div class="mb-3 row">
						<label for="inputPassword" class="col-sm-2 col-form-label">Last Name</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputPassword" name="lastName">
						</div>
					</div>
					<div>
						<div class="col-sm-10">
							<input type="submit" class="btn btn-primary" value="submit">
						</div>
					</div>
				</form>
			</div>
			</div>
					<div class="col-4">
		</div>
		</div>
	</div>
</body>
</html>