<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>콩콩북스 도서 관리 시스템</title>
</head>
<body>
<div class="jumbotron">
<div class="container" style="width: 500px;">
<form action="/login" name="loginForm" method="post">
	<div class="form-group">
    <label for="inputID">아이디</label>
    <input type="text" class="form-control" name="userId" id="inputID" required="required" placeholder="아이디를 입력하세요">
  	</div>
  	<div class="form-group">
    <label for="inputPassword">암호</label>
    <input type="password" class="form-control" name="password" id="inputPassword" required="required" placeholder="암호">
  	</div>
  <button type="submit" class="btn btn-default">로그인</button>
</form>
</div>
</div>

</body>
</html>