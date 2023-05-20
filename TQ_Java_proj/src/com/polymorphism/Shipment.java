package com.polymorphism;

class Order{
	int oid;
	int cust_id;
	String city;
	
	public Order(int oid, int cust_id, String city) {
		this.oid = oid;
		this.cust_id = cust_id;
		this.city = city;
	}
}

class Mydate{
	int mm;
	int dd;
	int yy;
	
	public Mydate(int dd, int mm, int yy) {
		this.mm = mm;
		this.dd = dd;
		this.yy = yy;
	}
}

public class Shipment {
	int sid;
	Order o;
	Mydate mdt;
	
	public Shipment(int sid, Order o, Mydate mdt) {
		this.sid = sid;
		this.o = o;
		this.mdt = mdt;
	}
	
	public static void main(String[] args) {
		
		Shipment s = new Shipment(1011, new Order(101, 501, "Mumbai"), new Mydate(12,05,2023));
		System.out.println("Shipment id: " +s.sid);
		System.out.println("Orderid: "+s.o.oid);
		System.out.println("Customer id: "+ s.o.cust_id);
		System.out.println("City: " +s.o.city);
		System.out.println("Date: "+ s.mdt.dd + "-" + s.mdt.mm + "-" + s.mdt.yy);
		
	}

}
