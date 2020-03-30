package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.Login;
import com.example.demo.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static com.example.demo.service.CustomerServiceImpl.customers;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
        for(Customer c: customers){
            if(c.getUsername().equals(username)
                    && c.getPassword().equals(password)){
                return "customer";
            }
        }
        return "error";
        }
    }

