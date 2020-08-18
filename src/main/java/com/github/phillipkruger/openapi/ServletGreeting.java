package com.github.phillipkruger.openapi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other/hello")
public class ServletGreeting extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {     
        response.setContentType("text/plain");   
        PrintWriter out = response.getWriter();   
        out.print("hello Other");   
   }
}
