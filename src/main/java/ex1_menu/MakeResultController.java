package ex1_menu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="makeResultController", urlPatterns = "/menu/makeResult")
public class MakeResultController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 1. POST 방식 한글 깨짐 방지
        req.setCharacterEncoding("UTF-8");

        // 2. 파라미터 값 추출
        String menuName = req.getParameter("menuName");

        // 3. 콘솔에 로그 기록 (결과 출력)
        System.out.println("===============================");
        System.out.println("주문 받은 메뉴 : " + menuName + " 입니다.");
        System.out.println("===============================");

        // 4. 화면 응답 (더미 화면으로 이동 또는 간단한 메시지)
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().print("<h1>주문이 접수되었습니다. 콘솔을 확인하세요!</h1>");
    }
}
