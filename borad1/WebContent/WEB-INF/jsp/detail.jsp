<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
	<a href ="/list">리스트로 돌아가기</a>
	<a href ="/del?i_board=${param.i_board}"><button>삭제</button></a>
	<a href ="/update?i_board=${param.i_board}"><button>수정</button></a>
	<div>
		<div>번호 : ${param.i_board}</div>
		<div>제목  : ${param.title}</div>
		<div>등록일시 : ${param.r_dt}</div>
		<hr>
		<div>내용 ${param.ctnt}</div>
	</div>
</body>
</html>