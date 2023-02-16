package com.sec.controller;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sec.entity.CustomUser;
import com.sec.entity.SimpleGrantedAuthority;
import com.sec.entity.UserCreateRequest;
import com.sec.repository.UserRepository;

@RestController
public class ResourceController {
	@Autowired
	UserRepository userRepository;
    @PostMapping("/signup")
    public String createUser(@RequestBody UserCreateRequest user) {
    	Optional<CustomUser> dbCheck = userRepository.findByUsername(user.getUsername());
    	if(dbCheck.isPresent()) {
    		return "That user already exists you big dummy";
    	}
    	else {
    		userRepository.save(new CustomUser(user.getUsername(),user.getPassword(),Arrays.asList(new SimpleGrantedAuthority(user.getRole()))));
    	}
    	return "User created.";
    }
	
	@GetMapping("/login")
    public String loginEndpoint() {
        return "Login!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Admin!";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "User!";
    }

    @GetMapping("/all")
    public String allRolesEndpoint() {
        return "All Roles!";
    }

    @DeleteMapping("/delete")
    public String deleteEndpoint(@RequestBody String s) {
        return "I am deleting " + s;
    }
}
