package com.test.jpa.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Query("SELECT obj FROM User obj WHERE obj.salary >= :minSalary AND obj.salary <= :maxSalary")
	Page<User> searchBySalary(Double minSalary, Double maxSalary, Pageable pageable);

}
