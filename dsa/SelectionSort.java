package com.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {20,10,40,5,4,2,50,60};
		System.out.println("before sort : " + Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			int minindex=i;
			
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j] < arr[minindex]) {
				minindex=j;
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		  }
		}
		System.out.println("after sort : " + Arrays.toString(arr));
	}

}
