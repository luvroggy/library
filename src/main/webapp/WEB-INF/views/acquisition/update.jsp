<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/admin/acquisition/update" name="acquisitionUpdate" method="post">
	<table>
		<tr>
			<th colspan="2">수서 정보 수정</th>
		</tr>
		
		<tr>
			<td>*수서 상태</td>
			<td>
			<input type="hidden" name="acquisitionId" value="${acquisition.acquisitionId }"/> 
							<select name="acquisitionStatus" required="required">
                             <option value="">== 수서 상태 선택 ==</option>
                             <option value="ACST01">수서 등록</option>
                             <option value="ACST02">주문</option>
                             <option value="ACST03">검수</option>
                             <option value="ACST04">책 정보 등록</option>
                             <option value="ACST05">입고 완료</option>
     
                    </select>
			</td>
		</tr>
		<tr>
			<td>요청 번호</td>
			<td>
				<input type="text" name="requestId"
				       value="${acquisition.requestId}" />
			</td>
		</tr>
		<tr>
			<td>관리자 아이디</td>
			<td>
				<input type="text" name="userId"
				       value="${acquisition.userId}" />
			</td>
		</tr>
		<tr>
			<td>책 이름</td>
			<td>
				<input type="text" name="title"
				       value="${acquisition.title}" />
			</td>
		</tr>
		<tr>
			<td>저자</td>
			<td>
				<input type="text" name="author"
				       value="${acquisition.author}" />
			</td>
		</tr>
		<tr>
			<td>출판사</td>
			<td>
				<input type="text" name="publisher"
				       value="${acquisition.publisher}" />
			</td>
		</tr>
		<tr>
			<td>ISBN</td>
			<td>
				<input type="text" name="isbn"
				       value="${acquisition.isbn}" />
			</td>
		</tr>
		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="저장하기"/> &nbsp;
				<input type="reset"  value="초기화"/>
			</td>			
		</tr>
		
	</table>
</form>
</body>
</html>