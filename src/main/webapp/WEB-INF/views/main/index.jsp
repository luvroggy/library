<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>콩콩북스 도서 관리 시스템</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
   <div align="center">
      <br/>
      <a href="/"><img alt="콩콩북스 로고" src="" width="300px"></a>
      <br/>
      <br/>
   </div>
   <c:if test="${empty userId }">
   <nav class="navbar navbar-default">
   <div class="container-fluid">
   <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">메뉴</a>
    </div>
      <div class="collapse navbar-collapse" id="navbar1">
         <ul class="nav navbar-nav">
            <li><a href="/login">로그인</a></li>
            <li><a href="/users/insert">회원가입</a></li>
            <li><a href="/stackbooks/list">책목록</a></li>
            <li><a href="/write">희망도서신청</a></li>
         </ul>
         <form class="navbar-form navbar-left" role="search" action="/search/title">
	        <div class="form-group">
	          <input type="text" name="title" class="form-control" placeholder="책이름">
	        </div>
	        <button type="submit" class="btn btn-default">검색</button>
	     </form>
      </div>
   </div>
   </nav>     
   </c:if>
      
   

<!-- 등급이 일반 사용자인 경우 -->
      <c:if test="${not empty userId }">
         <c:if test="${grade == 'normal' }">
         <nav class="navbar navbar-default">
		   <div class="container-fluid">
		   <div class="navbar-header">
      		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar2">
       		 <span class="sr-only">Toggle navigation</span>
       		 <span class="icon-bar"></span>
       		 <span class="icon-bar"></span>
       		 <span class="icon-bar"></span>
      		</button>
     		<a class="navbar-brand" href="#">메뉴</a>
    	   </div>
		      <div class="collapse navbar-collapse" id="navbar2">
		      	 <ul class="nav navbar-nav navbar-right">
		      	 	<li><a href="/users/update">개인정보수정</a></li>
		      	 	<li><a href="/logout">로그아웃</a></li>
		      	 </ul>
		         <ul class="nav navbar-nav">
		            <li><a href="/stackbooks/list">책목록</a></li>
		            <li><a href="/request/list">희망도서신청목록</a></li>
		            <li><a href="/booking/list">예약도서조회</a></li>
		            <li><a href="/rental/list">대출도서조회</a></li>
		         </ul>
		         <form class="navbar-form navbar-left" role="search" action="/search/title">
			        <div class="form-group">
			          <input type="text" name="title" class="form-control" placeholder="책이름">
			        </div>
			        <button type="submit" class="btn btn-default">검색</button>
			     </form>
		      </div>
		   </div>
		  </nav> 
         </c:if>
         

         <!-- 등급이 관리자인 경우 -->
         <c:if test="${grade == 'admin' }">
         <nav class="navbar navbar-default">
		   <div class="container-fluid">
		   <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar3">
		        <span class="sr-only">Toggle navigation</span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		      </button>
		      <a class="navbar-brand" href="#">메뉴</a>
		    </div>
		      <div class="collapse navbar-collapse" id="navbar3">
		      	 <ul class="nav navbar-nav navbar-right">
		      	 	<li><a href="/users/update">개인정보수정</a></li>
		      	 	<li><a href="/logout">로그아웃</a></li>
		      	 </ul>
		         <ul class="nav navbar-nav">
		            <li><a href="/stackbooks/list">책목록</a></li>
		            <li class="dropdown">
          				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">수서
          				<span class="caret"></span>
          				</a>
	          			<ul class="dropdown-menu" role="menu">
				            <li><a href="/admin/acquisition/list">수서목록조회</a></li>
				            <li><a href="/admin/orderlist/list">주문목록조회</a></li>
				            <li><a href="/admin/inspection/list">검수목록조회</a></li>
				        </ul>
				    </li>
		            <li class="dropdown">
          				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">회원관리
          				<span class="caret"></span>
          				</a>
	          			<ul class="dropdown-menu" role="menu">
				            <li><a href="/admin/request/list">희망도서관리</a></li>
				            <li><a href="/admin/rental/list">대여/반납조회</a></li>
				            <li><a href="/admin/booking/list">예약조회</a></li>
				        </ul>
          			</li>
		         </ul>
		         <form class="navbar-form navbar-left" role="search" action="/search/title">
			        <div class="form-group">
			          <input type="text" name="title" class="form-control" placeholder="책이름">
			        </div>
			        <button type="submit" class="btn btn-default">검색</button>
			     </form>
		      </div>
		   </div>
		  </nav> 
         </c:if>
      </c:if>
      <div>
	         <br/>
	         <br/>
	         <br/>
       </div>     
      <c:choose>
         <c:when test="${empty content}">
         	<div class="jumbotron">
			  <div class="container">
			    <h1>콩콩북스에 오신 것을 환영합니다!</h1>
  				<p>보고 싶은 책이 현재 도서관에 있는지 확인해보세요!</p>
  				<p><a class="btn btn-primary btn-lg" href="/stackbooks/list" role="button">보러가기</a></p>
			  </div>
			</div>
			<div style="margin-left: 20px;">
			<div class="page-header">
  				<h1>콩콩북스 <small>콩콩동의 작은 쉼터</small></h1>
			</div>
			<p class="lead">콩콩북스는 콩콩동에 위치한 대전에서 지원하는 작은 쉼터입니다.</p>
			<p>방문하시는 모든 분들께 편안한 장소를 제공하기 위하여 늘 노력하고, 건의함을 통해 불편사항을 접수하고 있습니다.
			<br/>여러분들의 관심과 사랑에 늘 보답하는 콩콩북스가 되겠습니다.</p>
			</div>
         </c:when>
         <c:otherwise>
            <jsp:include page="${content}" />
         </c:otherwise>
      </c:choose>
   <hr/>
   <div id="footer" align="left" style="font-family:Trebuchet MS, Dotum;">
   Copyright&copy; Kong Univ. All rights reserved. <br/>
   (11111) 콩까지마 <br/>
   (042)222-2222(대출/반납)   	
   </div>
      
            
         
      
   <!-- /////////////////////////////////////////////////////////////////////////////////////////////// -->
   
   
   

</body>
</html>