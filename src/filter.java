import java.io.IOException;


public class servletFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    
  }
  
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    
      chain.doFilter(request, response); // 다음 filter 또는 serlvet에 수행을 넘김 (함수 call) (미들웨어 개념)
  }
  
  @Override
  public void destroy() {
    
  }
}




//Filter Setting

-> xml : 
<filter>
  <filter-name>filtername1</filter-name>
  <filter-class>package명.class명</filter-class>
</filter>
<filter-mapping>
  <filter-name>filtername1</filter-name>
  <url-pattern>/post</url-pattern>
</filter-mapping>

-> Annotation : 
