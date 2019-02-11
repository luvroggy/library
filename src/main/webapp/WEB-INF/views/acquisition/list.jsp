<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.academy.library.dto.Acquisition" %>
<%@ page import="java.util.*" %>
    
<%-- 목록이므로 반복출력, core tag 사용 --%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"	
           uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	// 삭제 전 확인 질문
	function confirmRemove(code) {
		var yes = confirm(code + " 정보를 "
				         +"삭제하시겠습니까?");
		return yes;
	}

</script>
<style type="text/css">
table.type09 {
    border-collapse: collapse;
    text-align: left;
    line-height: 1.5;

}
table.type09 thead th {
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    color: #369;
    border-bottom: 3px solid #036;
}
table.type09 tbody th {
    width: 150px;
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
    background: #f3f6f7;
}
table.type09 td {
    width: 350px;
    padding: 10px;
    vertical-align: top;
    border-bottom: 1px solid #ccc;
}

</style>
</head>
<body>
<h2>수서 목록</h2>
<hr noshade="noshade">
<table class="type09">
	<tr>
		<th scope="cols">수서 번호</th>
		<th scope="cols">수서 상태</th>
		<th scope="cols">요청 번호</th>
		<th scope="cols">이용자 아이디</th>
		<th scope="cols">책 이름</th>
		<th scope="cols">저자</th>
		<th scope="cols">출판사</th>
		<th scope="cols">ISBN</th>

		<th>
		</th>
		
	</tr>
	<!-- forEach 부분 수정안함. -->
	<c:if test="${empty acquisitions}">

			<tr>
				<td colspan="8"> 수서등록이 0건 조회되었습니다. </td>
			</tr>

		</c:if>
  <c:forEach var="acquisition" items="${acquisitions}">
	<tr>
		<td class="center"  scope="row">
<form action="/admin/orderlist/insert" method="post">
		<input type="hidden" name="orderId" value="갸"/>
		<input type="hidden" name="acquisitionStatus" value="ACST02">
		<input type="hidden" name="acquisitionId" value="${acquisition.acquisitionId }"/>
		<input type="hidden" name="requestId" value="${acquisition.requestId }"/>
		<input type="hidden" name="title" value="${acquisition.title }"/>
		<input type="hidden" name="author" value="${acquisition.author }"/>
		<input type="hidden" name="publisher" value="${acquisition.publisher }"/>
		<input type="hidden" name="quantity" value="1"/>
		<input type="hidden" name="price" value="1"/>
		<input type="hidden" name="isbn" value="${acquisition.isbn }"/>
			<a href="${pageContext.request.contextPath}/admin/acquisition/select?acquisitionId=${acquisition.acquisitionId}">
			${acquisition.acquisitionId}
			</a>
		</td>
		<td  scope="row">
			<a href="${pageContext.request.contextPath}/admin/acquisition/select?acquisitionId=${acquisition.acquisitionId}">
			${acquisition.status}
			</a>
		</td>
		<td class="right"  scope="row">
			${acquisition.requestId}	
		</td>
		<td class="right"  scope="row">
			${acquisition.userId}	
		</td>
		<td class="right"  scope="row">
			${acquisition.title}
		</td>
		<td class="right" scope="row">
			${acquisition.author}
		</td>
		<td class="right" scope="row">
			${acquisition.publisher}
		</td>
		<td class="right" scope="row">
			${acquisition.isbn}


		<td scope="row">
			<c:if test="${not empty acquisitions }">
			<c:if test="${acquisition.status eq '주문대기' }">
				<input type="submit" value="주문등록"/>
			</c:if>
			</c:if>
			
		</td>
</form>
	</tr>
  </c:forEach>
</table>
<br/>
</body>
</html>