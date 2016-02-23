<%@ page import="bean.EventsBean"%><%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 21/02/16
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	EventsBean myBean = (EventsBean) session.getAttribute("Bean");
	if (myBean == null) {
%>
<%
	} else {
%>
<jsp:include page="includes/header.jsp" />
<br>
<div class="container">
	<h5 style="color: slategray">Riepilogo dati Evento:</h5>
	<br>
	<p style="color: slategray">Nome:</p>
	<%=request.getParameter("name")%>
	<br>
	<p style="color: slategray">Descrizione:</p>
	<%=request.getParameter("descrizione")%>
	<br>
	<p style="color: slategray">Luogo:</p>
	<%=request.getParameter("luogo")%>
	<br>
	<p style="color: slategray">Orario:</p>
	<%=request.getParameter("orario")%>
	<br>
	<p style="color: slategray">Data:</p>
	<%=request.getParameter("data")%>
	<br> <br>
	<hr>
	<br> <br>
	<form method="get" action="UCEventi02EventoInserito.jsp">
		<button class="btn waves-effect waves-light" type="submit" name="action">Conferma
			inserimento Evento</button>
	</form>
	<br>
	<form method="get" action="UCEventi00InserisciEvento.jsp">
		<button class="btn waves-effect waves-light" type="submit" name="action">Torna
			indietro</button>
	</form>
	<br>
</div>
<%
	}
%>
<jsp:include page="includes/footer.jsp" />