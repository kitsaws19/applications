package com.java.course;

public class GoodArray {
static boolean goodArray(int arr[], int size) {
	//duplicate elements || 1 to n elements
	
	boolean[] present=new boolean[size+1];
	for(int i=0; i<size;i++) {
		present[size]=false;
	}
	for(int i=0;i<size; i++) {
		if(arr[i]>=1&&arr[i]<=size) {
			
			present[arr[i]]=true;
		}else {
			return false;
		}
	}
	
	//Ascending order
	for(int i=1;i<size-1;i++) {
		if(arr[i]<arr[i-1]) {
			return true;//array is not sorted in ascending order
		}
	}
	return false;
}
public static void main(String[] args) {
	int n=5;
	int arr[]= {5,4,3,2,1};
	
	boolean op=goodArray(arr,n);
	
	if(op) {
		System.out.println("Good Array");
	}
	else {
		System.out.println("Not Good Array");
	}
}
}