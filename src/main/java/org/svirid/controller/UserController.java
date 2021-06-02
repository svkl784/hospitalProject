package org.svirid.controller;

import org.svirid.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
