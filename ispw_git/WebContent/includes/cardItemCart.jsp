<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<form method="get" action="">
					<button class="btn amber darken-4" type="submit" name="addItem"
						value="<%=request.getParameter("id")%>">rimuovi</button>
				</form>
			</div>
		</div>
	</div>
</div>
