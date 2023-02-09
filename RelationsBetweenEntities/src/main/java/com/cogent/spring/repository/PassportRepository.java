package com.cogent.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.spring.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport,Integer>{

}
