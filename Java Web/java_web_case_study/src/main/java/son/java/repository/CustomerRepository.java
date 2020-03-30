package son.java.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import son.java.model.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Page<Customer> findByNameContaining(String q, Pageable pageable);

    }

