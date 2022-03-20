package com.id.userTest;

import com.id.user.UserCard;

public class UserCardTest {

	public static void main(String[] args) throws Exception {
		
		UserCard user=new UserCard();
		user.setName("madhu");
		user.setEmail("m@gmail.com");
		user.setPhoneNo("123457890");
		user.setCardName("aadhar");
		user.setCardNum("1234567890098765");
		//user.setDateOfIssued("2001-05-30");
	//	user.parseDate
		
		System.out.println(user);
		
		
	
	}

}
