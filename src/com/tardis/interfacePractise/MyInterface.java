package com.tardis.interfacePractise;

public interface MyInterface {
	
	// Static method - can be call by using interface name (no instance needed)
	public static void staticSay() {
		System.out.println("Hello, I am your static method");
	}
	
	// JAVA 8 - Default method - it is NOT to be implemented. But can be called only from instance of class implementing the interface 
  public default void defaultSay() {  
      System.out.println("Hello, this is default method");  
      this.sayMore();
  }
  
  // JAVA 9 - Private method
  private void sayMore() {
  	System.out.println("And I am your private method!");
  }
  
  // Abstract method - must be implemented
  public void abstractSay();  

}
