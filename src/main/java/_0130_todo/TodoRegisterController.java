package _0130_todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoRegisterController", urlPatterns = "/todo/register")
public class TodoRegisterController extends HttpServlet {

    // 1. 등록 폼 화면 제공 (GET)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(req, resp);
    }

    // 2. 등록 처리 (POST) 및 리다이렉트 (PRG 패턴)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String title = req.getParameter("title");
        System.out.println("새로운 일정 등록: " + title);

        // 등록 완료 후 목록 페이지로 리다이렉트 (PRG 패턴의 핵심)
        resp.sendRedirect("/todo/list");
    }
}
