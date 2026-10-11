package com.dsa;

public class RemoveDuplicatesfromSortedArray {
	
	public static int removeduplicates(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		
		int j=0;
		
	for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		return j+1;
	}

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,4,4};
		int n = removeduplicates(arr);
		System.out.println("number of unique elements :" + n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
