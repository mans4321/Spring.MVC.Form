<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
	<style >
		.error{color:red;}
	</style>
</head>

<body>


	<form:form action="processForm" modelAttribute="customer">
	
		First name: <form:input path="firstName" />
		<br><br>
		Last name:* <form:input path="lastName" />
		<form:errors path="lastName" cssCalss="error"></form:errors>
		<br><br>
		Free Passes:* <form:input path="freePass" />
		<form:errors path="freePass" cssCalss="error"></form:errors>
		<br><br>
		course Code:* <form:input path="courseCode" />
		<form:errors path="courseCode" cssCalss="error"></form:errors>
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
	
</body>
</html>