package com.te.springcorePureAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorePureAnnotation.bean.Animal;
import com.te.springcorePureAnnotation.bean.Cat;
import com.te.springcorePureAnnotation.bean.Dog;

@Configuration
public class AnimalConfig {
	@Bean(name = "doggy")
	public Animal getDog() {
		return new Dog();
		
	}
	@Bean(name = "catty")
	public Animal getCat() {
		return new Cat();
		
	}

}
