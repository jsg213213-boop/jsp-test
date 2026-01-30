package com_busanit501.jsp_sever_project_260129;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Myservlet", value = "/hello2")
public class Myservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. 한글 깨짐 방지를 위한 설정
        response.setContentType("text/html;charset=UTF-8");

        // 2. 출력을 위한 PrintWriter 객체 생성
        PrintWriter out = response.getWriter();

        // 3. HTML 내용 출력
        out.println("<html>");
        out.println("<head><title>자기소개 페이지</title></head>");
        out.println("<body style='font-family: Arial, sans-serif; line-height: 1.6; padding: 20px;'>");
        out.println("<h1>안녕하세요! 저를 소개합니다.</h1>");
        out.println("<hr>");

        out.println("<ul>");
        out.println("<li><b>이름:</b> 정성규 (예시)</li>");
        out.println("<li><b>역할:</b> 열정 넘치는 백엔드 개발자</li>");
        out.println("<li><b>기술 스택:</b> Java, Spring Boot, MySQL, Servlet/JSP</li>");
        out.println("<li><b>한마디:</b> 효율적인 코드로 세상을 바꾸고 싶습니다!</li>");
        out.println("</ul>");

        out.println("<p style='color: blue;'>이 페이지는 Servlet을 통해 동적으로 생성되었습니다.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

