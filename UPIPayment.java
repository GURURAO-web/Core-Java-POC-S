package com.oops.abstraction.interfaces;

public class UPIPayment extends Cash{


	@Override
	public void method4() {
		System.out.println("method4 from upi");
	}

	@Override
	public void method5() {
		System.out.println("method5 from upi");
	}

	@Override
	void display() {
		System.out.println("abstract method executed from upi");
	}
	
	
	
}
