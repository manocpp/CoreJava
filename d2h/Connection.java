package com.manoj.d2h;

public class Connection {
	//Instanse variable
	private int connId;
	private Subscriber subscriber;
	private Package pkg;
	private String sDate;
	//Constructor
	public Connection(int connId, Subscriber subscriber, Package pkg, String sDate) {
		super();
		this.connId = connId;
		this.subscriber = subscriber;
		this.pkg = pkg;
		this.sDate = sDate;
	}
	//Getters
	public int getConnId() {
		return connId;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}
	public Package getPkg() {
		return pkg;
	}
	public String getsDate() {
		return sDate;
	}
	//Setters
	public void setConnId(int connId) {
		this.connId = connId;
	}
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	public void setPkg(Package pkg) {
		this.pkg = pkg;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	//TpoString
	@Override
	public String toString() {
		return "Connection [connId=" + connId + ", subscriber=" + subscriber + ", pkg=" + pkg + ", sDate=" + sDate
				+ "]";
	}
	
}
