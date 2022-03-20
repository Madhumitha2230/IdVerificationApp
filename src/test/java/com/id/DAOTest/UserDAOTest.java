package com.id.DAOTest;

import com.id.DAO.UserCardDAO;
import com.id.DAO.UserDAOImpl;
import com.id.user.UserCard;

public class UserDAOTest {

	public static void main(String[] args)throws Exception {
		
		UserCard user=new UserCard();
		user.setName("madhu");
		user.setEmail("m@gmail.com");
		user.setPhoneNo("1234567890");
		user.setCardName("pan");
		user.setCardNum("MADHU1234M");
		//user.setDate("2001-05-30");
		//user.setRenewalDate("2001-05-30");
		System.out.println(user);
		
		UserCardDAO userdao=new UserDAOImpl();
		userdao.addCard(user);

		
	}

}
