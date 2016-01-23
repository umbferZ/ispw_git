<%@page import="dominio.*"%>
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
	<h1>Carrello</h1>
	<%
		User user = (User) session.getAttribute("user");
		if (request.getParameter("addCarrello") != null) {
			int code = (int) Integer.parseInt(request.getParameter("struttura"));
			Date start = new Date(request.getParameter("start"));
			Date end = new Date(request.getParameter("end"));
			KUC_09 controller = new KUC_09(user);
			controller.addCarrello(start, end, code);
	%>
	<h1><%=user.getName()%></h1>
	<pre> nel tuo carrello sono presenti: <%=user.getCarrello().getListPrenotazioni().size()%> prenotaizoni	</pre>
	<%
		for (int i = 0; i < user.getCarrello().getListPrenotazioni().size(); i++) {
				out.print("<pre>");
				out.print("nome della struttura: "
						+ user.getCarrello().getListPrenotazioni().get(i).getStruttura().getName() + "\n");
				out.print("costo della struttura: "
						+ user.getCarrello().getListPrenotazioni().get(i).getCosto().getValore() + "\n");
				out.print("</pre>");
			}
		}
	%>
	<form action="pagamenti.jsp" method="post">
		<input type="submit" value="Procedi al pagamento" name="pay" />
	</form>
</body>
</html>