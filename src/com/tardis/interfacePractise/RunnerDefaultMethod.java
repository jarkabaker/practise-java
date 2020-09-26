package com.tardis.interfacePractise;

public class RunnerDefaultMethod {
	
	public RunnerDefaultMethod() {
		
	}
	
	public void talk() {
		
		MyInterface.staticSay();
		
		MyClass myClass = new MyClass();
		
		myClass.abstractSay();
		
		myClass.defaultSay();
		
	}

}
