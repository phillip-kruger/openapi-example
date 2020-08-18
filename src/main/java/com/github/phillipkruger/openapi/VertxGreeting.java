package com.github.phillipkruger.openapi;

import javax.enterprise.context.ApplicationScoped;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.core.http.HttpMethod;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationScoped
@RouteBase(path = "/vertx", produces = "text/plain")
@Tag(name = "Vert.x Resource", description = "Basic Hello World using Vert.x")
public class VertxGreeting {

    @Route(path = "/hello", methods = HttpMethod.GET)
    public String helloVertX() { 
        return "hello Vert.x";
    }    
}