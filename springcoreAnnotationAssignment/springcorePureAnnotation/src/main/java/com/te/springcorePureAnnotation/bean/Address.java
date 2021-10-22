package com.te.springcorePureAnnotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Address {
//	@Value("123")
	private int hno;
	
	public void getAdd() {
		System.out.println("address is: bagalkot");
	}

}
