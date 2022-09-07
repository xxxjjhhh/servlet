import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/post")
public class main extends HttpServlet {
  
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    response.setContentType("text/html; charset=utf-8");
    
    RequestDispatcher rd = request.getRequestDispatcher("/jsp/post1.jsp");
    request.setAttribute("key1", "값1");
    request.setAttribute("key2", "값2");
    
    rd.forward(request, response);
  }
}
