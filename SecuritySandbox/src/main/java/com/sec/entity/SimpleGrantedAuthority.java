package com.sec.entity;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Data;
@Entity
@Data
public class SimpleGrantedAuthority implements GrantedAuthority{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String authority;
	@ManyToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	Collection<CustomUser> users;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return authority;
	}
	public SimpleGrantedAuthority(String role) {
		this.authority=role;
	}

}
