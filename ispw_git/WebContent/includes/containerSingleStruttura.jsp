<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<div class="row">
	<div class="col s12">
		<div class="card ">
			<div class="card-image">
				<img src="images/strutture/carducci.jpg">
				<h2 class="card-title ">Struttura</h2>
			</div>
			<div class="card-content">
				<div class="row">
					<%
					    for (int i = 0; i < 8; i++) {
					%>
					<div class="col s3">
						<div class="card ">
							<div class="card-image">
								<img src="images/strutture/carducci.jpg">
							</div>
						</div>
					</div>
					<%
					    }
					%>
				</div>
			</div>
			<div class="card-action">
				<div>
					<form method="post" action="cart.jsp">
						<div class="input-field col s12">
							<select class="icons">
								<option value="" disabled selected>Choose your option</option>
								<option value="" data-icon="images/icons/bedS.png" class="left circle">singola
									1</option>
								<option value="" data-icon="images/icons/bedM.jpeg" class="left circle">matrimoniale
									2</option>
								<option value="" data-icon="images/icons/bedT.png" class="left circle">tripla
									3</option>
							</select>
						</div>
						<button class="btn amber darken-4" type="submit" name="addCart" value="ok">Aggiungi
							al carrello</button>
					</form>
				</div>
				<div class="card-title">123,00€</div>
			</div>
		</div>
	</div>
</div>