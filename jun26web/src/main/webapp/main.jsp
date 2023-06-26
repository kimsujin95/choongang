<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main입니다</title>

<style type="text/css">
 /* 스타일영역입니다 */
 table {
    width : 100%;
    height: 500px;
    /* 테이블의 선을 단선으로 만든다 */
    border-collapse: collapse;
 }
 
 td {
    border-bottom : 1px red solid;
    text-align: center;
 }
 
 /* id="title" --> #title */
 #title {
    text-align: left;
 }
 /* 호버 */
 tr:hover {
   background-color: silver;
   color: red;   
 }
 
</style>
</head>
<body>
   <a href="./index.jsp">index로 가기</a>
   <table>
      <tr>
         <td style="width: 10%">번호</td>
         <td style="width: 50%">제목</td>
         <td style="width: 10%">글쓴이</td>
         <td style="width: 10%">조회수</td>
         <td style="width: 20%">쓴날짜</td>
      </tr>
      <%for(int i = 10; i > 0; i--) { %>
	      <tr>
	         <td><%=i %></td>
	         <td id="title" title="마우스 올리면 나올 글">열번째 글</td>
	         <td>홍길동</td>
	         <td>5</td>
	         <td>2023-06-26</td>
	      </tr>
      <%} %>
   </table>
   
   
   java -> sql -> html/css/javaScript/ jq -> xml, json
   
   
   
</body>
</html>
