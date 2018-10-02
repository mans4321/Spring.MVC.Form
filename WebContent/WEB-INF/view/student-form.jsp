<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country : <form:select path="country" >
				
				  <form:options items="${student.countryOption}" />
				  
				</form:select>
	
		<br><br>
		
		Favorite Language:
				<form:radiobutton path="favoriteLanguage" value="Java"/> Java
				<form:radiobutton path="favoriteLanguage" value="Python"/>Python
				<form:radiobutton path="favoriteLanguage" value="C#"/> C#
				<form:radiobutton path="favoriteLanguage" value="JavaScript"/> JavaScript
		<br><br>
			
		Operating System:
				<form:checkbox path="operatingSystem" value="IOS"/> IOS
				<form:checkbox path="operatingSystem" value="Windows"/>Windows
				<form:checkbox path="operatingSystem" value="Lnuix"/> Lnuix

		<br><br>
		
		<input type="submit" value="Submit" />
	</form:form>

</body>

</html>












