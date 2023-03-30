package com.cogent.entity;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int booking_id;
	
	LocalDate arrival;
	LocalDate departure;
	Period duration;
	Boolean archived;
	@ManyToOne
	@JoinColumn(name="user_id",nullable = false)
	User renter;
	@ManyToOne
	@JoinColumn(name = "property_id", nullable = false)
	Property property;
	
	
	
}
