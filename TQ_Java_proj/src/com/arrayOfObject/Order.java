package com.arrayOfObject;
import java.util.Scanner;
import java.util.Arrays;

class Menu{
	int menuId;
	String menuName;
	int price;
	
	public Menu(int menuId, String menuName, int price) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "menuId= " + menuId + ", menuName= " + menuName + ", price= " + price;
	}
	
}

public class Order {
	int orderId;
	int quantity;
	Menu m[];
	
	public Order(int orderId, int quantity, Menu[] m) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.m = m;
	}

	@Override
	public String toString() {
		return "orderId= " + orderId + ", quantity= " + quantity + ", m= " + Arrays.toString(m);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Order od[] = new Order[3];
		for(int i=0; i<od.length; i++)
		{
			System.out.println("Enter Order Id:");
			int orderId = sc.nextInt();
			System.out.println("Enter the quantity of order:");
			int quantity = sc.nextInt();
			Menu m[] = new Menu[2];
			System.out.println("Enter Menu details:");
			for(int j=0; j<m.length; j++)
			{
				System.out.println("Enter Menu Id: ");
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
