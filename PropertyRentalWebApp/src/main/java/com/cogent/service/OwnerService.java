package com.cogent.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.cogent.entity.Owner;
import com.cogent.entity.Property;
import com.cogent.repository.OwnerRepository;

public class OwnerService {
	@Autowired
	OwnerRepository ownerRepository;
	
	public Owner createOwner(Owner owner) {
		return ownerRepository.save(owner);
	}
	public Owner findOwnerById(int id) {
		return ownerRepository.findById(id).orElseThrow();
	}
	public Owner findOwnerByUsername(String username) {
		return ownerRepository.findByUsername(username).orElseThrow();
	}
	public ArrayList<Property> findOwnerProperties(int id){
		return findOwnerById(id).getProperties();
	}
	public Owner updateOwner(Owner owner) {
		owner.setProperties(findOwnerProperties(owner.getOwner_id()));
		return ownerRepository.save(owner);
	}
	public void deleteOwnerById(int id) {
		ownerRepository.deleteById(id);
	}
	
}
