package com.te.springcorePureAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.springcorePureAnnotation.bean.Address;
import com.te.springcorePureAnnotation.bean.Person;

@Configuration
//@ComponentScan(basePackages = "com.te.springcorePureAnnotation")
public class PersonConfig {
	@Bean(name = "address")
	public Address getAddress() {
		Address address= new Address();
		address.setHno(456);
		return address;
		
	}
	@Bean(name = "address1")
	public Address getAddress1() {
		Address address= new Address();
		address.setHno(987);
		return address;
		
	}
	
	@Bean(name = "person")
	public Person getPerson() {
		return new Person();
		
	}

}
