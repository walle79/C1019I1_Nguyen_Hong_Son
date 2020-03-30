package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Login;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl {
    public static List<Customer> customers = new ArrayList<>();
    static {
        Customer c1 = new Customer();
        c1.setUsername("a123456");
        c1.setPassword("123456");
        c1.setMail("a123456@gmail.com");
        c1.setHello("Xin chào các bạn, mình là a123456");
        customers.add(c1);

        Customer c2 = new Customer();
        c2.setUsername("b123456");
        c2.setPassword("123456");
        c2.setMail("b123456@gmail.com");
        c2.setHello("Xin chào các bạn, tớ là b123456");
        customers.add(c2);

        Customer c3 = new Customer();
        c3.setUsername("c123456");
        c3.setPassword("123456");
        c3.setMail("c123456@gmail.com");
        c3.setHello("Xin chào các bạn, tui là c123456");
        customers.add(c3);
    }
}
