package com.github.phillipkruger.openapi;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/spring", produces = MediaType.TEXT_PLAIN_VALUE)
@Tag(name = "Spring Resource", description = "Basic Hello World using Spring")
public class SpringGreeting {

    @GetMapping(value = "/hello")
    public String helloSpring() {
        return "hello Spring";
    }
    
}