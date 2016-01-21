<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<div>
		<form id="first" action="response.jsp" method="post">
		<input type="text" name="firstname" id="firstname" /> <label for="firstname">first name</label><br/>
		<input type="text" name="lastname" id="lastname" /> <label for="lastname">last name</label><br/>
		<input type="email" name="email" id="email" /> <label for="email">email</label><br/>
		<input type="password" name="password" id="password" /> <label for="password">password</label><br/>
		<input type="submit" name="submit" />
		</form>
	</div>
</body>
</html>