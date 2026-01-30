package cam_busanit501_calc_260130;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 한글 깨짐 방지 설정 (파라미터를 꺼내기 전 필수!)
        req.setCharacterEncoding("UTF-8");

        // 클라이언트가 보낸 숫자 데이터 받기
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        // 서버 콘솔에 출력하여 확인
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        // 여기에 계산 로직이나 결과 페이지 이동 코드를 추가할 수 있습니다.
    }
}
