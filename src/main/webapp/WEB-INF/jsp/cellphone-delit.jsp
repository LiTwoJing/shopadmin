<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="title" value="${cellphone.id == null ? '添加' : '修改'}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}商品</title>
	<link href="${contextPath}/assets/css/form.css" rel="stylesheet">
</head>
<body>
	<h1>${title}商品</h1>
	<f:form action="" method="post" commandName="cellphone">
	
		<div>
			<label for="cellphone">手机名称</label>
			<f:input  id="cellphone" path="cellphone" type="text" value="${cellphone.cellphone}"/>
			<f:errors path="cellphone" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="brand">品牌</label>
			<f:input  id="brand" path="brand" type="text"/>
			<f:errors path="brand" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="model">型号</label>
			<f:input  id="model" path="model" type="text"/>
			<f:errors path="model" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="os">操作系统</label>
			<f:input  id="os" path="os" type="text"/>
			<f:errors path="os" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="cpuBrand">处理器</label>
			<f:input  id="cpuBrand" path="cpuBrand" type="text"/>
			<f:errors path="cpuBrand" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="ram">运存</label>
			<f:input  id="ram" path="ram" type="text"/>（单位MB）
			<f:errors path="ram" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="storage">固存</label>
			<f:input  id="storage" path="storage" type="text"/>（单位GB）
			<f:errors path="storage" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="color">颜色</label>
			<f:input  id="color" path="color" type="text"/>
			<f:errors path="color" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<label for="description">简介</label>
			<f:textarea rows="5px" cols="7px" path="description" id="description"></f:textarea>
			<f:errors path="description" cssClass="errors"></f:errors>
		</div>
		
		<div>
			<button type="submit">${title}</button>
		</div>
	
	</f:form>
</body>
</html>