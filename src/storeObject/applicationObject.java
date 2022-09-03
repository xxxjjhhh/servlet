import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet("/post")
public class main extends HttpServlet {
  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
    
    //하나의 요청 form에 여러번 입력이 발생 따라서 한페이지에 여러번 요청이 발생하는 경우 이전 값 임시 저장 방법
    String keyword = request.getParameter("keyword");
    int element = 0;
    if(!keyword.equals("")) element = Integer.parseInt(keyword);
    
    ServletContext application request.getServletContext(); //저장용 객체(어플리케이션)
    application.setAttribute("element", element); //key value 값으로 저장
    
    int tmp = (Integer)application.getAttribute("element"); //불러오기 {객체타입이라} Rapper 작업
    
    PrintWriter out = response.getWriter();
    out.println("sum");
  }
}
