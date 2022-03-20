package com.id.user;

import java.sql.Date;

public class UserCard {
	
	private String name;
	private String email;
	private String phoneNo;
	private String cardName;
	private String cardNum;
	private Date dateOfIssued;
	private Date renewalDate;
	
	
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
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public Date getDateOfIssued() {
		return dateOfIssued;
	}
	public void setDateOfIssued(Date dateOfIssued) {
		this.dateOfIssued = dateOfIssued;
	}
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	
	public String toString() {
		return "CardDetails\nname= "+name +" \nemail= "+email+ "\nphoneNo= " +phoneNo+ "\ncardName= "+cardName +"\ncarNum= "+cardNum+"\ndateOfIssued= "+dateOfIssued+"\nrenewalDate= "+renewalDate+"]";
		
	}

}
