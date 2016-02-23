<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="navbar-fixed">
	<nav class="amber darken-4">
	<div class="nav-wrapper" style="padding: 0px 20px">
		<a href="index.jsp" class="brand-logo">JAVAcanze</a>
		<ul id="nav-mobile" class="right hide-on-med-and-down">
			<li><jsp:include page="chipCart.jsp"></jsp:include></li>
			<li><a href="cart.jsp">
					<i class="material-icons">shopping_cart</i>
				</a></li>
			<li><a href="show.jsp">
					<i class="material-icons">search</i>
				</a> <!-- </li>
			<li>
				<a href="#!">offerte</a>
			</li>
			<li>
				<a href="#!">eventi</a>
			</li> -->
			<li><a href="#">
					<i class="material-icons">perm_identity</i>
				</a></li>
		</ul>
	</div>
	</nav>
</div>