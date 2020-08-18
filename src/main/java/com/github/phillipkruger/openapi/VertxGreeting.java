package com.github.phillipkruger.openapi;

import com.github.phillipkruger.openapi.model.Greeting;
import javax.enterprise.context.ApplicationScoped;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.core.http.HttpMethod;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationScoped
@RouteBase(path = "/vertx", produces = "application/json")
@Tag(name = "Vert.x Resource", description = "Basic Hello World using Vert.x")
public class VertxGreeting {

    @Route(path = "/hello", methods = HttpMethod.GET)
    public Greeting helloVertX() { 
        return new Greeting("Hello", "Vert.x");
    }    
}