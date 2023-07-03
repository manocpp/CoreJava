package com.manoj.d2h;

public class Subscriber {
	//Instance variable
	private int sId;
	private String sName;
	private long contact;
	private String email;
	//Getters
	public int getsId() {
		return sId;
	}
	public String getsName() {
		return sName;
	}
	public long getContact() {
		return contact;
	}
	public String getEmail() {
		return email;
	}
	//Setters
	public void setsId(int sId) {
		this.sId = sId;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//Constructor
	public Subscriber(int sId, String sName, long contact, String email) throws InvalidSubscriberException {
		super();
		this.sId = sId;
		this.sName = sName;
		if((contact>9999999999L)||(contact<1000000000)) {
			throw new InvalidSubscriberException("Invalid Mobile Number");
		}else {
		this.contact = contact;
		}
		this.email = email;
	}
	//ToString
	@Override
	public String toString() {
		return "Subscriber [sId=" + sId + ", sName=" + sName + ", contact=" + contact + ", email=" + email + "]";
	}
	
}
