package h10s.son.repository;

import h10s.son.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Page<Product> findByNameContaining(String q, Pageable pageable);

}
