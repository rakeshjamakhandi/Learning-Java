package com.kodnest.arrayLevel2;
import java.util.Scanner;
public class RotateElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter The Length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		int arr1[]=new int[n];
		System.out.println("no of Rotations");
		int k=scan.nextInt();
		System.out.println("The Array Elements are..");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i=k;i<n;i++) {
			arr1[i]=arr[i-k];
		}
		for(int i=0;i<k;i++) {
			arr1[i]=arr[n-k+i];
		}
		System.out.println("The Elements of arr-->");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
