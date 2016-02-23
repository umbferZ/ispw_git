<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 08/02/16
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<jsp:include page="includes/header.jsp" />
<br>
<div class="container">
	<div class="col s12 m7">
		<div class="card">
			<div class="card-image">
				<img src="images/events/Bruce.jpg">
				<span class="card-title">Bruce Springsteen - The River Tour 2016</span>
			</div>
			<div class="card-content">
				<p>Uniche due date italiane per il tour dei record del "Boss". Il 3 e 16
					Luglio rispettivamente a Milano e Roma.</p>
			</div>
			<div class="card-action">
				<a href="#">Vai alla pagina dell'evento</a>
			</div>
		</div>
	</div>
</div>
<br>
<div class="container">
	<label>Struttura</label>
	<select class="browser-default">
		<option value="" disabled selected>Choose your option</option>
		<option value="1">Hotel California</option>
		<option value="2">Hotel Carducci 76</option>
	</select>
</div>
<br>
<div class="container">
	<label>Numero di camere</label>
	<select class="browser-default">
		<option value="" disabled selected>Choose your option</option>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="3">4</option>
		<option value="3">5</option>
		<option value="3">6</option>
	</select>
</div>
<br>
<div class="container">
	<label>Servizi:</label>
	<form action="#">
		<p>
			<input class="with-gap" name="group1" type="radio" id="test1" />
			<label for="test1">Red</label>
		</p>
		<p>
			<input class="with-gap" name="group2" type="radio" id="test2" />
			<label for="test2">Yellow</label>
		</p>
		<p>
			<input class="with-gap" name="group3" type="radio" id="test3" />
			<label for="test3">Green</label>
		</p>
		<p>
			<input class="with-gap" name="group4" type="radio" id="test4" />
			<label for="test4">Brown</label>
		</p>
	</form>
</div>
<br>
<div class="container">
	<td>
		<form method="post" action="UCPromozioni02ListaPromozioni.jsp">
			<button class="btn waves-effect waves-light" type="submit" name="action">Crea
				promozione</button>
		</form>
	</td>
</div>
<jsp:include page="includes/footer.jsp" />