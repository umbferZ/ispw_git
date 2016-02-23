<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="includes/header.jsp"></jsp:include>
<jsp:include page="includes/barSearch.jsp"></jsp:include>
<%
	if (request.getParameter("search") != null) {
%>
<div class="row">
	<div class="col s12">
		<div class="container ">
			<div class="row">
				<%
					for (int i = 0; i < 10; i++) {
				%>
				<jsp:include page="includes/cardStrutturaShow.jsp" />
				<%
					}
				%>
			</div>
		</div>
	</div>
</div>
<%
	}
%>
<jsp:include page="includes/footer.jsp"></jsp:include>
