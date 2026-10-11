package com.dsa;

import java.util.Scanner;

public class Moveallzerostolast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();  //{0,5,0,12,0,0,4,0,0,11,6,7,0,3};
		}
		int n=a.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(a[i] != 0) {
				int temp=a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		for(int k : a) {
			System.out.print(k + " ");
		}
	}

}
