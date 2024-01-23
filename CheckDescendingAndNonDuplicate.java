//package com.java.course;
//
//public class CheckDescendingAndNonDuplicate{
//	public static void main(String args[]) {
//		int arr[]= {5,4,3,2,1};
//		
//		for(int i=0; i<=4;i++) {
//			if(arr[i]<arr[4]) {
//				System.out.println("Not in descending order order");
//			}	
//		}
//	    boolean isUnique;
//	for(int i=0; i<=4;i++) {
//     isUnique=true;
//    for(int j=0;j<=4;j++) {
//    	if(arr[i]==arr[j]&&i!=j) {
//    		isUnique=false;
//    		break;
//    	}
//    	
//    }
//    if(!isUnique) {
//    	
//    	System.out.println("All elements are not unique elements");
//    }
//	}
//	}}

package com.java.course;

public class CheckDescendingAndNonDuplicate {

	public static void main (String args[]) {
	    int Size,Sum=0;
		int arr[]= {1,3,2,5,4};
	boolean isGood=true;
	
	for(int i=0;i<5;i++) {
		for(int j=i+1;j<5;j++) {
		if(arr[i]<arr[i+1]||arr[i]==arr[j]||arr[i]>5) {
			isGood=false;
			break;
		}	
		}
	}
	if(isGood) {
		System.out.println("Good array");
	}else {
		System.out.println("Not Good array");
	}
}
}



