package com.java.course;

import java.util.Arrays;

public class ConcatenateTwoArrays {
	public static void main(String [] args) {
		String arr1[]= {"a","b","c","d"};
		String arr2[]= {"e","f","g","h"};
		
		int arr1Len=arr1.length;
		int arr2Len=arr2.length;
		
		String resultantArray[]=new String[arr1Len+arr2Len];
		
		System.arraycopy(arr1,0,resultantArray,0,arr1Len);
		System.arraycopy(arr2, 0, resultantArray, arr1Len, arr2Len);
		
		System.out.println(Arrays.toString(resultantArray));
	}
}
