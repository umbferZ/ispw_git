<%@page import="dominio.User"%>
<%@page import="controllo.KUC_09"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Pagamenti</h1>
	<%
		User user = (User) session.getAttribute("user");
		KUC_09 kuc = new KUC_09(user);
		kuc.generaListaPagamenti();
		out.print("ho generatio la lista dei pagamenti");
	%>

</body>
</html>