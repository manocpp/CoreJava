package com.manoj.d2h;

public class OperationD2H {
	public static void main(String[] args) {
		//subscriber class
		Subscriber s1=null,s2=null,s3=null,s4=null,s5=null;
		try {
			s1=new Subscriber(101,"Manoj1",9600879001L,"1manocpp150497@gmail.com");
			s2=new Subscriber(102,"Manoj2",9600879002L,"2manocpp150497@gmail.com");
			s3=new Subscriber(103,"Manoj3",9600879003L,"3manocpp150497@gmail.com");
			s4=new Subscriber(104,"Manoj4",9600879004L,"4manocpp150497@gmail.com");
			s5=new Subscriber(105,"Manoj5",9600879005L,"5manocpp150497@gmail.com");
		}catch(InvalidSubscriberException ise){
			System.out.println(ise);
//			System.out.println("Please Enter Valid Mobile Number");
//			ise.printStackTrace();
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		//package class
		Package p1=null;
		Package p2=null;
		Package p3=null;
		try {
			p1=new Package(1,"Movie Special",300,500);
			p2=new Package(2,"South Special",150,300);
			p3=new Package(3,"North Special",100,200);
		} catch (InvalidPackageException ipe) {
			System.out.println(ipe);
//			System.out.println("Please Enter no of Channel greatter than 10");			
//			ipe.printStackTrace();
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	
	//Connection Class
	Connection c1=new Connection(1001,s1,p1,"1-1-2020");
	Connection c2=new Connection(1002,s1,p2,"1-2-2020");
	Connection c3=new Connection(1003,s2,p3,"1-3-2020");
	Connection c4=new Connection(1004,s3,p1,"1-4-2020");
	Connection c5=new Connection(1005,s3,p3,"1-5-2020");
	Connection c6=new Connection(1006,s4,p1,"1-6-2020");
	Connection c7=new Connection(1007,s4,p2,"1-7-2020");
	Connection c8=new Connection(1008,s4,p3,"1-8-2020");
	Connection c9=new Connection(1009,s5,p2,"1-9-2020");
	Connection c10=new Connection(1010,s5,p3,"1-10-2020");
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(c7);
	System.out.println(c8);
	System.out.println(c9);
	System.out.println(c10);
	
	
	
	SkyD2H sky=new SkyD2H();
	
	sky.addPackage(p1);
	sky.addPackage(p2);
	sky.addPackage(p3);
	
	sky.addConnection(c1);
	sky.addConnection(c2);
	sky.addConnection(c3);
	sky.addConnection(c4);
	sky.addConnection(c5);
	sky.addConnection(c6);
	sky.addConnection(c7);
	sky.addConnection(c8);
	sky.addConnection(c9);
	sky.addConnection(c10);
	

	
	System.out.println("Cost of Package Movie Special="+sky.getPackageCost("Movie Special"));
	System.out.println("Cost of Package South Special="+sky.getPackageCost("South Special"));
	System.out.println("Cost of Package Norh Special="+sky.getPackageCost("North Special"));

	System.out.println("Connectios of Subscriber 101="+sky.getCountSubscriberConnection(101));
	System.out.println("Connectios of Subscriber 102="+sky.getCountSubscriberConnection(102));
	System.out.println("Connectios of Subscriber 103="+sky.getCountSubscriberConnection(103));
	System.out.println("Connectios of Subscriber 104="+sky.getCountSubscriberConnection(104));
	System.out.println("Connectios of Subscriber 105="+sky.getCountSubscriberConnection(105));

	}
}