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
		<%@ include file="headerPage.jsp" %>
		</div>
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4" style="padding: 30px; text-align: center">
				<div
					style="background-color: white; height: 400px; width: 500px; padding: 20px; border-radius: 10px 120px/120px; box-shadow: 0 3px 10px rgb(0 0 0/ 0.2);">
					<h2 style="color: #046a78">Login</h2>
					<form action="login" method="POST">
						<p><%="Welcome dear user"%></p>
						<div class="mb-3">
							<label class="form-label">Username</label> <input type="text"
								name="username" class="form-control" style="text-align: center">
						</div>
						<div class="mb-3">
							<label class="form-label">Password</label> <input type="password"
								name="password" class="form-control" style="text-align: center">
						</div>
						<div class="d-grid gap-2">
							<button class="btn btn-primary" type="submit"
								style="background-color: #046a78; border: 0px">Submit</button>
							<p>Or</p>
							<p>
								<a href="register" class="link-primary"
									style="color: #046a78; border: 0px">create account</a> 
							</p>
						</div>
					</form>
				</div>
			</div>
			<div class="col-4"></div>
		</div>
	</div>
</body>
</html>