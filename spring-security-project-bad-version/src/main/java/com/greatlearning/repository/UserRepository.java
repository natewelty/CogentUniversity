package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUserName(String username);

}
