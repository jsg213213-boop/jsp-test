<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 29.
  Time: 오후 2:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input.jsp</title>
</head>
<body>
  <h1>get 버튼  입력 방식</h1>
  <form action="calcResult.jsp" method="post">
      <input type="number" name="num1">
      <input type="number" name="num2">
      <button type="submit">전송</button>
  </form>
</body>
</html>
