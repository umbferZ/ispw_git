<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Enumeration<String> chiavi = session.getAttributeNames();
	String ses = "<br />";
	while (chiavi.hasMoreElements()) {
		String chiave = (String) chiavi.nextElement();
		ses += "<div class='card col s12 red darken-3 white-text'>";
		ses += "session.getAttribute('" + chiave + "'): " + session.getAttribute(chiave) + "";
		ses += "</div>";

	}
	chiavi = request.getAttributeNames();
	String req = "<br />";
	while (chiavi.hasMoreElements()) {
		String chiave = (String) chiavi.nextElement();
		req += "<div class='card col s12 green darken-3 white-text'>";
		req += "request.getAttribute('" + chiave + "'): " + request.getAttribute(chiave) + "";
		req += "</div>";

	}
	chiavi = request.getParameterNames();
	String reqp = "<br />";
	while (chiavi.hasMoreElements()) {
		String chiave = (String) chiavi.nextElement();
		reqp += "<div class='card col s12 blue darken-3 white-text'>";
		reqp += "request.getParameter('" + chiave + "'): " + request.getParameter(chiave) + "";
		reqp += "</div>";

	}
%>
<div class="row card">
	<div class="col s5">
		<div class="card-title">SESSION</div>
		<div class="row">
			<%=ses%>
		</div>
	</div>
	<div class="col s5 ">
		<div class="card-title">REQUEST</div>
		<div class="row">
			<%=reqp%>
		</div>
	</div>
</div>
