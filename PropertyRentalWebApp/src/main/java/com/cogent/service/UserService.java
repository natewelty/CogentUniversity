package com.cogent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cogent.entity.Booking;
import com.cogent.entity.User;
import com.cogent.repository.UserRepository;


public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public User readUserById(int id) {
		return userRepository.findById(id).orElseThrow();
	}
	
	public User readUserByUsername(String username) {
		return userRepository.findByUsername(username).orElseThrow();
	}
	
	public List<User> readAllUsers() {
		return userRepository.findAll();
	}
	
	public User updateUser(User user) {
		user.setBookingHistory(findUserBookingHistory(user.getUser_id()));
		return userRepository.save(user);
	}
	
	public void deleteUserById(int id) {
		userRepository.deleteById(id);
	}
	
	public ArrayList<Booking> findUserBookingHistory(int id){
		User storedUser = readUserById(id);
		return storedUser.getBookingHistory();
	}
}
