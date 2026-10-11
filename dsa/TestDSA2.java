package com.dsa;

import java.util.Scanner;

// BINARY SEARCH

public class TestDSA2 {
	
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
//		int key=40;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key :");
		int key = sc.nextInt();
		
		System.out.println("Element found at :"+ binarysearch(arr,key));
	}
 
	private static int binarysearch(int[] arr, int key) {
		
		int low=0; //0
		int high=arr.length-1;  //4
		
		while(low <= high) {
			
			int mid= low +(high-low)/2;  //2
			
			if(arr[mid] == key) {
				return mid;        // Best Case -> Omega(1)
			} else if(key < arr[mid]) {
				high=mid-1;
			} else {
				low =mid + 1;
			}
		}
		
		
		return -1;
	}

}
