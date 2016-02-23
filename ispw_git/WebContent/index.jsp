<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<jsp:include page="includes/header.jsp" />
<div class="container">
	<form action="UCPromozioni00ListaEventi.jsp" method="get">
		<button class="btn light-blue darken-3" type="submit" name="action">Gestisci
			promozioni</button>
	</form>
	<p></p>
	<form action="UCPagamentoPremium00InserimentoDati.jsp" method="get">
		<button class="btn light-blue darken-3" type="submit" name="action">Attiva
			account premium</button>
	</form>
	<p></p>
	<a href="UCEventi00InserisciEvento.jsp">Eventi</a> <br>
</div>
<jsp:include page="includes/cardUser.jsp"></jsp:include>
<jsp:include page="includes/footer.jsp" />
