<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<jsp:useBean id="user" class="bean.BeanUser"></jsp:useBean>
<div class="s3 right fixed-action-btn">
	<div class="card">
		<div class="card-content">
			<p>
				Ciao
				<jsp:getProperty property="nome" name="user" />,
			</p>
			Totale <span class="card-title">123,89 €</span>
			<p>informazioni di riepilogo</p>
		</div>
		<div class="card-action">
			<form method="post" action="UCPagamento01InserimentoDati.jsp">
				<button class="btn light-blue darken-3" type="submit" name="action">Procedi
					al pagamento</button>
			</form>
		</div>
	</div>
</div>