package com.dsa;

import java.util.Scanner;

// LINEAR SEARCH
// Array is not be in an order 
//checking in an order

// ----------- Time Complexity -------------------
// if the value found in the first place :
// Enter a key --> Best Case --> O(1)
// 18
// key index is : 0

// if the value found in the middle
// Enter a key : --> Average Case --> O(n)
//33
//key index is : 4

// if the value found in the end or last or not available
// worst case --> O(n)
//Enter a key :
//10
//key index is : 6

// -------------- Space Complexity ------------------
// Space Complexity is : O(1) (Constant Space)
// here the array is constant

public class TestDSA1 {
//	LINEAR SEARCH
	static int search(int[] arr, int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {18,45,4,35,33,7,10};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key :");
		int key =sc.nextInt();
		System.out.println("key index is : " + search(arr, key));
	}

}
