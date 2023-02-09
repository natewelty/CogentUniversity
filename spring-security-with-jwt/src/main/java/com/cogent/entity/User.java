package com.cogent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "USER_TBL")
public class User {
	@Id
	private int id;
	private String userName;
	private String passowrd;
	private String email;
}
