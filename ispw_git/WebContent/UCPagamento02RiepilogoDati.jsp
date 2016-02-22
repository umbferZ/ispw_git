<%@ page import="bean.PaymentBean"%><%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 17/02/16
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	PaymentBean myBean = (PaymentBean) session.getAttribute("Bean");
	if (myBean == null) {
%>
<%
	} else {
%>
<jsp:include page="includes/header.jsp" />
<br>
<div class="container">
	<h5 style="color: slategray">Riepilogo dati:</h5>
	<br>
	<p style="color: slategray">Nome:</p>
	<%=request.getParameter("name")%>
	<br>
	<p style="color: slategray">Numero:</p>
	<%=request.getParameter("number")%>
	<br>
	<p style="color: slategray">CCV:</p>
	<%=request.getParameter("ccv")%>
	<br> <br>
	<hr>
	<br> <br>
	<form method="get" action="UCPagamento03AvvenutoPagamento.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Conferma e paga</button>
	</form>
	<br>
	<form method="get" action="UCPagamento01InserimentoDati.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Torna indietro</button>
	</form>
	<br>
</div>
<%
	}
%>
<jsp:include page="includes/footer.jsp" />