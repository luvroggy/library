<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <!-- form action, name, onsubmit 수정안함. -->
<form action="register" name="myForm" onsubmit="return submitMyForm();" method="post">
		<table>
			<tr>
				<td colspan="2" style="text-align: center;">대여정보 등록</td>
			</tr>
			<tr>
				<td>*대여 번호</td>
				<td><input type="text" name="rentalId" size="10"
					required="required" /></td>
			</tr>
		
			<tr>
				<td>*책 번호</td>
				<td><input type="text" name="bookId" size="10"
					required="required" /></td>
			</tr>
			
			<tr>
				<td>*사용자 아이디</td>
				<td><input type="text" name="userId" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*대여 상태</td>
				<td>
					<select name="rentalStatus" required="required">
                             <option value="">== 대여 상태 선택 ==</option>
                             <option value="BKST0100">예약 가능</option>
                             <option value="BKST0101">예약 불가</option>
                             <option value="BKST0200">대출 가능</option>
                             <option value="BKST0201">대출 불가</option>
                    </select>
				</td>
			</tr>
			<tr>
				<td>*대여 번호</td>
				<td><input type="text" name="rentalNumber" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*반납 예정일</td>
				<td><input type="text" name="dueDate" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td>*대여 일자</td>
				<td><input type="text" name="rentalDate" size="20"
					required="required" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
				<input type="submit" value="등록하기" /> 
				<input type="reset" value="초기화" /></td>
			</tr>
		</table>
	</form>
</body>
</html>