<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
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
			<div class="col-4"></div>
			<div class="col-4">
				<br />
				<h2>
					<a href="${pageContext.request.contextPath}/teacherForm">back</a>
					${title}
				</h2>
				<br />
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<tr>
							<c:forEach var="u" items="${teachers}">
								<tr>
									<td scope="row">${u.teachId}</td>
									<td>${u.firstName}</td>
									<td>${u.lastName}</td>
									<td>
										<a href="deleteTeacher/${u.teachId}">delete</a>|
										<a href="editTeacher/${u.teachId}">edit</a>
									</td>
								</tr>
							</c:forEach>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-4"></div>
		</div>
	</div>
</body>
</html>