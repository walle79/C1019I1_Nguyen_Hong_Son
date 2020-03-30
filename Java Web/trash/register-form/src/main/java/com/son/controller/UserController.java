package com.son.controller;

import com.son.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView("list");
        return modelAndView;
    }
}
