package com.github.phillipkruger.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.phillipkruger.openapi.model.Greeting;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other/hello/*")
public class ServletGreeting extends HttpServlet {

    @Inject
    ObjectMapper objectMapper;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {     
        response.setContentType("application/json");
        Greeting greeting = new Greeting("Hello", "Other");
        PrintWriter out = response.getWriter();
        objectMapper.writeValue(out, greeting);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        Greeting greeting = objectMapper.readValue(request.getInputStream(), Greeting.class);
        PrintWriter out = response.getWriter();   
        objectMapper.writeValue(out, greeting);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
