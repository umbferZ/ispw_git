<%@page import="dominio.User"%>
<%@page import="controllo.KUC_09"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Response.jsp</h1>
	<%
		int code = (int) Integer.parseInt(request.getParameter("struttura"));
		Date start = new Date(request.getParameter("start"));
		Date end = new Date(request.getParameter("end"));
		User user = new User();
		KUC_09 controller = new KUC_09(user);
		controller.addCarrello(start, end, code);
		/* out.print(controller.addCarrello(start, end, code)); */
	%>
</body>
</html>