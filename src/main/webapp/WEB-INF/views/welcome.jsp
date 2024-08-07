<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 style="">Welcome Page</h2>
	<img alt="ds" src="/files/Spring-MVC-Framework-Control-flow-Diagram.png"/>" />
	<table class="table" border="1">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Full Name</th>
				<th scope="col">Username</th>
				<th scope="col">Password</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody class="table-group-divider">
			<tr>
				<c:forEach var="u" items="${users}">
					<tr>
						<td scope="row">${u.id}</td>
						<td>${u.fullName}</td>
						<td>${u.username}</td>
						<td>${u.password}</td>
						<td>
							<a href="delete/${u.id}">delete</a>
						</td>
					</tr>
				</c:forEach>
			</tr>
		</tbody>
	</table>
</body>
</html>

