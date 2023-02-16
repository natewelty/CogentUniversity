package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.entity.SimpleGrantedAuthority;

public interface SimpleGrantedAuthorityRepository extends JpaRepository<SimpleGrantedAuthority,Integer>{

}