<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 18/02/16
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="payBean" class="bean.PaymentBean"/>

<jsp:setProperty name="payBean" property="*"/>

<jsp:include page="../includes/header.jsp"/>

<br>

<div class="container">

    <h5 style="color: slategray">Riepilogo dati:</h5>

    <br>

    <p style="color: slategray;">Abbonamento: </p>
    <%=request.getParameter("abbonamento")%>

    <br>

    <p style="color: slategray">Nome: </p>
    <%=request.getParameter("name")%>

    <br>

    <p style="color: slategray">Numero: </p>
    <%=request.getParameter("number")%>

    <br>

    <p style="color: slategray">CCV: </p>
    <%=request.getParameter("ccv")%>

    <br>
    <br>
    <hr>
    <br>
    <br>

    <form method="get" action="UCPagamentoPremium00InserimentoDati.jsp">
        <button class="btn waves-effect waves-light" type="submit" name="action">Torna indietro</button>
    </form>

    <br>

    <form method="get" action="UCPagamentoPremium02AvvenutoPagamento.jsp">
        <button class="btn waves-effect waves-light" type="submit" name="action">Conferma e paga</button>
    </form>

    <br>

</div>

<jsp:include page="../includes/footer.jsp"/>