package com.vivcloud.sso.oauth.controller;

import com.vivcloud.sso.oauth.utils.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SSOController {

    @GetMapping("/")
    public String welcome() {
        return Constants.WELCOME_MSG;
    }


    @GetMapping(Constants.GET_USER_DETAILS)
    public Principal getPrincipal(Principal principal) {
        System.out.println("Username: " + principal.getName());
        return principal;
    }
}
