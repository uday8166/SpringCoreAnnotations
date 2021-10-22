package com.te.springcorePureAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorePureAnnotation.bean.Pet;

@Configuration
public class PetConfig {
	
	@Bean(name = "putty")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Champ");
		return pet;

	}

}
