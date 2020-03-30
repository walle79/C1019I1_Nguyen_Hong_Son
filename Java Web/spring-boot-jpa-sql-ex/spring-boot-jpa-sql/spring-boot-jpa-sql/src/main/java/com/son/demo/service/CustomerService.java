package com.son.demo.service;

import com.son.demo.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    List<Customer> search(String q);

    Customer findById(long id);

    void save(Customer customer);

    void delete(Customer customer);
}
