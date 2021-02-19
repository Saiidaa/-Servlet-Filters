package com.company;

import java.net.CookieStore;

public class HttpServletRequest {
    public void getParameter(String firstname) {

    }

    public void setAttribute(String firstname, String firstName) {
    }

    private CookieStore request;
    Cookie[] cookies = request.getCookies();
    String cookieName = "user";
    Cookie cookie = null;
    if(cookies !=null) {
        for(Cookie c: cookies) {
            if(cookieName.equals(c.getName())) {
                cookie = c;
                break;
            }
        }
    }

    protected Cookie[] getCookies() {
    }
}
