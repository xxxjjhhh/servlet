import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.webservlet;

@WebServlet("/post1")
public class main extends HttpServlet {
  
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
    //System.out.println("hi");
    //OutputStream os = response.getOutputStream();
    
    PrintWriter out = response.getWriter();
    out.println("hi");
  }
}
