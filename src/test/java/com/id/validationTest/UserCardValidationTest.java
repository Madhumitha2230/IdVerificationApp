package com.id.validationTest;

import com.id.user.UserCard;
import com.id.validation.UserCardValidation;

public class UserCardValidationTest {

	public static void main(String[] args)throws Exception {
		
		UserCard user=new UserCard();
		user.setName("madhu");
		user.setEmail("m@gmail.com");
		user.setPhoneNo("1234567890");
		user.setCardName("pan");
		user.setCardNum("MADHU1234M");
		//user.setDateOfIssued("madhu");
		System.out.println(user);
		UserCardValidation.usercardvalidation(user);
		
	}

}
