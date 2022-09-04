//생명주기 : 접속한 사용자가 다르면 다른 저장공간

import javax.servlet.http;

//중략

HttpSession session = request.getSession();
session.setAttribute("keyword", keyword);
int element = (Integer)session.getAttribute("keyword");


//timeOut : void setMaxInactiveInterval(int interval);
