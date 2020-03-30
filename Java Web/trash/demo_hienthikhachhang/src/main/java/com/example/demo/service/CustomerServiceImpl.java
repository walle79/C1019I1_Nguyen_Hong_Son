package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers = new HashMap<>();
    static {
        customers.put(1, new Customer("Son", "Hue"));
        customers.put(2, new Customer("An", "QB"));
        customers.put(3, new Customer("Binh", "QT"));
        customers.put(4, new Customer("Nguyen", "TT-Hue"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
