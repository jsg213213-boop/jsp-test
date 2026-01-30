<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 30.
  Time: 오전 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메뉴 주문하기</title>
</head>
<body>
<h1>메뉴 주문 페이지</h1>
<hr>
<form action="/menu/makeResult" method="post">
    메뉴명: <input type="text" name="menuName" placeholder="메뉴를 입력하세요">
    <button type="submit">주문하기</button>
</form>
</body>
</html>
