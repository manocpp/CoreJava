package com.manoj.d2h;

public class Package {
	//Instance Variable
	private int pkgId;
	private String pkgName;
	private int noOfChannels;
	private double cost;
	//Getters
	public int getPkgId() {
		return pkgId;
	}
	public String getPkgName() {
		return pkgName;
	}
	public int getNoOfChannels() {
		return noOfChannels;
	}
	public double getCost() {
		return cost;
	}
	//Setters
	public void setPkgId(int pkgId) {
		this.pkgId = pkgId;
	}
	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}
	public void setNoOfChannels(int noOfChannels) {
		this.noOfChannels = noOfChannels;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	//Constructor
	public Package(int pkgId, String pkgName, int noOfChannels, double cost) throws InvalidPackageException {
		super();
		this.pkgId = pkgId;
		this.pkgName = pkgName;
		if(noOfChannels<10) {
			throw new InvalidPackageException("Check Package List");
		}else {
		this.noOfChannels = noOfChannels;
		}
		this.cost = cost;
	}
	//ToString
	@Override
	public String toString() {
		return "Package [pkgId=" + pkgId + ", pkgName=" + pkgName + ", noOfChannels=" + noOfChannels + ", cost=" + cost
				+ "]";
	}
	
}
