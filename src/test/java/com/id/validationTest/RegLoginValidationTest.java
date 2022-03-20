package com.id.validationTest;

import com.id.regLogin.RegLogin;
import com.id.validation.RegLoginValidation;

public class RegLoginValidationTest {
	public static void main (String[]args) throws Exception {
		
		RegLogin reg=new RegLogin();
		reg.setName("madhu");
		reg.setEmail("m@gmail.com");
		reg.setPhoneNo("1234567890");
		reg.setPassword("pass1234");
		
		System.out.println(reg);
		RegLoginValidation.regLogValidation(reg);
		
	}

}
