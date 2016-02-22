<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 18/02/16
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:useBean id="payBean" class="bean.PaymentBean"></jsp:useBean>
<jsp:include page="includes/header.jsp" />
<div class="container">
	<%
		if (payBean.paga()) {
	%>
	<h4>Il pagamento è avvenuto con successo. Sei un nuovo account
		Premium!</h4>
	<%
		} else {
	%>
	<h4>Spiacenti! I dati inseriti non sono corretti.</h4>
	<br>
	<form method="get" action="UCPagamento01InserimentoDati.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Modifica i dati inseriti</button>
	</form>
	<%
		}
	%>
	<br>
	<hr>
	<br>
	<form method="get" action="index.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Torna alla Home</button>
	</form>
</div>
<br>
<jsp:include page="includes/footer.jsp" />
