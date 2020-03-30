package h10s.son.service;

import h10s.son.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> search (String h, Pageable pageable);

    Customer findById (long id);

    void save(Customer customer);

    void delete(Customer customer);
}
