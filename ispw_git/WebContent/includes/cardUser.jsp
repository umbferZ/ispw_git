<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="bean.BeanUser" scope="session" />
<jsp:setProperty name="user" property="*" />
<%
	if (request.getParameter("logout") != null) {
		session.invalidate();
%>
<%
	}
%>
<div class="s6 fixed-action-btn left">
	<div class="card">
		<%
			if (user.getNome() == "") {
		%>
		<div class="card-content">
			<div class="card-title">Effettua l'accesso</div>
		</div>
		<div class="card-action">
			<form method="post" action="index.jsp">
				<input type="hidden" name="id" value="1">
				<div>
					<div class="input-field">
						<i class="material-icons prefix">mode_edit</i>
						<input type="text" class="validate" id="nome" name="nome"
							required="required"></input>
						<label class="active" for="nome">Nome</label><jsp:getProperty
							property="nome" name="user" />
					</div>
					<div class="input-field">
						<i class="material-icons prefix">mode_edit</i>
						<input type="text" class="validate" id="cognome" name="cognome"
							required="required"></input>
						<label class="active" for="cognome">Cognome</label>
					</div>
					<div class="input-field">
						<button class="btn" type="submit" value="ok">Accedi</button>
					</div>
				</div>
			</form>
		</div>
		<%
			} else {
		%>
		<div class="card-content">
			ciao
			<div class="card-title">${user.nome }</div>
		</div>
		<div class="card-action">
			<form method="post" action="index.jsp">
				<button class="btn amber darken-3" type="submit" name="logout">Esci</button>
			</form>
		</div>
		<%
			}
		%>
	</div>
</div>