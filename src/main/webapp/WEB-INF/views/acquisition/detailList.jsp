<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/acquisition/update" name="acquisitionGet" >
	<table>
		<tr>
			<th colspan="2">수서 상세 정보</th>
		</tr>
		<tr>
			<td>수서 번호</td>
			<td> ${acquisition.acquisitionId}
				<input type="hidden" name="acquisitionId"
				       value="${acquisition.acquisitionId}"/>
			</td>
		</tr>
		<tr>
			<td>수서 상태</td>
			<td>${acquisition.acquisitionStatus}</td>
		</tr>
		<tr>
			<td>요청 번호</td>
			<td>${acquisition.requestId}</td>
		</tr>
		<tr>
			<td>관리자 아이디</td>
			<td>${acquisition.userId}</td>
		</tr>
		<tr>
			<td>책 이름</td>
			<td>${acquisition.title}</td>
		</tr>
		<tr>
			<td>저자</td>
			<td>${acquisition.author}</td>
		</tr>
		<tr>
			<td>출판사</td>
			<td>${acquisition.publisher}</td>
		</tr>
		<tr>
			<td>ISBN</td>
			<td>${acquisition.isbn}</td>
		</tr>
		<tr>
			<td>등록 일자</td>
			<td>${acquisition.regdt}</td>
		</tr>
			<tr>
			<td>수정 일자</td>
			<td>${acquisition.moddt}</td>
		</tr>
	
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="수정하기"/>
				<a href="/admin/acquisition/delete?acquisitionId=${acquisition.acquisitionId}" 
				   onclick="return confirmRemove('${acquisition.acquisitionId}');">
				삭제하기
				</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>