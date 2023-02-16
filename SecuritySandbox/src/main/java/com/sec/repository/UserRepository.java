package com.sec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.entity.CustomUser;


public interface UserRepository extends JpaRepository<CustomUser,Integer>{
	public Optional<CustomUser> findByUsername(String username);
}
