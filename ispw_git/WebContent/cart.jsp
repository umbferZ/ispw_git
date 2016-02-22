<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="includes/header.jsp"></jsp:include>
<div class="container">
	<div class="row">
		<%
			for (int i = 0; i < 10; i++) {
		%>
		<jsp:include page="includes/itemCart.jsp"></jsp:include>
		<%
			}
		%>
	</div>
</div>
<jsp:include page="includes/footer.jsp"></jsp:include>
