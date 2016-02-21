<%@ page import="bean.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%
    BeanGestioneStrutture myBean = (BeanGestioneStrutture) session.getAttribute("Bean");
    if (myBean == null) {
%>
<h4>bean not found!</h4>
<%
    } else if (myBean instanceof BeanGestioneAlberghi) {
%>

<jsp:include page="/includes/header.jsp" />

<br>

<div class="container">
	<h5 style="color: slategray">Riepilogo dati:</h5>
	<h6>dati generali:</h6>
	<br>
	<br> <br>
	<form method="POST" action="strutturaRegistrata.jsp">
		<p>
			Nome albergo:
			<%=request.getParameter("nome")%></p>
		<p>
			Numero di stelle:
			<%=request.getParameter("stelle")%></p>
		<p>
			Regione:
			<%=request.getParameter("regione")%></p>
		<p>
			Città:
			<%=request.getParameter("citta")%></p>
		<p>
			Comune:
			<%=request.getParameter("comune")%></p>
		<p>
			Via:
			<%=request.getParameter("via")%></p>
		<p>
			Numero civico:
			<%=request.getParameter("numCivic")%></p>
		<p>
			CAP:
			<%=request.getParameter("CAP")%></p>
		<p>
			Descrizione (breve testo):
			<%=request.getParameter("descrizione")%></p>

		<h6>Divisione camere e i prezzi:</h6>
		<br>
		<br>
		<p>
			Numero camere singole:
			<%=request.getParameter("numSingole")%>
			Prezzo camere singole:
			<%=request.getParameter("prezzoSingole")%></p>
		<p>
			Numero camere matrimoniali:
			<%=request.getParameter("numMatrimoniali")%>
			Prezzo camere matrimoniali:
			<%=request.getParameter("prezzoMatrimoniali")%></p>
		<p>
			Numero camere Triple:
			<%=request.getParameter("numTriple")%>
			Prezzo camere triple:
			<%=request.getParameter("prezzoTriple")%></p>
		<br>


		<button class="btn waves-effect waves-light" type="submit"
			name="action">Procedi alla registrazione</button>
	</form>

	<br>

	<form method="POST" action="formRegistrazioneAlbergo.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Indietro</button>
	</form>

	<br>

</div>

<jsp:include page="/includes/footer.jsp" />
<%
    } else if (myBean instanceof BeanGestioneResidence) {
%>
<jsp:include page="/includes/header.jsp" />

<br>

<div class="container">
	<h5 style="color: slategray">Riepilogo dati:</h5>
	<h6>dati generali:</h6>
	<br>
	<br> <br>
	<form method="POST" action="strutturaRegistrata.jsp">
		<p>
			Nome albergo:
			<%=request.getParameter("nome")%></p>
		<p>
			Numero di stelle:
			<%=request.getParameter("stelle")%></p>
		<p>
			Regione:
			<%=request.getParameter("regione")%></p>
		<p>
			Città:
			<%=request.getParameter("citta")%></p>
		<p>
			Comune:
			<%=request.getParameter("comune")%></p>
		<p>
			Via:
			<%=request.getParameter("via")%></p>
		<p>
			Numero civico:
			<%=request.getParameter("numCivic")%></p>
		<p>
			CAP:
			<%=request.getParameter("CAP")%></p>
		<p>
			Descrizione (breve testo):
			<%=request.getParameter("descrizione")%></p>

		<h6>Divisione camere e i prezzi:</h6>
		<br>
		<br>
		<p>
			Numero camere singole:
			<%=request.getParameter("numSingole")%></p>
		<p>
			Numero camere matrimoniali:
			<%=request.getParameter("numMatrimoniali")%>
			Prezzo camere matrimoniali:
			<%=request.getParameter("prezzoMatrimoniali")%></p>
		<p>
			Numero camere Triple:
			<%=request.getParameter("numTriple")%>
			Prezzo camere triple:
			<%=request.getParameter("prezzoTriple")%></p>
		<br>


		<button class="btn waves-effect waves-light" type="submit"
			name="action">Procedi alla registrazione</button>
	</form>

	<br>

	<form method="POST" action="formRegistrazioneResidence.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Indietro</button>
	</form>

	<br>

</div>

<jsp:include page="/includes/footer.jsp" />
<%
    } else if (myBean instanceof BeanGestioneAppartamenti) {
%>
<jsp:include page="/includes/header.jsp" />

<br>

<div class="container">
	<h5 style="color: slategray">Riepilogo dati:</h5>
	<h6>dati generali:</h6>
	<br>
	<br> <br>
	<form method="POST" action="strutturaRegistrata.jsp">
		<p>
			Nome appartamento:
			<%=request.getParameter("nome")%></p>
		<p>
			Numero di stelle:
			<%=request.getParameter("stelle")%></p>
		<p>
			Regione:
			<%=request.getParameter("regione")%></p>
		<p>
			Città:
			<%=request.getParameter("citta")%></p>
		<p>
			Comune:
			<%=request.getParameter("comune")%></p>
		<p>
			Via:
			<%=request.getParameter("via")%></p>
		<p>
			Numero civico:
			<%=request.getParameter("numCivic")%></p>
		<p>
			CAP:
			<%=request.getParameter("CAP")%></p>
		<p>
			Descrizione (breve testo):
			<%=request.getParameter("descrizione")%></p>

		<h6>Divisione camere e i prezzi:</h6>
		<br>
		<br>
		<p>
			Numero camere:
			<%=request.getParameter("numSingole")%></p>
		<p>
			Numero bagni:
			<%=request.getParameter("numMatrimoniali")%></p>
		<p>
			Prezzo (giornaliero):
			<%=request.getParameter("numTriple")%></p>
		<br>


		<button class="btn waves-effect waves-light" type="submit"
			name="action">Procedi alla registrazione</button>
	</form>

	<br>

	<form method="POST" action="formRegistrazioneAppartamento.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Indietro</button>
	</form>

	<br>

</div>

<jsp:include page="/includes/footer.jsp" />
<%
    }
%>