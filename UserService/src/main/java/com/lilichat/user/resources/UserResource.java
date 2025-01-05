package com.lilichat.user.resources;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserResource {

    @Value("${variable}")
    private String profileName;

    @GetMapping("/users")
    public Object getUsers() {
        // TODO
        return "Config:" + profileName;
    }
}
