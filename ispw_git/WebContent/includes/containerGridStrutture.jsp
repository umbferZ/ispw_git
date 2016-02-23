<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<div class="row">
	<div class="col s12">
		<div class="container ">
			<div class="row">
				<%
				    String result = (String) request.getAttribute("result");
				    for (int i = 0; i < 10; i++) {
				%>
				<jsp:include page="cardStrutturaShow.jsp">
					<jsp:param value="" name=""/>
				</jsp:include>
				<%
				    }
				%>
			</div>
		</div>
	</div>
</div>