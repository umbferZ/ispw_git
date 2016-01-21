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
	<%
		String s = "";
		for (int i = 0; i < 10; i++) {
			s = "";
			s += "\n<div >";
			s += "<form id=\"addCarrello\" action=\"carrello.jsp\" method=\"post\">";
			s += "<span>Struttura " + i + ", prezzo: 100€ </span>";
			s += "<input type=\"hidden\" name=\"struttura\" value=\"" + i + "\">";
			s += "<label for=\"start\">start</label> <input type=\"date\" name=\"start\" id=\"start\" />";
			s += "<label for=\"end\">end</label> <input type=\"date\" name=\"end\" id=\"end\" /> ";
			s += "<input type=\"submit\" name=\"addCarrello\" value=\"aggiungi al carrello\"/>";
			s += "</form>";
			s += "</div>\n<br />";
			out.print(s);

		}
	%>
</body>
</html>