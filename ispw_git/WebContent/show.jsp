<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<jsp:include page="includes/header.jsp"></jsp:include>
<div class="row">
	<div class="col s9 ">
		<div class="container ">
			<div class="row">
				<%
				    for (int i = 0; i < 10; i++) {
				%>
				<jsp:include page="includes/cartItem.jsp">
				</jsp:include>
				<%
				    }
				%>
			</div>
		</div>
	</div>
	<jsp:include page="includes/cartIndicator.jsp"></jsp:include>
</div>
<jsp:include page="includes/footer.jsp"></jsp:include>
