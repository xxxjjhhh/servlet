//클라이언트에 값 저장


//cookie store
Cookie cookie1 = new Cookie("keyword", String.valueOf(keyword)); //문자타입 String으로 쿠키 저장
response.addCookie(cookie1); //클라이언트로 전송

//cookie load
Cookie cookies[] = request.getCookie();
String element = "";

if (cookies != null)
  for (Cookie cookie : cookies)
    if("keyword".equals(cookie.getName())){
      element = cookie.getValue();
      break;
    }
