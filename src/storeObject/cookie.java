//클라이언트에 값 저장


//cookie store
Cookie cookie = new Cookie("keyword", String.valueOf(result));
response.addCookie(cookie);

//cookie load
Cookie[] cookies = request.getCookie();
String element = "";

if (cookies != null)
  for (Cookie cookie : cookies)
    if("keyword".equals(cookie.getName()))
      element = cookie.getValue();
