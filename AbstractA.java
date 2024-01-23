package com.java.course;

 abstract class AbstractB {
 abstract void callme();
}

class AbstractA extends AbstractB{
	
	void callme() {
		System.out.println("called from AbstractB");
	}
	
	AbstractB a new AbstractB();
	a.callme();
}