package com.ngo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.entity.NGOPerson;
import com.ngo.entity.Payment;
import com.ngo.repository.NGORepository;

@Service
public class NGOService {

	@Autowired
	private NGORepository ngoRepository;

	public NGOService(NGORepository ngoRepository) {
		super();
		this.ngoRepository = ngoRepository;
	}
	
	public NGOPerson saveNGOPerson(NGOPerson ngoPerson) {
		// TODO Auto-generated method stub
		return ngoRepository.save(ngoPerson);
	}
	
	
	public NGOPerson findByorganisationEmail(String organisationEmail) {
		return ngoRepository.findByorganisationEmail(organisationEmail);
	}
	public NGOPerson findByorganisationName(String organisationName) {
		return ngoRepository.findByorganisationName(organisationName);
	}

	
}
