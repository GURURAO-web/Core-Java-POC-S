package com.oops.abstraction.interfaces;

public class CreditCard extends Cash{

	@Override
	public void makePayment(double amount) {
		System.out.println("credit card : " +amount);
	}

	@Override
	public void method1() {
		System.out.println("method1 from cc");
	}

	@Override
	public void method2() {
		System.out.println("method2 from cc");
	}

	@Override
	public void method3() {
		System.out.println("method3 from cc");
	}

	@Override
	void display() {
		System.out.println("abstract method must be executed if we extends");
	}

	

}
