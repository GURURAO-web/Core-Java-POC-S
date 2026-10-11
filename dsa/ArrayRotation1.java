package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {15,25,35,45,55,65,75};
		System.out.println("Enter number how times to rotate :");
		int r=sc.nextInt();
		System.out.println("before rotate : " + Arrays.toString(arr));
		rotateArray(arr,r);
		System.out.println("After rotate : " + Arrays.toString(arr));
	}
	static void rotateArray(int[] arr, int r) {
		int start=0;
		int end=arr.length-1;
		
		r = r % arr.length;
		
		reversearray(arr,start,end);
		reversearray(arr,start,r-1);
		reversearray(arr,r,end);
	}
	static void reversearray(int[] arr, int start, int end) {
		while(start < end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	}
}
