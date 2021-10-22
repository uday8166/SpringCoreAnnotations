package com.te.springcorePureAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Person {
	@Value("1")
	private int id;
	@Value("Laxmi")
	private String name;
	@Autowired
	@Qualifier("address")
	private Address address;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public void getPer() {
		address.getAdd();
		System.out.println("This person object is fetched!!!!!");
	}

}
