package com.tardis.interfacePractise;

public class MyClass implements MyInterface {
	
	public MyClass() {
		
	}
	
	// MyClass implements MyInterface => it must implement inherited ABSTRACT methods
	public void abstractSay(){           
    System.out.println("Hello, I am your abstract implemented method");  
	}  
	
}
