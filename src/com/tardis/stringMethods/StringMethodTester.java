package com.tardis.stringMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMethodTester {
	
	class Employee {
		 
    private int id;
 
    Employee(int i) {
        this.id = i;
    }
 
    @Override
    public String toString() {
        return String.format("Emp[%d]", this.id);
    }
	}
	
	public void testStringMethod() {
		
		System.out.println();
		System.out.println("String Method Tests");
		this.testStringRepeat();
		this.testIndent();
		this.transformString();
		
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
		System.out.println("Testing Indent -2");
		System.out.println(output2);
    
	}
	
	private void transformString() {
		
		String ids = "1,2,3";
		 
    List<Employee> list4 = ids.transform(csvStr -> {
        String[] idArray = csvStr.split(",");
        List<Employee> empList = new ArrayList<>();
        for (String s1 : idArray) {
            empList.add(new Employee(Integer.parseInt(s1)));
        }
        return empList;
    });
    System.out.println("Testing Transform");
    System.out.println(list4);
	}
	

}
