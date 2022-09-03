//HTML 전송 form 내부에서 동일한 name으로 여러개 전송하면 배열로 전송됨.

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/post")
public class main extends HttpServlet {
  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
    
    //기존int keyword = Interger.parseInt(request.getParameter("keyword");)
    int sum = 0;
    
    String arr[] = request.getParameterValues("keyword");
    for(int i = 0; i < arr.length;; ++i){
      int element = Integer.parseInt(arr[i]);
      sum += element;
    }
    
    PrintWriter out = response.getWriter();
    out.println("sum");
  }
}
