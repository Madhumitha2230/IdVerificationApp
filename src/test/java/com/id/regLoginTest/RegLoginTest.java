package com.id.regLoginTest;
import com.id.regLogin.*;
public class RegLoginTest {

	public static void main(String[] args)throws Exception {
		
		RegLogin reg=new RegLogin();
		reg.setName("madhu");
		reg.setEmail("m@gmail.com");
		reg.setPhoneNo("1234567890");
		reg.setPassword("pass1234");
		
	    System.out.println(reg);

	}

}
