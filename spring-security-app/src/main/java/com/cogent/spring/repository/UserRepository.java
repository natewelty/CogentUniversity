package com.cogent.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserName(String name);
}
