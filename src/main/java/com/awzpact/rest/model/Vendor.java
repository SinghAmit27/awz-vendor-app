package com.awzpact.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer vendorId;
	@Column(name="name")
	private String vendorName;
	@Column(name="email")
	private String vendorEmail;
	@Column(name="password")
	private String vendorPassword;

	public Vendor() {
		super();
	}

	public Vendor(Integer vendorId, String vendorName, String vendorEmail, String vendorPassword) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorEmail = vendorEmail;
		this.vendorPassword = vendorPassword;
	}
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorEmail() {
		return vendorEmail;
	}

	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}

	public String getVendorPassword() {
		return vendorPassword;
	}

	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}

}
