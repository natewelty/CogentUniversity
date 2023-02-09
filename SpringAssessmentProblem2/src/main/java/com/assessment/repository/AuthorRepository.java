package com.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.entity.Author;

public interface AuthorRepository extends JpaRepository<Author,Integer>{
	
}
