package h10s.son.service;

import h10s.son.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Page<Product> search(String q,Pageable pageable);

    Product findById(long id);

    void save(Product product);

    void delete(Product product);
}