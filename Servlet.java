package com.company;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/set")
public class Servlet extends HttpServletRequest {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        try {
            response.addCookie(new Cookie("user"));
            out.println("Cookie is set");
        }
        finally {
            out.close();
        }
    }
}
