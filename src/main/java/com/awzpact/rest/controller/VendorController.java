package com.awzpact.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awzpact.rest.model.Vendor;
import com.awzpact.rest.service.VendorService;



@RestController
@RequestMapping("/api/v1/")
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@GetMapping("vendor")
	public List<Vendor> getVendorList() {
		return vendorService.getVendorList();
	}
	
	@PostMapping("vendor")
	public Vendor createVendor(@RequestBody Vendor vendor) {
		return vendorService.createVendor(vendor);
	}
	
}
