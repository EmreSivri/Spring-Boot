package com.example.springsecurityandjwtintegrationswagger2apidocumentation.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class HelloSpringSecurity {

    @ApiOperation(value = "deneme1")
    @GetMapping(value = "/hellospringsecurity")
    public String helloSpringSecurity() {
        return "hello spring security";
    }
}
