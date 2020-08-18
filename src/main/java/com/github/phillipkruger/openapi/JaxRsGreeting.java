package com.github.phillipkruger.openapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/jax-rs")
@Produces(MediaType.TEXT_PLAIN)
@Tag(name = "JAX-RS Resource", description = "Basic Hello World using JAX-RS")
public class JaxRsGreeting {

    @GET
    @Path("/hello")
    public String helloJaxRs() {
        return "hello JAX-RS";
    }    
}