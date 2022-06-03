<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="../header.html" %>

<h1>お問い合わせフォーム</h1>

<form action="../servlet/result" method="post">

	氏名 : <input type="text" name="name" required><br>

	会社 : <input type="text" name="company"><br>

	メールアドレス : <input type="text" name="mail" required><br>

	お問合わせ内容 : <textarea required name="kansou" rows="4" cols="40"  ></textarea><br>

	メルマガ種類 :
	<p><input type="checkbox" name="mailmagazine" value="総合案内">総合案内</p>
	<p><input type="checkbox" name="mailmagazine" value="セミナー案内">セミナー案内</p>
	<p><input type="checkbox" name="mailmagazine" value="求人採用情報">求人採用情報</p><br>

	資料請求希望 :
	<p><input type="radio" name="documentrequest" value="yes" required>YES</p>
	<p><input type="radio" name="documentrequest" value="no">NO</p><br>

	<button type="submit">送信</button>
</form>

<%@include file="../footer.html" %>