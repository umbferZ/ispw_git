<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	<div style="background-color: #00ffff">lista struttura</div>

	<%
		String s = "";
		for (int i = 0; i < 10; i++) {
			s = "";
			s += "<div style=\"background-color: #00ff00\">";
			s += "<form id=\"addCarrello\" action=\"addCarrello.jsp\" method=\"post\">";
			s += "<div>Struttura " + i + ", prezzo: 100€</div>";
			s += "<input type=\"hidden\" name=\"struttura\" value=\"" + i + "\">";
			s += "<input type=\"date\" name=\"start\" id=\"start\" /> <label for=\"start\">start</label>";
			s += "<input type=\"date\" name=\"end\" id=\"end\" /> <label for=\"end\">end</label>";
			s += "<input type=\"submit\" name=\"addCarrello\" value=\"aggiungi al carrello\"/>";
			s += "</form>";
			s += "</div>";
			System.out.println(s);
			out.print(s);

		}
	%>

</body>
</html>