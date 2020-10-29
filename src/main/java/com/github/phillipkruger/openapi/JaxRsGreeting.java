package com.github.phillipkruger.openapi;

import com.github.phillipkruger.openapi.model.Greeting;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/jax-rs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "JAX-RS Resource", description = "Basic Hello World using JAX-RS")
public class JaxRsGreeting {

    @GET
    @Path("/hello")
    public Greeting helloJaxRs() {
        return new Greeting("Hello", "JAX-RS");
    }

    @POST
    @Path("/hello")
    public Greeting newHelloJaxRs(Greeting greeting) {
        return greeting;
    }
    
    @DELETE
    @Path("/hello/{message}")
    public void deleteHelloJaxRs(@PathParam("message") String message) {
        // Here do the delete.
    }
}