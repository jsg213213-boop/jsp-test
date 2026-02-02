package _0202_todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoListController", urlPatterns = "/_0202_todo/list")
public class TodoListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("일정 목록을 조회합니다.");

        // 명세에 따른 경로 설정
        req.getRequestDispatcher("/WEB-INF/_0202_todo/list.jsp").forward(req, resp);
    }
}