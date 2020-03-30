package son.java.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import son.java.model.Service;

import java.util.List;

public interface ServiceService {
    Page<Service> findAll(Pageable pageable);

    Page<Service> search(String q, Pageable pageable);

    Service findById(long id);

    void save(Service service);

    void delete(Service service);
}
