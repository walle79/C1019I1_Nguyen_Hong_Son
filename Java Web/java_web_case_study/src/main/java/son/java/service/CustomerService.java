package son.java.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import son.java.model.Customer;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> search(String q,Pageable pageable);

    Customer findById(long id);

    void save(Customer customer);

    void delete(Customer customer);
}
