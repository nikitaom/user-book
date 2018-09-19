package main.controllers;

import main.entity.User;
import main.repository.UserRepository;
import main.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class UserController {

    @Autowired
    UserRepository repository;

    @Autowired
    private UserService service;



    @GetMapping("/")
    public String getUsers(ModelMap model) {
        model.addAttribute("users", repository.findAll());
        return "index";
    }

    @GetMapping("/new-user")
    public String newUsers(ModelMap modelMap) {
        modelMap.addAttribute("user",new User());
        return "create";
    }

    @PostMapping("/new-user")
    public String newUser(User user){
        User user1 = repository.save(user);
        return "index";
    }



}
