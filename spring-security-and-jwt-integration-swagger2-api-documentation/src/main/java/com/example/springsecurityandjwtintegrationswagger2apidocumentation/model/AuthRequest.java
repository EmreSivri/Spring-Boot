package com.example.springsecurityandjwtintegrationswagger2apidocumentation.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class AuthRequest {

    @ApiModelProperty
    private String username;
    @ApiModelProperty
    private String password;

    public AuthRequest() {

    }

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
