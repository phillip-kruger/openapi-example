package com.github.phillipkruger.openapi;

import com.github.phillipkruger.openapi.model.Greeting;
import java.io.IOException;
import java.io.PrintWriter;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/other/hello")
public class ServletGreeting extends HttpServlet {

    private static final Jsonb JSONB = JsonbBuilder.create();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {     
        response.setContentType("application/json");
        Greeting greeting = new Greeting("Hello", "Other");
        PrintWriter out = response.getWriter();   
        out.print(JSONB.toJson(greeting));
   }
}
