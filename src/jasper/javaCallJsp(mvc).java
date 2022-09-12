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
    request.setAttribute("key3", "값3");
    
    rd.forward(request, response);
  }
}

 
// 아래 JSP (post1.jsp)

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>post1</title>
  </head>
  <body>
  	${key1}<br>
  	${key2}<br>
    <%= request.getAttribute("key3") %>
  </body>
</html>

//범위 기반
${requestScope.key3}
