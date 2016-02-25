<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="s3 left fixed-action-btn">
	<div class="card">
		<div class="card-content">
			<p>Ciao ${user.nome}</p>
			Totale <span class="card-title">123,89 €</span>
			<p>informazioni di riepilogo</p>
		</div>
		<div class="card-action">
			<form method="post" action="UCPagamento01InserimentoDati.jsp">
				<button class="btn light-blue darken-3" type="submit" name="action">
					Procedi al pagamento <i class="material-icons">shop</i>
				</button>
			</form>
		</div>
	</div>
</div>