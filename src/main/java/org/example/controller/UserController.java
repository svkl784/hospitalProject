package org.example.controller;

import org.example.model.entity.User;
import org.example.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showWelcome(){
        return "show-welcome";
    }

    @RequestMapping("/userRegister")
    public String userRegister(){
        return "show-user-register";
    }

//    @RequestMapping("/allUser")
//    public String showAllUser (Model model){
//        List<User> allEmployees = userService.getAllUser();
//        model.addAttribute("allUsers",allEmployees);
//        return "all-users";
//    }
}
