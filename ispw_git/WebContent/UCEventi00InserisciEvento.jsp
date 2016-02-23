<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 21/02/16
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="includes/header.jsp" />
<%
	if (request.getParameter("action") != null) {
%>
<jsp:useBean id="eventsBean" class="bean.EventsBean" scope="session" />
<jsp:setProperty name="eventsBean" property="*" />
<%
	session.setAttribute("Bean", eventsBean);
%>
<%--<jsp:forward page="UCPagamento02RiepilogoDati.jsp"/>--%>
<%
	}
%>
<br>
<div class="container">
	<br>
	<h5 style="color: slategray">Inserisci i tuoi dati dell'Evento:</h5>
	<br>
	<form class="col s12" action="UCEventi01RiepilogoDatiEvento.jsp" method="post">
		<br>
		<div class="row">
			<div class="input-field col s6">
				<input placeholder="Nome dell'evento" name="name" id="name" type="text"
					class="validate">
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<input placeholder="Descrizione" name="descrizione" id="descrizione"
					type="text" class="validate">
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<input placeholder="Luogo" name="luogo" id="luogo" type="text"
					class="validate">
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<input placeholder="Orario" name="orario" id="orario" type="text"
					class="validate">
			</div>
		</div>
		<div class="row">
			<div class="input-field col s6">
				<input placeholder="Data" name="data" id="data" type="date" class="validate">
			</div>
		</div>
		<br>
		<button class="btn waves-effect waves-light" type="submit" name="action"
			value="conferma">Inserisci Evento</button>
	</form>
	<br>
	<form class="col s12" action="index.jsp" method="post">
		<button class="btn waves-effect waves-light" type="submit" name="action">Torna
			indietro</button>
	</form>
</div>
<br>
<jsp:include page="includes/footer.jsp" />
