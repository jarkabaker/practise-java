package com.tardis.stringMethods;

public class StringMethodTester {
	
	public void testStringMethod() {
		
		System.out.println();
		System.out.println("String Method Tests");
		this.testStringRepeat();
		this.testIndent();
		
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
	
	private void testIndent() {
		
		String inputString = "I am Czech";
		
		String output1 = inputString.indent(5);
		System.out.println("Testind Indent 5");
		System.out.println(output1);
		
		String output2 = output1.indent(-2);
		System.out.println("Testind Indent -2");
		System.out.println(output2);
    
	}

}
