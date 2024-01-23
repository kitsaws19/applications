package com.java.course;

	public class Calculator{
		String add(String a, int b) {
			System.out.println("adding String with int");
			return a+b;	
		}

		String add(int a, String b) {
			System.out.println("adding int with String");
			return a+b;
		}
	}