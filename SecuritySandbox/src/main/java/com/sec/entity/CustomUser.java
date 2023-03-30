package com.sec.entity;

import java.util.Collection;

import org.springframework.security.core.userdetails.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class CustomUser extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String username;
	String password;
	boolean enabled;
	boolean accountNonExpired;
	boolean credentialsNonExpired;
	boolean accountNonLocked;
	@ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "id")
	Collection<SimpleGrantedAuthority> authorities;
	public CustomUser(String username, String password, Collection<SimpleGrantedAuthority> authorities) {
		super(username, password, authorities);
		
	}
}