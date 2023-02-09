package com.cogent.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.spring.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
