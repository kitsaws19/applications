package com.java.course;

public class CheckVowels {
	public static void main(String args[]) {
		String str="Data Structures and Algorithms";
		char v1='a';
		char v2='e';
		char v3='i';
		char v4='o';
		char v5='u';
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			
			if(str.charAt(i)==v1||str.charAt(i)==v2||str.charAt(i)==v3||str.charAt(i)==v4||str.charAt(i)==v5) {
				count++;
			}
		}
		System.out.println("number of vowels in given string: "+str);
		System.out.print(count);	
	}
}
