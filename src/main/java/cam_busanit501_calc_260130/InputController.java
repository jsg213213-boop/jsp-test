package cam_busanit501_calc_260130;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 1. 요청 확인 로그
        System.out.println("InputController의 doGet 메서드 실행됨");

        // 2. 화면 이동 (WEB-INF 내부 파일은 서블릿을 통해서만 접근 가능)
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("/WEB-INF/_0130_1_calc/input.jsp");

        // 3. 포워딩 실행
        dispatcher.forward(req, resp);
    }
}
