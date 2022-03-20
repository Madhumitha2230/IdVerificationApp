package com.id.regLogin;

public class RegLogin {
	
	private Integer id;
	private String name;
	private String email;
	private String phoneNo;
	private String password;
    
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User Registration Detail \nname= "+name +" \nemail= "+email+ "\nphoneNo=" +phoneNo+ "\npassword= "+password +"]";
	}
	

}
