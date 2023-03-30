package com.cogent.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public Optional<User> findByUsername(String username);
}
