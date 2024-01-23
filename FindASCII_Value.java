package com.java.course;
import java.util.Scanner;
public class FindASCII_Value {
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int asciiValue=ch;
		System.out.println(asciiValue);
	}
}
