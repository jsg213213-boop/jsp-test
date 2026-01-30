package ex1_menu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="menuInputController", urlPatterns = "/menu/input")
public class MenuInputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("MenuInputController: 화면을 호출합니다.");

        // 지정된 경로의 JSP로 포워딩 (폴더명 주의: _0130_1_menu)
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("/WEB-INF/_0130_1_menu/menuInput.jsp");
        dispatcher.forward(req, resp);
    }
}
