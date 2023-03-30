package com.cogent.entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int property_id;
	
	String address;
	String name;
	PropertyType type; //replace with enum
	
	@OneToMany(mappedBy = "property")
	ArrayList<Booking> bookingHistory;
	
	@ManyToOne
	@JoinColumn(name = "owner_id", nullable = false)
	Owner owner;
}

enum PropertyType {
	APARTMENT,
	HOUSE,
	CONDO;
}
