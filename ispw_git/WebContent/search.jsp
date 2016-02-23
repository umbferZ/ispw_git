<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<jsp:include page="includes/header.jsp"></jsp:include>
<jsp:include page="includes/barSearch.jsp"></jsp:include>
<%
    if (request.getParameter("search") != null) {
%>
<jsp:include page="includes/containerGridStrutture.jsp"></jsp:include>
<%
    }

    else if (request.getParameter("idStrut") != null) {
%>
<div class="container">
	<jsp:include page="includes/containerSingleStruttura.jsp"></jsp:include>
</div>
<%
    }
%>
<jsp:include page="includes/footer.jsp"></jsp:include>
