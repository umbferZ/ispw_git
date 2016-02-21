<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 08/02/16
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>

<jsp:include page="includes/header.jsp"/>

<br>
<br>

<div class="container">

    <form action="UCPromozioni/UCPromozioni00ListaEventi.jsp" method="get">
        <button class="btn waves-effect waves-light" type="submit" name="action">Gestisci promozioni</button>
    </form>
    <form action="UCPagamento/UCPagamento00Carrello.jsp" method="get">
        <button class="btn waves-effect waves-light" type="submit" name="action">Effettua pagamento del carrello</button>
    </form>
    <form action="UCPagamento/UCPagamentoPremium00InserimentoDati.jsp" method="get">
        <button class="btn waves-effect waves-light" type="submit" name="action">Attiva account premium</button>
    </form>

    <a href="UCEventi/UCEventi00InserisciEvento.jsp">Eventi</a>
    <br>
</div>
<jsp:include page="includes/footer.jsp"/>