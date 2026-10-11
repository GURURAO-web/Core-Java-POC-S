package com.multithreading;
// whenever we are calling the wait() method, the wait() must be there inside the synchronized method or block
//but not directly anywhere you want. 
// If synchronized block is not there we get IllegalMonitorStateException.
// To avoid this data inconsistent of problems we use synchronized.



class Resource{
	int i =0;
	boolean status=false;
	
	synchronized void put(int i) throws InterruptedException {
		
		while(status) {
			wait();
		}
		
		this.i=i;
		System.out.println("PUT : " + i);
		status=true;
		notify();
	}
	
	synchronized void get() throws InterruptedException {
		while(!status) {
			wait();
		}
		System.out.println("GET : "+ i);
		status= false;
		notify();
	}
	
}

class Producer implements Runnable{
	Resource r;
	
	Producer(Resource r){
		this.r=r;
		Thread t=new Thread(this,"Producer"); // java.lang.Thread.Thread(Runnable task,String name)
		t.start();
	}
	
	@Override
	public void run() {
		
		int i=0;
		
		while(true) {
			
			try {
				r.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer implements Runnable{
	Resource r;
	
	Consumer(Resource r){
		this.r=r;
		Thread t=new Thread(this, "Consumer"); // this is "current object" and name is "class name"
		t.start();
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				r.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class TestInnerThreadCommunication {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Resource r=new Resource();
		Producer p = new Producer(r);
		Consumer c=new Consumer(r);
		
		System.out.println("main method ended");

	}

}
