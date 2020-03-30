package com.son.service;

import com.son.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    Page<User> findAll(Pageable pageable);

    List<User> search(String q);

    User findById(long id);

    void save(User user);

    void delete(User user);
}
