package com.son.service;

import com.son.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements  CustomerService{
    private static Map<Integer, Customer> customers = new HashMap<>();
    static {
        customers.put(1, new Customer(1, "Son", "Hue"));
        customers.put(2, new Customer(2, "Thuy", "DN"));
        customers.put(3, new Customer(3, "Tan", "QN"));
        customers.put(4, new Customer(4, "Minh", "Vinh"));
        customers.put(5, new Customer(5, "Ron", "HN"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void add(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customerList=new ArrayList<>();
        for (Map.Entry<Integer,Customer> entry : customers.entrySet()) {
            if(entry.getValue().getName().equals(name)) {
                customerList.add(entry.getValue());
            }
        }
        return customerList;
    }
}
