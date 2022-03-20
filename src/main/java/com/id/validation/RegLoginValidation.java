package com.id.validation;

import com.id.regLogin.RegLogin;

public class RegLoginValidation {
	
	public static void regLogValidation(RegLogin reg)throws Exception{
		
		if(reg.getName()==null) {
			throw new Exception("Invalid Name");
		}
		else if (reg.getEmail()==null) {
			throw new Exception("Invalid Email");
		}
		else if (reg.getPhoneNo()==null) {
			throw new Exception("Invalid phoneNumber");
		}
		else if (reg.getPassword()==null) {
			throw new Exception("Invalid password");
		}
		else {
		System.out.println("validation successful");
		}
		
	}
	
	

}
