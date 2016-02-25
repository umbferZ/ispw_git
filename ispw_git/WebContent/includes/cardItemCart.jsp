<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
%>
<div class="col s6">
	<div class="card">
		<div class="card-image">
			<img src="images/strutture/carducci.jpg">
			<div class="card-title">
				Struttura
				<%=id%></div>
		</div>
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
			<div class="row">
				<div class="container">
					<div class="col s6">
						<form>
							<button class="btn-floating red" type="submit" name="delItem"
								value="<%=id%>">
								<i class="material-icons">delete</i>
							</button>
						</form>
					</div>
					<div class="col s6">
						<form method="get" action="search.jsp">
							<!-- <button class="btn amber darken-4" type="submit" name="idStrut" value="01">Dettagli</button> -->
							<button class="btn-floating" type="submit" name="idStrut" value="<%=id%>">
								<i class="material-icons">info</i>
							</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
