package com.servletdemo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int num = Integer.parseInt(request.getParameter("number"));
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Factorial of " + num + " is: " + fact + "</h2>");
        out.println("</body></html>");
    }
}