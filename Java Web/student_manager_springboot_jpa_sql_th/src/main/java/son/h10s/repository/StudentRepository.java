package son.h10s.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import son.h10s.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    Page<Student> findByNameContaining(String q, Pageable pageable);

}
