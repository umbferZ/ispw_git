<%--
  Created by IntelliJ IDEA.
  User: Francesco
  Date: 18/02/16
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<link rel="stylesheet" href="css/materialize.min.css">
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<title>JAVAcanze</title>
</head>
<body>
	<div class="navbar-fixed">
		<nav class="amber darken-4">
			<div class="nav-wrapper" style="padding: 0px 20px">
				<ul id="dropdown1" class="dropdown-content">
					<li class="divider"></li>
					<li class="divider"></li>
				</ul>
				<ul id="nav-mobile" class="left hide-on-med-and-down">
					<li><a href="#"> <i class="material-icons">search</i></a></li>
					<li><a href="#!">offerte</a></li>
					<li><a href="#!">eventi</a></li>
				</ul>
				<ul id="nav-mobile" class="right hide-on-med-and-down">
					<li><jsp:include page="cartChipHeader4Menu.jsp"></jsp:include></li>
					<li><a href="cart.jsp"><i class="material-icons">shopping_cart</i></a></li>
					<li><a href="#"><i class="material-icons">perm_identity</i></a></li>
				</ul>
			</div>
		</nav>
	</div>
	<div class="section no-pad-bot">
		<div class="conatiner"></div>
	</div>
	<div style="min-height: 700px;">