package com.test.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
