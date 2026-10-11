package com.multithreading;

// very small POC:
//Book-My-Show Problem Solving
// this problem is called "RACE CONDITION".

// A Race Condition occurs when multiple threads access and modify the same resources at the same time and the final result depends on which thread executes first.
class BookMyShow{
	int total_tickets=10;
	
	synchronized void bookMyTickets(String name, int tickets) {
		if(tickets <= total_tickets) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			total_tickets -= tickets;
			
			System.out.println("your tickets has been booked successfully Mr/Ms :" + name);
			System.out.println("your total booked tickets are : " + tickets);
			System.out.println("Available tickets are :" + total_tickets);
		} else {
			System.err.println("Tickets have been sold out :" );
			System.err.println("Available tickets are : " + total_tickets);
		}
	}
}

class Customer extends Thread{
	BookMyShow bms;
	String customerName;
	int tickets;
	
	Customer(BookMyShow bms, String customerName, int tickets){
		this.bms=bms;
		this.customerName=customerName;
		this.tickets=tickets;
	}
	
	@Override
	public void run() {
		bms.bookMyTickets(customerName, tickets);
		
	}
}

public class TestBookMyShowDemo {

	public static void main(String[] args) {
		
		BookMyShow bms=new BookMyShow();
		
		Customer guru = new Customer(bms,"guru",6);
		guru.start();
		
		Customer hemanth =new Customer(bms, "hemanth", 4);
		hemanth.start();
		
		Customer rao = new Customer(bms, "rao", 6);
		rao.start();		
		
		Customer chai = new Customer(bms, "chai", 6);
		chai.start();	
	}

}
