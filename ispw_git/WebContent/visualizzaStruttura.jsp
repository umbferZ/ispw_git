<%@page import="dominio.*"%>
<%@page import="controllo.KUC_09"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		int code = (int) Integer.parseInt(request.getParameter("struttura"));
		String start = request.getParameter("start");
		String end = request.getParameter("end");
	%>
	<h1>
		Dettagli struttura <%=code %>
	</h1>
	<pre>Inizio prenotazione: <%=start %> </pre>
	<pre>Fine prenotazione: <%=end %> </pre>
	<form action="carrello.jsp" method="post" name="addCarrello">
		<input type="hidden" name="struttura" value="<%=code%>" /> 
		<input type="hidden" name="start" value="<%=start%>" /> 
		<input type="hidden" name="end" value="<%=end%>" /> 
		<input type="submit" name="addCarrello" value="Aggiungi al carrello" />
	</form>

</body>
</html>