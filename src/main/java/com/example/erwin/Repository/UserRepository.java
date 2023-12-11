package com.example.erwin.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.erwin.entity.User;

public interface UserRepository extends CrudRepository<User,Long> {
    User findById(long id);

    User findByEmail(String email);

}
