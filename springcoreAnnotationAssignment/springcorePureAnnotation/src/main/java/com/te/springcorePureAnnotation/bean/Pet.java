package com.te.springcorePureAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;



@Data
public class Pet {
	private String name;
	@Autowired
	@Qualifier("catty")
	private Animal animal;

	public void call() {
		animal.eat();
		animal.Speak();

	}

}
