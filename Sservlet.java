package com.company;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class Sservlet extends HttpServletRequest {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
            PrintWriter out = response.getWriter();
            try {
                out.println("Name: " + cookie.getValue());
            }
            finally {
                out.close();
            }
        }

    private class ServletException extends Exception {
    }
}
}
