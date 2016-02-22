<%@ page import="bean.BeanGestioneStrutture"%>
<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 08/02/16
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:useBean id="paymentBean" class="bean.PaymentBean" />
<jsp:include page="includes/header.jsp" />
<br>
<%
	for (BeanGestioneStrutture s : paymentBean.getList()) {
%>
<div class="container">
	<h4 style="color: slategray;"><%=s.getNome()%>
	</h4>
	<img height="135" width="250" src="images/strutture/carducci.jpg">
	<p style="color: slategray;"><%=s.getVia()%>
	</p>
	<p style="color: slategray;">
		Data check-in:
		<%=s.getCheckin()%>
	</p>
	<p style="color: slategray;">
		Data check-out:
		<%=s.getCheckout()%>
	</p>
	<p style="color: slategray;">
		Camere:
		<%=s.getCamere()%>
	</p>
	<p style="color: slategray;">
		Servizi:
		<%=s.getServizi()%>
	</p>
	<h5 style="color: slategray">
		Prezzo:
		<%=s.getPrezzo()%>
		€
	</h5>
	<br>
	<form method="post" action="index.jsp">
		<button class="btn waves-effect waves-light" type="submit"
			name="action">Modifica</button>
	</form>
	<br>
	<hr style="color: #3d5afe">
	<br>
</div>
<%
	}
%>
<br>
<div class="container">
	<%
		double totalPrice = 0;
		for (BeanGestioneStrutture s : paymentBean.getList()) {
			totalPrice += s.getPrezzo();
		}
	%>
	<h4 style="color: slategray">
		Prezzo totale:
		<%=totalPrice%>
	</h4>
	<br>
	<hr>
	<br>
	<form
		method="post"
		action="UCPagamento01InserimentoDati.jsp">
		<button
			class="btn waves-effect waves-light"
			type="submit"
			name="action">Procedi al pagamento</button>
	</form>
	<br>
</div>
<jsp:include page="includes/footer.jsp" />
