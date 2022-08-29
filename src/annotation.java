import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/post")
public class main extends HttpServlet {
  @Override
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    PrintWriter out = response.getWriter();
    out.println("hi");
  }
}


//web.xml setting

<web-app xmlns>
metadata-complete="false"> setting (default true)
