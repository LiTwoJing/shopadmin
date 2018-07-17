<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
</head>
<body>
	<h1>商品列表</h1>
	
	<ul>
		<c:forEach items="${cellphone}" var="cellphone">
			<li style="list-style: none;">
			${cellphone.id}&nbsp;&nbsp;${cellphone.cellphone}&nbsp;&nbsp;
			<form action="${contextPath}/cellphone/${cellphone.id}" method="post" style="margin: 0px;display: inline;">
				<button type="submit" style="color:blue; text-decoration:underline; border: 0; background: white; font-size: 16px">删除</button>
			</form>
			&nbsp;&nbsp;<a href="${contextPath}/cellphone/${cellphone.id}/add" style="list-style: none;">修改</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>