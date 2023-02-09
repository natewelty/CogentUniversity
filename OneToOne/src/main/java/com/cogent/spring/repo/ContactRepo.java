package com.cogent.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.spring.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact,Integer>{

}
