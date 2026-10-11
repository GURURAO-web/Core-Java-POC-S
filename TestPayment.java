package com.oops.abstraction.interfaces;


public class TestPayment {

	public static void main(String[] args) {
		
		Payment pay;
		pay=new CreditCard();
		pay.makePayment(1000);
		pay.method1();
		pay.method2();
		pay.method3();
		pay.method4();
		pay.method5();
		
		System.out.println("-----------------------");
		pay=new UPIPayment();
		pay.makePayment(2000);
		pay.method1();
		pay.method2();
		pay.method3();
		pay.method4();
		pay.method5();
	}

}
