import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class main extends HttpServlet {
  
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
    
    int keyword = Interger.parseInt(request.getParameter("keyword");)
    
    PrintWriter out = response.getWriter();
    out.println("keyword");
  }
}
