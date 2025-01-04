package com.lilichat.user.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @GetMapping("/users")
    public Object getUsers() {
        // TODO
        return "Student list will be returned";
    }
}
