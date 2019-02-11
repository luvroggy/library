<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request detailList</title>
<script type="text/javascript">
	// 삭제 전 확인 질문
	function confirmRemove(code) {
		var yes = confirm(code + " 정보를 "
				         +"삭제하시겠습니까?");
		return yes;
	}

</script>  
<body>
<form action="${pageContext.request.contextPath}/admin/request/update" name="getForm" >
	<table>
		<tr>
			<th colspan="2">요청 상세 정보</th>
		</tr>
		<tr>
			<td>요청번호</td>
			<td> ${request.requestId}
<!-- 				<input type="hidden" name="requestId" -->
<%-- 				       value="${request.requestId}"/> --%>
<!-- 				<input type="hidden" name="userId" -->
<%-- 				       value="${request.userId}"/> --%>
<!-- 				<input type="hidden" name="title" -->
<%-- 				       value="${request.title}"/> --%>
<!-- 				<input type="hidden" name="author" -->
<%-- 				       value="${request.author}"/> --%>
<!-- 				<input type="hidden" name="publisher" -->
<%-- 				       value="${request.publiser}"/> --%>
			</td>
		</tr>
		<tr>
			<td>사용자 번호</td>
			<td>${request.userId}</td>
		</tr>
<!-- 		<tr> -->
<!-- 			<td>요청 타입</td> -->
<%-- 			<td>${requestTypeName}</td> --%>
<!-- 		</tr> -->

			<tr>
			<td>요청 상태</td>
			<td>${requestStatusName}</td>
		</tr>

			<tr>
			<td>책 이름</td>
			<td>${request.title}</td>
		</tr>

			<tr>
			<td>저자</td>
			<td>${request.author}</td>
		</tr>

			<tr>
			<td>출판사</td>
			<td>${request.publisher}</td>
		</tr>
		<tr>
			<td>등록 일자</td>
			<td>${request.regdt}</td>
		</tr>
		<tr>
			<td>수정 일자</td>
			<td>${request.moddt}</td>
		</tr>


		<tr>
			<td colspan="2" class="center">
				<a href="/admin/acquisition/insert">수서등록</a>
				<a href="/admin/request/update?requestId=${request.requestId }">수정하기</a>
				
				<a href="/admin/request/delete?requestId=${request.requestId }" 
				   onclick="return confirmRemove('${request.requestId}');">
				삭제하기
				</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>