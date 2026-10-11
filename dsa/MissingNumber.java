package com.dsa;

public class MissingNumber {
	public static int findmissing(int[] arr) {
		int n=arr.length;
		
		boolean[] present=new boolean[n+1];
		
		for(int num:arr) {
			present[num]=true;
		}
		
		for(int i=0;i<n;i++) {
			if(!present[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {3,0,1};
		System.out.println(findmissing(arr));
	}

}
