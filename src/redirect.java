import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class main extends HttpServlet {
  
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    response.sendRedirect("/post");
  }
}
