package com.java.course;
import java.util.Scanner;
protected class Add1{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	void add() {
	System.out.println("addition of a and b is :"+(a+b));
	}
}

protected class Add2 extends Add1{
	void display() {
	int c=sc.nextInt();
	System.out.println("addition of a, b and c is :"+(a+b+c));
	}
}

public class Addition {
public static void main(String args[]) {
	Add1 a=new Add1();
	a.add();
	
	Add2 b=new Add2();
	b.display();
			
	
}	
}
