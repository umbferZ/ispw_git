<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<div class="col s6">
	<div class="card">
		<div class="card-image">
			<img src="images/strutture/carducci.jpg">
		</div>
		<div class="card-title">
			Struttura
			<%=request.getParameter("id")%></div>
		<div class="card-content">
			<div class="row">
				<div class="col s3">
					<i class="material-icons right activator grey-text text-darken-4">today</i>
				</div>
				<div class="col s9">checkin: 12/12/12</div>
			</div>
			<div class="row">
				<div class="col s3">
					<i class="material-icons right activator grey-text text-darken-4">today</i>
				</div>
				<div class="col s9">checkin: 12/12/12</div>
			</div>
		</div>
		<div class="card-action">
			<div class="container">
				<form method="get" action="search.jsp">
					<button class="btn amber darken-4" type="submit" name="idStrut" value="01">Dettagli</button>
				</form>
				<a href="?delItem=<%=request.getParameter("id")%>" class="text-gray tiny">elimina
					dal carrello</a>
			</div>
		</div>
	</div>
</div>
