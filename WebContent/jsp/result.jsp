<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="../header.html" %>

<h1>問い合わせ内容</h1>

<link href="../design.css" media="all" rel="stylesheet">

<section>
<p>氏名：${contact.name}</p>
<p>会社名：${contact.company}</p>
<p>メールアドレス：${information.mail}</p>
<p>お問い合わせ内容：${information.contact}</p>

<p>
	メルマガ種類：
	<c:forEach var="mg" items="${contact.mailmagazine}">
	${mg}、
	</c:forEach>
</p>

<p>資料請求：${information.yesNo}</p>
</section>

<%@include file="../footer.html" %>
