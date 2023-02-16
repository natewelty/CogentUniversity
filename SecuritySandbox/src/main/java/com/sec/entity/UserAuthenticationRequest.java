package com.sec.entity;

import lombok.Data;

@Data
public class UserAuthenticationRequest {
	String username;
	String password;
}
