import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class main extends HttpServlet {
  
  public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
    System.out.println("hi");
  }
}



//compile option (error)
javac -cp 위치servlet-api.jar servlet_main.java
javac -cp /apache-tomcat-9.0/lib/servlet-api.jar servlet_main.java

//class파일 생성
//location

WEB-INF 폴더
/ ROOT
    /index.html
    / WEB-INF
        / web.xml
        / classes
            / servlet_main.java
