package com.tardis.interfacePractise;

public class InterfacePractiseClass {
	
	public InterfacePractiseClass() {
		
	}
	
	public void talk() {
		
		MyInterface.staticSay();
		
		MyClass myClass = new MyClass();
		
		myClass.abstractSay();
		
		myClass.defaultSay();
		
	}

}
