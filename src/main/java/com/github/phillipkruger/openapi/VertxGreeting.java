package com.github.phillipkruger.openapi;

import com.github.phillipkruger.openapi.model.Greeting;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Param;
import javax.enterprise.context.ApplicationScoped;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import static io.quarkus.vertx.web.Route.HttpMethod.*;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationScoped
@RouteBase(path = "/vertx", produces = "application/json")
@Tag(name = "Vert.x Resource", description = "Basic Hello World using Vert.x")
public class VertxGreeting {

    @Route(path = "/hello", methods = GET)
    public Greeting helloVertX() { 
        return new Greeting("Hello", "Vert.x");
    }
    
    @Route(path = "/hello", methods = POST)
    public Greeting newHelloVertX(@Body Greeting greeting) {
        return greeting;
    }
    
    @Route(path = "/hello/:message", methods = DELETE)
    public boolean deleteHelloVertX(@Param("message") String message) {
        return true;
    }
}