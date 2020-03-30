package son.h10s.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import son.h10s.model.Product;

import java.util.List;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Page<Product> search(String h, Pageable pageable);

    Product findById(long id);

    void save(Product product);

    void delete(Product product);
}
