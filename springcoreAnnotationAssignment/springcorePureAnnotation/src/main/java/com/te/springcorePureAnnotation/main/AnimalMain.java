package com.te.springcorePureAnnotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcorePureAnnotation.bean.Pet;
import com.te.springcorePureAnnotation.config.AllConfig;

public class AnimalMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Pet pet = context.getBean("putty", Pet.class);
		System.out.println(pet.getName());
		pet.call();
	}

}
