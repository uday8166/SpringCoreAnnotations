package com.te.springcorePureAnnotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcorePureAnnotation.bean.Person;
import com.te.springcorePureAnnotation.config.PersonConfig;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = context.getBean("person", Person.class);
		person.getPer();
		
		System.out.println(person);
	}
}
