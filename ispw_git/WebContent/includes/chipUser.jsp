<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<jsp:useBean id="user" class="bean.BeanUser"></jsp:useBean>
<div class="chip white">
	<i class="material-icons tiny">label</i>
	<jsp:getProperty property="nome" name="user" />
</div>
