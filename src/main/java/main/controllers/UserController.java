package main.controllers;

import main.entity.User;
import main.repository.UserRepository;
import main.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Controller
public class UserController {

    @Autowired
    UserRepository repository;

    @Autowired
    private UserService service;



    @GetMapping("/")
    public String getUsers(ModelMap model) {
        model.addAttribute("users", repository.findAll());
        model.addAttribute("name", "Mikita");
        List<User> userList = repository.findAll();
        for (User u: userList
             ) {
            System.out.println(u.toString());
        }
        return "index";
    }

    @GetMapping("/new-user")
    public String newUsers(ModelMap modelMap) {
        modelMap.addAttribute("user",new User());
        return "create";
    }

    @PostMapping("/new-user")
    public String newUser(User user){
        repository.save(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        service.deleteUserById(id);
        return "redirect:/";
    }



}
