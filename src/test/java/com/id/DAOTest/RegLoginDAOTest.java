package com.id.DAOTest;

import com.id.DAO.RegLoginDAO;
import com.id.DAO.RegLoginDAOImpl;
import com.id.regLogin.RegLogin;

public class RegLoginDAOTest {

	public static void main(String[] args)throws Exception {
		
		RegLogin reg=new RegLogin();
		reg.setName("madhu");
		reg.setEmail("m@gmail.com");
		reg.setPhoneNo("1234567890");
		reg.setPassword("pass1234");
		
		RegLoginDAO reglog=new RegLoginDAOImpl();
		reglog.reglog(reg);
		
		
		
	}

}
