<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<!--form post로 값을 보내기위해 사용한다.  -->
	<form action="/update" method="post">
		<input type="hidden" name="i_board" value="${param.i_board}">
		
		<div>
			 <input name="text" placeHolder="제목" value="${updata.title}">
		</div>
		<div>
			 내용 : <textarea name="ctnt" placeHolder="내용">${updata.ctnt}</textarea>
		</div>
		<div>
			<input type="submit" value="글쓰기"><input type="reset"
				value="다시 작성">
		</div>
	</form>
</body>
</html>