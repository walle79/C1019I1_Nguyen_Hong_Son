package son.java.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import son.java.model.Service;

import java.util.List;

public interface ServiceRepository extends PagingAndSortingRepository<Service, Long> {
    Page<Service> findByNameContaining(String q, Pageable pageable);
}
