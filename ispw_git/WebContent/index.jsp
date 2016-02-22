<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 08/02/16
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<jsp:include page="includes/header.jsp" />
<div class="container">
	<form action="UCPromozioni00ListaEventi.jsp" method="get">
		<button class="btn light-blue darken-3" type="submit" name="action">Gestisci
			promozioni</button>
	</form>
	<form action="UCPagamentoPremium00InserimentoDati.jsp" method="get">
		<button class="btn light-blue darken-3" type="submit" name="action">Attiva
			account premium</button>
	</form>
	<a href="UCEventi00InserisciEvento.jsp">Eventi</a> <br>
</div>
<jsp:include page="includes/footer.jsp" />
