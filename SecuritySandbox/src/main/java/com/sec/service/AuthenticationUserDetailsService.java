package com.sec.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.sec.entity.CustomUser;
import com.sec.repository.UserRepository;

public class AuthenticationUserDetailsService implements UserDetailsService {
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<CustomUser> user = userRepository.findByUsername(username);
		return user.get();
	}

}
