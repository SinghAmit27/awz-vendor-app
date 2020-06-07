package com.awzpact.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awzpact.rest.model.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Integer>{

	
	
	
}
