package com.cogent.entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int owner_id;
	
	String username;
	String password;
	String name;
	String email;
	@OneToMany(mappedBy="owner")
	ArrayList<Property> properties;
	
}
