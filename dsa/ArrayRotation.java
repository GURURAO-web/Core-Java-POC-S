package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

import com.arrays.ReverseArray;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {20,10,40,5,4,2,50,60};
		System.out.println("Enter a  number how many times to roate : ");
		int r=sc.nextInt();
		System.out.println("before sort" + Arrays.toString(arr));
		rotatearray(arr, r);
		System.out.println("after sort" + Arrays.toString(arr));
	}
	static void rotatearray(int[] arr, int r) {
		int start=0;
		int end=arr.length-1;
		
		r=r%arr.length;
		
		//1. reverse total array
		reversearray(arr,start,end);
		//2.reverse first half of an reversed array
		reversearray(arr,start,r-1);
		//3.reverse second half of an reversed array
		reversearray(arr,r,end);
	}
		static void reversearray(int[] arr, int start, int end){
			while(start < end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}

}
