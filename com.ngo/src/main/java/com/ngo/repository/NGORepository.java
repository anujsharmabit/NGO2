package com.ngo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngo.entity.NGOPerson;
import com.ngo.entity.Payment;

@Repository
public interface NGORepository extends JpaRepository<NGOPerson,Long>{
	
	NGOPerson findByorganisationEmail(String organisationEmail);
	NGOPerson findByorganisationName(String organisationName);
	
	

}
