package com.codegym.demojpa.repository;



import java.util.List;

import com.codegym.demojpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByNameContaining(String q);

}