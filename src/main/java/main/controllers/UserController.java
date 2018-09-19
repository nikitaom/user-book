package main.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("/q")
    public String getUsers() {
              return "index";
    }

}
