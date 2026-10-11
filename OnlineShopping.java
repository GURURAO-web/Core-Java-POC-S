package com.exceptionhandling;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] products= {"laptop","mobile","headphones","keyboard","mouse"};
		String[] prices= {"5000","25000","2000","1500","500"};
		
		try {
			System.out.println("===online shopping==");
			for(int i=0;i<products.length;i++) {
			System.out.println(i + "-"+ products[i]+"-"+prices[i]);
			
			System.out.println("\n enter product index:");
			int index=Integer.parseInt(sc.nextLine());
			
			String selectedProduct=products[index];
			String priceString=prices[index];
			double price = Double.parseDouble(priceString);
			
			System.out.println("\n selected product:" + selectedProduct);
			int quantity=Integer.parseInt(sc.nextLine());
			if(quantity==0) {
				throw new ArithmeticException("Quantity cannot be zero");
			}
			double result=price/quantity;
			
			System.out.println("Quantity :" + quantity);
			System.out.println("price :" + result);
			
			}
		}catch(NumberFormatException e) {
			System.out.println("error: invalid price or number entered");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: invalid product index");
		}catch(ArithmeticException e) {
			System.out.println("Error: quantity be zero");
		}finally {
			System.out.println("\n order processing completed");
		}
	}
	
}
