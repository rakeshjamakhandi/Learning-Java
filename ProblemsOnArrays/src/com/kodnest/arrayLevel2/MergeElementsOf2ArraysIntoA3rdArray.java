package com.kodnest.arrayLevel2;
import java.util.Scanner;
public class MergeElementsOf2ArraysIntoA3rdArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("The 1st array length");
	    int arr1[]=new int[scan.nextInt()];
	    
	    System.out.println("The 1st array length");
	    int arr2[]=new int[scan.nextInt()];
	    
	    System.out.println("array 3");
	    int num=arr1.length+arr2.length;
	    int arr3[]=new int[num];
	    
	    for(int  i=0;i<=arr1.length-1;i++) {
	    	arr1[i]=scan.nextInt();
	    }
	    
	    for(int  i=0;i<=arr2.length-1;i++) {
	    	arr2[i]=scan.nextInt();
	    }
	    
	    System.out.println("The 1st Array Elements are..");
	    for(int i=0;i<=arr1.length-1;i++)
	    {
	    	System.out.print(arr1[i]+" ");
	    }
	    System.out.println();
	    
	    System.out.println("The 2nd array Elements are..");
	    for(int i=0;i<=arr2.length-1;i++) {
	    	System.out.print(arr2[i]+" ");
	    
	    }
	    System.out.println();
	    System.out.println(" the 3rd arrays..");
	    
	    for(int i=0;i<=arr1.length-1;i++) {
	    	arr3[i]=arr1[i];
	    }
	    for(int i=0;i<arr2.length;i++) {
	    	arr3[i+arr1.length]=arr2[i];
	    }
	    
	    for(int i=0;i<=arr3.length-1;i++) {
	    	System.out.print(arr3[i]+" ");
	    }
	    
	}

}
