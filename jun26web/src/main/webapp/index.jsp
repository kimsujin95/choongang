<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>네이버 : 당신의 검색</title>
</head>
<body>
	글을 씁니다.<br>
	<h1>가장 큰 글씨</h1>
	<a href="https://www.naver.com">네이버</a>
<% 
// 여기는 자바입니다.
int num = 10;
num += 1;
%>	
<hr>
num : <%=num %><br>

<%
for (int i = 2; i < 10; i++) {
	for (int j = 1; j < 10; j++) {
	%>
		<%=i %> X <%=j %> = <%=i * j %><br>
		
	<%
	}	
}
// for문 닫기
%>	

<a href="./main.jsp">메인으로</a>


</body>
</html>
