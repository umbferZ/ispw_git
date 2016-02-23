<%@page import="bean.BeanSearch"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%
    String keyword = "";
    String checkin = "";
    String checkout = "";
    String result = "";
    if (request.getParameter("search") != null) {
		keyword = request.getParameter("keyword");
		checkin = request.getParameter("checkin");
		checkin = request.getParameter("checkout");
%>
<jsp:useBean id="search" class="bean.BeanSearch" scope="session" />
<jsp:setProperty name="search" property="*" />
<%
    result = search.search();
		request.setAttribute("result", result);
    }
%>
<div>
	<div class="container">
		<form method="get" action="">
			<div class="row">
				<div class="input-field col s5">
					<i class="material-icons prefix">mode_edit</i>
					<input type="text" class="validate" id="keyword" name="keyword"
						required="required" value="<%=keyword%>"
					>
					<label class="active" for="keyword">Keyword</label>
				</div>
				<div class="input-field col s3">
					<i class="material-icons prefix">today</i>
					<input type="date" class="datepicker validate" id="checkin" name="checkin"
						required="required" value="<%=checkin%>"
					>
					<label class="active" for="checkin">Checkin</label>
				</div>
				<div class="input-field col s3">
					<i class="material-icons prefix">today</i>
					<input type="date" class="datepicker validate" id="checkout"
						name="checkout" required="required" value="<%=checkout%>"
					>
					<label class="active" for="checkin">Checkout</label>
				</div>
				<div class="input-field col s1 ">
					<button class="btn-floating " type="submit" name="search" value="ok">
						<i class="material-icons">search</i>
					</button>
				</div>
			</div>
		</form>
	</div>
</div>
<div><%=result%></div>
