<%@page import="com.poseidon.dao.MemberDAO"%>
<%@page import="com.poseidon.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
// DAO / DTO / DBConnection
MemberDTO dto = new MemberDTO();
dto.setMid(id);
dto.setMpw(pw);

// DAO 불러오기
MemberDAO dao = new MemberDAO();
MemberDTO result = dao.login(dto);
%>


	당신이 입력한 값은?<br>
	id : <%=id %><br>
	pw : <%=pw %><br>
	통신 결과 <%=result.getMname() %>
</body>
</html>
