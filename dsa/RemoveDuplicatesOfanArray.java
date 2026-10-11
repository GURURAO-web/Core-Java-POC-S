package com.dsa;

import java.util.Arrays;

public class RemoveDuplicatesOfanArray {

	public static void main(String[] args) {
		int[] arr= {20,20,40,5,40,2,50,60};
		if(arr.length==1) {
			return;
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
//					int temp=arr[i];
					arr[i]=arr[j];
//					arr[j]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
