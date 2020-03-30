package com.son.service;

import com.son.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void add(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void delete(int id);

    List<Customer> search(String name);
}
