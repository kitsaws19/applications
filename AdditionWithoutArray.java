package com.java.course;
import java.util.Scanner;
public class AdditionWithoutArray {

	 public static void main (String args[]) {
		int t,n;
	    
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter iteration :");
		
		t=sc.nextInt();
		
		while(t!=0)
		{
			int sum=0;
			System.out.println("Enter n: :");
			n=sc.nextInt();
			System.out.println("Enter elements :");

			for(int i=0; i<n;i++) {
				
				int val;
				val=sc.nextInt();
				sum=sum+val;
			}
			t--;
			
			System.out.println("Summation of entered elements is : "+sum);
		}
	
				 
	 }
}
