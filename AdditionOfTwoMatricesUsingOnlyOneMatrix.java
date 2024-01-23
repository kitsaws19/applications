package com.java.course;

import java.util.Scanner;

public class AdditionOfTwoMatricesUsingOnlyOneMatrix {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println(" Enter Rows and columns respectively: ");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//int arr[][]=new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]+=sc.nextInt();
			}
		}
		
		System.out.println("Displaying multidimensional array: ");
		
		for(int i=0;i<rows;i++) {
			System.out.print("\n");
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+ "\t");
			}
		}
		
}}
