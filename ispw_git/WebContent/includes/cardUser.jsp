<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<jsp:useBean id="user" class="bean.BeanUser" scope="session" />
<jsp:setProperty name="user" property="*" />
<div class="s3 fixed-action-btn left">
	<div class="card">
		<div class="card-content">
			<%
			    if (session.getAttribute("user") != null) {
			%>
			<div class="card-title">Effettua l'accesso</div>
			<%
			    } else {
			%>
			Bentornato
			<div class="card-title"><jsp:getProperty name="user" property="nome" /></div>
			<%
			    }
			%>
		</div>
		<div class="card-action">
			<%
			    if (session.getAttribute("user") == null) {
			%>
			<form method="post">
				<button class="btn amber darken-3" type="submit" name="logout">Esci</button>
			</form>
			<%
			    } else {
			%>
			<form method="post">
				<div>
					<input type="hidden" name="id" value="1">
					<div class="input-field">
						<i class="material-icons prefix">mode_edit</i>
						<input type="text" class="validate" id="nome" name="nome"
							required="required"
						></input>
						<label class="active" for="nome">Nome</label>
					</div>
					<div class="input-field">
						<i class="material-icons prefix">mode_edit</i>
						<input type="text" class="validate" id="cognome" name="cognome"
							required="required"
						></input>
						<label class="active" for="cognome">Cognome</label>
					</div>
					<div class="input-field">
						<button class="btn" type="submit" name="user" value="ok">Accedi</button>
					</div>
				</div>
			</form>
			<%
			    }
			%>
		</div>
	</div>
</div>