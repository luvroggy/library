<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request update</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/admin/request/update" name="setForm" method="post">
	<table>
		<tr>
			<th colspan="2">요청 정보 수정</th>
		</tr>
		<tr>
			<td>요청번호</td>
			<td>
				<input type="text" name=requestId
				       required="required"
				       value="${request.requestId}"  />
			</td>
		</tr>
		<tr>
			<td>사용자 번호</td>
			<td>
				<input type="text" name="userId"
				       value="${request.userId}" />
			</td>
		</tr>
<tr>
				<td>*요청 상태</td>
				<td>
				<select name=requestStatus required="required">
                             <option value="">== 요청 상태 선택 ==</option>
                             <option value="RQST0100"> 요청취소 </option>
                             <option value="RQST0101"> 요청진행중 </option>
                             <option value="RQST0102"> 요청 완료</option>
                           
                    </select>
					
					</td>
			</tr>
			<tr>
				<td>*책 이름</td>
				<td><input type="text" name="title" size="20"
					value="${request.title}" required="required" />
					
					</td>
			</tr>
			<tr>
				<td>*저자</td>
				<td><input type="text" name="author" size="20"
					value="${request.author}" required="required" />
					
					</td>
			</tr>
			<tr>
				<td>*출판사</td>
				<td><input type="text" name="publisher" size="20"
					value="${request.publisher}" required="required" />
					
					</td>
			</tr>

		<tr>
			<td colspan="2" class="center">
				<input type="submit" value="수정하기"/> &nbsp;
				<input type="reset"  value="초기화"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>