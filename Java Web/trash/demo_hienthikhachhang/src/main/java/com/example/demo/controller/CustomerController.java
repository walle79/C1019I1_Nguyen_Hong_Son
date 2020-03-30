package com.example.demo.controller;

import com.example.demo.service.CustomerService;
import com.example.demo.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/")
    public String show(Model model){
        model.addAttribute("customers",customerService.findAll());
        return "list";
    }
}
