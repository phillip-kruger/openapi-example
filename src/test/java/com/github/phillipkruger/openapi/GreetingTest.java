package com.github.phillipkruger.openapi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
public class GreetingTest {

    @Test
    public void testJaxRsEndpoint() {
        given()
          .when().get("/jax-rs/hello")
          .then()
             .statusCode(200)
             .body(containsString("Hello"),containsString("JAX-RS"));
    }

    @Test
    public void testSpringEndpoint() {
        given()
          .when().get("/spring/hello")
          .then()
             .statusCode(200)
             .body(containsString("Hello"),containsString("Spring"));
    }
    
    @Test
    public void testVertxEndpoint() {
        given()
          .when().get("/vertx/hello")
          .then()
             .statusCode(200)
             .body(containsString("Hello"),containsString("Vert.x"));
    }
    
    @Test
    public void testOtherEndpoint() {
        given()
          .when().get("/other/hello")
          .then()
             .statusCode(200)
             .body(containsString("Hello"),containsString("Other"));
    }
}