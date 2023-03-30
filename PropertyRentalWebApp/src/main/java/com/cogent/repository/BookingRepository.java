package com.cogent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
