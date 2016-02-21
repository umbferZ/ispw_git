<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 08/02/16
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>

<jsp:include page="../includes/header.jsp"/>

<% if (request.getParameter("action")!=null) {%>

<jsp:useBean id="payBean" class="bean.PaymentBean" scope="session"/>
<jsp:setProperty name="payBean" property="*"/>
<%session.setAttribute("Bean", payBean);%>
<%--<jsp:forward page="UCPagamento02RiepilogoDati.jsp"/>--%>

            <%}%>
<br>

<div class="container">

    <h5 style="color: slategray">Inserisci i tuoi dati: </h5>

    <br>

    <form class="col s12" action="UCPagamento02RiepilogoDati.jsp" method="post">

        <label>Tipo</label>

        <br>

        <select class="browser-default">
            <option value="" disabled selected>Scegli il tipo di carta</option>
            <option value="1">Visa</option>
            <option value="2">MasterCard</option>
            <option value="3">AmericanExpress</option>
        </select>

        <br>

        <div class="row">
            <div class="input-field col s6">
                <input placeholder="Intestatario" name="name" id="name" type="text" class="validate">
            </div>
        </div>

        <div class="row">
            <div class="input-field col s6">
                <input placeholder="Numero della carta" name="number" id="number" type="text" class="validate">
            </div>
        </div>

        <div class="row">
            <div class="input-field col s6">
                <input placeholder="CCV" name="ccv" id="ccv" type="text" class="validate">
            </div>
        </div>

        <br>

        <button class="btn waves-effect waves-light" type="submit" name="action" value="conferma">Conferma dati e procedi all'acquisto
        </button>

    </form>

    <br>

    <form class="col s12" action="UCPagamento00Carrello.jsp" method="post">
        <button class="btn waves-effect waves-light" type="submit" name="action">Torna indietro</button>
    </form>

</div>

<br>

<jsp:include page="../includes/footer.jsp"/>

