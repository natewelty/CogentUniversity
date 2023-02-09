package com.cogent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.UserCreateRequest;
import com.cogent.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
	@Autowired
	UserService userService;
	
	public ResponseEntity createUser(@RequestBody UserCreateRequest userCreateRequest) {
		userService.createUser(userCreateRequest);
		return ResponseEntity.ok().build();
	}
	
}
