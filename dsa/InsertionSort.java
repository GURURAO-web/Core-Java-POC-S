package com.dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {20,10,40,5,4,2,50,60};
		
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i]; // i is value here
			int j=i; // i is index here
			
			while(j > 0 && arr[j-1] > temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		System.out.println("Insertion sort : " + Arrays.toString(arr));
	}

}
