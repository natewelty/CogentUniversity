package com.cogent.util;

public class JwtUtil {
	private Boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}
	public String generateToken(String username) {
		Map<String,>
	}
}
