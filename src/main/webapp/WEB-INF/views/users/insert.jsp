<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>users insert</title>

</head>
<body>
<br>
<br>
 <!-- form action, name, onsubmit 수정안함. -->
<form action="/users/insert" name="userInsert" onsubmit="return submitMyForm();" method="post">
		<table> 
			<tr>
				<td colspan="2" style="text-align: center;">회원 등록</td>
			</tr>
			<tr>
				<td>*아이디</td>
				<td><input type="text" name="userId" size="10"
					required="required" /></td>
			</tr>
			<tr>
				<td>*비밀번호</td>
				<td><input type="password" name="password" size="10"
					required="required" />
					<br/>
					<span id="pwErr" class="errSpan"></span>
					</td>
			</tr>
			<tr>
                          <td class="title">*비밀번호 확인</td>
                          <td>
                                   <input type="password" name="pwconfirm"
                                              size="10" required="required" onblur="checkPassword();"/>
                                   <br/>
                                   <span id="pwcnfrmSpan" class="errSpan"></span>
                          </td> <!-- onblur 이벤트 핸들러는 커서(포커스)가 이 엘리먼트를 떠날 때 발생하는 blur 이벤트를 잡아 수행 -->
                 </tr>
			<tr>
				<td>*이름</td>
				<td><input type="text" name="userName" size="10"
					required="required" /></td>
			</tr>
			<tr>
				<td>*이메일</td>
				<td>
					<input type="text" name="emailid"
                    size="10" required="required"/> @
<!--                              select[name="maildomain"]>option[value=""]*5 -->
                    <select name="maildomain" required="required">
                             <option value="">== 메일주소 선택 ==</option>
                             <option value="naver.com">네이버</option>
                             <option value="hanmail.net">다음</option>
                             <option value="google.com">구글</option>
                             <option value="nate.com">네이트</option>
                    </select>
                    <!-- emailid @ emaildomain을 세팅할 숨겨진 인풋 -->
                    <input type="hidden" name="userEmail"/>
					
					</td>
			</tr>
			<tr>
				<td>*분류</td>
				<td>
					<select name="userPosition" required="required">
                             <option value="">== 분류 선택 ==</option>
                             <option value="Posi01">학부생</option>
                             <option value="Posi02">대학원생</option>
                             <option value="Posi03">교직원</option>
                             <option value="Posi04">교수</option>
                             <option value="Posi05">시민</option>
                            
                           
                    </select>
					
					</td>
					
					
			</tr>
			<tr>
				<td>*소속</td>
				<td><input type="text" name="userAssigned" size="20"
					required="required" />
					
					</td>
			</tr>
			<tr>
				<td>*직업</td>
				<td>
					<select name="userGrade" required="required">
                             <option value="">== 직업 선택 ==</option>
                             <option value="Posi01">학부생</option>
                             <option value="Posi02">대학원생</option>
                             <option value="Posi03">교직원</option>
                             <option value="Posi04">교수</option>
                             <option value="Posi05">시민</option>
                    </select>
					
				</td>
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