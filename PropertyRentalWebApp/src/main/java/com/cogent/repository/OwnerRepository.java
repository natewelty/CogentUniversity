package com.cogent.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner,Integer>{
	public Optional<Owner> findByUsername(String username);
}
