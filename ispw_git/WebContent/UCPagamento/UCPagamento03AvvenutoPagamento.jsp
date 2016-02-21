<%@ page import="bean.PaymentBean" %>
<%@ page import="control.PaymentControl" %><%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 10/02/16
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%PaymentBean paymentBean = (PaymentBean) session.getAttribute("Bean");%>
<jsp:include page="../includes/header.jsp"/>

<div class="container">

    <% if(paymentBean.paga()){ %>

        <h4>Il pagamento è avvenuto con successo.</h4>
        <h6>Riceverai a breve una mail con tutti i dettagli.</h6>

    <%} else {%>

    <h4>Spiacenti! I dati inseriti non sono corretti.</h4>

    <br>

    <form method="get" action="UCPagamento01InserimentoDati.jsp">
        <button class="btn waves-effect waves-light" type="submit" name="action">Modifica i dati inseriti</button>
    </form>

    <% } %>

    <br>
    <hr>
    <br>

    <form method="get" action="../index.jsp">
        <button class="btn waves-effect waves-light" type="submit" name="action">Torna alla Home</button>
    </form>

</div>

<br>

<jsp:include page="../includes/footer.jsp"/>