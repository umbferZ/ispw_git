<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="includes/header.jsp"></jsp:include>
<jsp:include page="includes/cardCartIndicator.jsp"></jsp:include>
<div class="row">
	<div class="col s9">
		<div class="container ">
			<div class="row">
				<%
					// TODO controllo se ci sono elementi nel carrello 
					for (int i = 0; i < 10; i++) {
				%>
				<jsp:include page="includes/cardItemCart.jsp">
					<jsp:param
						value="<%=i%>"
						name="id" />
				</jsp:include>
				<%
					}
				%>
			</div>
		</div>
	</div>
</div>
<jsp:include page="includes/footer.jsp"></jsp:include>
