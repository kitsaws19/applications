package com.java.course;
import java.util.Scanner;

public class CheckSparseMatrixOptimization {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	int count=0;
	System.out.println(" Enter Rows and columns respectively: ");
	int rows=sc.nextInt();
	int cols=sc.nextInt();
	
	int arr[][]=new int[rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			arr[i][j]=sc.nextInt();
			if(arr[i][j]==0) {
				count=count+1;
			}
		}
	}
	if(count> rows*cols/2) {
		System.out.println("It is a sparse matrix");
	}else {
		System.out.println("It is not a sparse matrix");
	}
}
}
