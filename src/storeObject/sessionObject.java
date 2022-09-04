import javax.servlet.http;

//중략

HttpSession session = request.getSession();
session.setAttribute("keyword", keyword);
int element = (Integer)session.getAttribute("keyword");
