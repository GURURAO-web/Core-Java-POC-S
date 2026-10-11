package com.dsa;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		//int[] arr= {20,10,40,5,4,2,50,60};
		int[] arr= {1,2,3,4,5};
		int count=0;   // to see how many times looping 1st for loop
		int count1=0; // to see how many times looping 2nd for loop
		
		for(int i=0;i<arr.length-1;i++) {
			count++;
			boolean swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
				count1++;
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
