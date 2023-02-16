package com.sec.entity;

import lombok.Data;

@Data
public class UserCreateRequest {
	String username;
	String password;
	String role;
}
