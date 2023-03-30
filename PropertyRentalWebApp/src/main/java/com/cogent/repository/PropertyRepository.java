package com.cogent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer>{

}
