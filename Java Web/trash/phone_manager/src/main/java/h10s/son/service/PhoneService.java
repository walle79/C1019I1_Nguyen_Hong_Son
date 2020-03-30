package h10s.son.service;

import h10s.son.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PhoneService {
    Page<Phone> findAll(Pageable pageable);

    Page<Phone> search (String h, Pageable pageable);

    Phone findById (long id);

    void save(Phone phone);

    void delete(Phone phone);
}
