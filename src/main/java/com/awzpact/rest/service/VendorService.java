package com.awzpact.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awzpact.rest.model.Vendor;
import com.awzpact.rest.repository.VendorRepository;




@Service
public class VendorService {
	
	@Autowired
	private VendorRepository vendorRepo;
	
	
	public List<Vendor> getVendorList() {
		return vendorRepo.findAll();
	}
	
	public Vendor createVendor(Vendor vendor) {
		return vendorRepo.save(vendor);
	}
	
	public Vendor getVendorById(int id) {
		return vendorRepo.findById(id).get();
	}
	
	public void deleteVendorById(int id) {
		vendorRepo.deleteById(id);
	}
	
	public Vendor updateVendor(Vendor vendor) {
		Vendor existingVendor = vendorRepo.findById(vendor.getVendorId()).orElse(null);
		existingVendor.setVendorName(vendor.getVendorName());
		existingVendor.setVendorEmail(vendor.getVendorEmail());
		return vendorRepo.save(existingVendor);
	}


}
