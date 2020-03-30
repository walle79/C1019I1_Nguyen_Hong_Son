package h10s.son.repository;

import h10s.son.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PhoneRepository extends PagingAndSortingRepository<Phone, Long> {
    Page<Phone> findByNameContaining (String h, Pageable pageable);
}
