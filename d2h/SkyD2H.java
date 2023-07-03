package com.manoj.d2h;

import java.util.ArrayList;

public class SkyD2H {
	private ArrayList<Connection> connList=new ArrayList<Connection> ();
	private ArrayList<Package> pkgList=new ArrayList<Package>();
	
	public void addConnection(Connection conn) {
		connList.add(conn);
	}
	public void addPackage(Package pkg) {
		pkgList.add(pkg);
	}
	public double getPackageCost(String pkgName) {
		double cost=0.0;
		for(Package tempPkg:pkgList) {
			if(tempPkg.getPkgName()==pkgName) {
				cost=tempPkg.getCost();
			}
		}
		return cost;
	}
	public int getCountSubscriberConnection(int sId) {
		int count=0;
		for(Connection tempConn:connList){
			if(tempConn.getSubscriber().getsId()==sId){	
				count++;
			}
		}
		return count;
	}
}
