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
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int user_id;
	
	String username;
	String password;
	String name;
	String email;
	@OneToMany(mappedBy="renter")
	//@JsonIgnore
	ArrayList<Booking> bookingHistory;
	
}
