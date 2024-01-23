package com.java.course;

public class AddOddNumbersInArray {

	public static void main (String args[]) {
	    int Size,Sum=0;
	    int j=0;
		int arr[]= {1,4,5,7,9};
	    int arrN[]=new int[5];
	for(int i=0; i<5;i++) {
		if(arr[i]%2!=0) {
			arrN[i]=arrN[i]+arr[i];
			Sum=Sum+arr[i];
		}
	}
	for(int i=0;i<5;i++) {
		if(arr[i]!=0) {
		System.out.print(arrN[i]+ "+");
	}}
	System.out.print("=");
	System.out.println(Sum);
}
}
