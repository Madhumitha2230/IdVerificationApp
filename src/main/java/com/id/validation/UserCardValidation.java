package com.id.validation;

import com.id.user.UserCard;

public class UserCardValidation {
	
	public static  void usercardvalidation(UserCard user)throws Exception{
		
		if(user.getName()==null) {
			throw new Exception("Invalid name");
		}
		else if (user.getEmail()==null) {
			throw new Exception("Invalid email");
		}
		else if (user.getPhoneNo()==null) {
			throw new Exception("Invalid phoneNumber");
		}
		else if (user.getCardName()==null) {
			throw new Exception("Invalid CardName");
		}
		else if (user.getCardNum()==null) {
			throw new Exception("Invalid CardNumber");
		}
		else if(user.getDateOfIssued()==null) {
			throw new Exception("Invalid date");
		}
		else if(user.getRenewalDate()==null) {
			throw new Exception("Invalid date");
		}
		else {
			System.out.println("Validation Card");
		}
		
	}

}
