package com.java.course;
import java.util.Scanner;
public class GiftPriceSummation2000 {
public static void main (String args[]) {
    
	Scanner sc=new Scanner(System.in);
	int n;
    
    System.out.println("Enter n value :");
	n=sc.nextInt();
	
	int arr[]=new int[n];

	System.out.println("Enter the prices :");
	
	for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
	}
	
     boolean isAccept=false;
     
     for(int i=0;i<n;i++) {
    	 for(int j=i+1;j<n;j++) {
    		 if(arr[i]+arr[j]==2000) {
    			 isAccept=true;
    			 
    			// System.out.println
    	    	 System.out.println(i+","+j);
    	 }
     }
     }
     if(isAccept)
     {
    	 System.out.println("Accepted");
     }else {
    	 System.out.println("Not Accepted");
     }
}
	
}
