package com.tardis.stringMethods;

public class StringMethodTester {
	
	public void testStringMethod() {
		
		System.out.println();
		System.out.println("String Method Tests");
		this.testStringRepeat();
		
	}
	
	private void testStringRepeat() {
		
		String sayHello = "Hello";
		
		String sayHelloA = sayHello.repeat(3);
		String sayHelloB = sayHello.concat("! ").repeat(3);
		
		System.out.println();
		System.out.println("Testing Repeat");
		System.out.println(sayHelloA);
		System.out.println(sayHelloB);
		
	}

}
