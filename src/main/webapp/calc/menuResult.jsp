<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 26. 1. 29.
  Time: 오후 3:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
    <title>메뉴주문 결과 영수증</title>
</head>
<body>
<h1>주문 영수증</h1>
<hr>
<h3>주문 메뉴 : ${param.menuName}</h3>

<%-- 메뉴에 따라 가격을 다르게 보여주고 싶을 때 사용하는 간단한 조건식 예시 --%>
<h3>가격 :
    ${param.menuName == '탕수육' ? '5,000원' :
            param.menuName == '고기짬뽕' ? '8,000원' : '13,000원'} 입니다.
</h3>

<p>주문이 완료되었습니다!</p>
</body>
</html>
