package com.awzpact.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.awzpact.rest"})
public class AwzVendorRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwzVendorRestApplication.class, args);
	}

}
