package com.github.phillipkruger.openapi;

import com.github.phillipkruger.openapi.model.Greeting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other/hello/*")
public class ServletGreeting extends HttpServlet {

    private static final Jsonb JSONB = JsonbBuilder.create();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {     
        response.setContentType("application/json");
        Greeting greeting = new Greeting("Hello", "Other");
        PrintWriter out = response.getWriter();   
        out.print(JSONB.toJson(greeting));
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        Greeting greeting = JSONB.fromJson(request.getInputStream(), Greeting.class);
        PrintWriter out = response.getWriter();   
        out.print(JSONB.toJson(greeting));
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
