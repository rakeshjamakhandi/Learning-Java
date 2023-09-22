package com.kodnest.arrayLevel2;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Array Elements 'n'");
		int n=scan.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arr3[]=new int[n];
		
		System.out.println("1st Arrat elements");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("2nd array elements");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scan.nextInt();
		}
		
		for(int i=0;i<=n-1;i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
		
		System.out.println("The 1st are");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("The 2st are");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		System.out.println("The 3st are");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.print(arr3[i]+" ");
		}

	}

}
