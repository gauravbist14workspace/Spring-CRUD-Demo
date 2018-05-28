<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
	<h2>Students Data</h2>
	<form:form action="student.do" method="POST" commandName="student">
		<table>
			<tr>
				<td>Student Id</td>
				<td><form:input path="studentId" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastname" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="submit" name="action" value="Add" />
					<input type="submit" name="action" value="Edit" />
					<input type="submit" name="action" value="Delete" />
					<input type="submit" name="action" value="Search" /> 
				</td>
			</tr>
		</table>
	</form:form>
	
	<br>
	<table border="1">
		<th>Id</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Age</th>
		<c:foreach items="${studentList}" var="student">
			<tr>
				<td>${student.studentId}</td>
				<td>${student.firstname}</td>
				<td>${student.lastname}</td>
				<td>${student.age}</td>
			</tr>
		</c:foreach>
	</table>
</body>
</html>