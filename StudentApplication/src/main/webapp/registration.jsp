<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="/register">
	
		<pre>
		<input type="text" name="id"><br>
		<input type="text" name="name"><br>
		<input type="text" name="tech"><br>
		<input type="text" name="address"><br>
		<input type="submit" value="register">
		</pre>
		
	</form>
	
	${msg}
</body>
</html>