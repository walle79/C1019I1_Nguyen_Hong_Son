package son.h10s.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import son.h10s.model.Student;

public interface StudentService {
    Page<Student> findAll(Pageable pageable);

    Page<Student> search(String h, Pageable pageable);

    Student findById(long id);

    void save(Student student);

    void delete(Student student);
}
