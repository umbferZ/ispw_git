<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 08/02/16
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="includes/header.jsp" />
<br>
<div class="container">
	<table class="striped" id="eventTable">
		<thead>
			<tr>
				<th data-field="id">Evento</th>
				<th data-field="name">Data e ora</th>
				<th data-field="price">Città</th>
				<th data-field="partecipate"></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Vasco Rossi - LiveKOM016</td>
				<td>22-23/06/2016 ore 21:15</td>
				<td>Rome, Stadio Olimpico</td>
				<td>
					<form method="post" action="UCPromozioni01Adesione.jsp">
						<button class="btn waves-effect waves-light" type="submit" name="action">Aderisci</button>
					</form>
				</td>
			</tr>
			<tr>
				<td>Rugby SixNations2016 - Italy France</td>
				<td>27/02/2016 ore 15:00</td>
				<td>Rome, Stadio Olimpico</td>
				<td>
					<form method="post" action="UCPromozioni01Adesione.jsp">
						<button class="btn waves-effect waves-light" type="submit" name="action">Aderisci</button>
					</form>
				</td>
			</tr>
			<tr>
				<td>Bruce Springsteen - The River Tour</td>
				<td>03/07/2016</td>
				<td>Milan, San Siro</td>
				<td>
					<form method="post" action="UCPromozioni01Adesione.jsp">
						<button class="btn waves-effect waves-light" type="submit" name="action">Aderisci</button>
					</form>
				</td>
			</tr>
		</tbody>
	</table>
</div>
<br>
<jsp:include page="includes/footer.jsp" />
