package com.jwt.example.jwtexample3.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jwt.example.jwtexample3.Models.User;
import com.jwt.example.jwtexample3.Services.UserService;;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/users
    @GetMapping("/users")
    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }
        //http://localhost:8081/home/current
    @GetMapping("/current")
    public String getLoggedInUser(Principal principal){
        return principal.getName();
    }
}
