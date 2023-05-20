package com.oopsProblems;

public class Shopping {
	int prod_id;
	String prod_name;
	double prod_price;
	int quantity;
	double bill;
	
	public void accept_details(int pid, String pname, double pprice, int q) {
		
		prod_id = pid;
		prod_name = pname;
		prod_price = pprice;
		quantity = q;
	}
	
	public double shop_bill() {
		
		if(quantity>0)
		{
			bill = quantity * prod_price;
			System.out.println("Total Bill= "+ bill);
		}
		else {
			System.out.println("Error 404: Zero Quantity Detected");
		}
		return bill;
		
	}
	
	public void display() {
		
		System.out.println(prod_id +" "+ prod_name +" "+ prod_price +" "+ quantity);
	}
	
	public static void main(String[] args) {
		Shopping sd=new Shopping();
		sd.accept_details(101, "Maggie", 50, 5);
		sd.display();
		sd.shop_bill();
		
		Shopping sd2=new Shopping();
		sd2.accept_details(102, "Biscuits1", 20, 0);
		sd2.display();
		sd2.shop_bill();
		
		Shopping sd3=new Shopping();
		sd3.accept_details(103, "Masala", 25, 3);
		sd3.display();
		sd3.shop_bill();
		
	}
}
