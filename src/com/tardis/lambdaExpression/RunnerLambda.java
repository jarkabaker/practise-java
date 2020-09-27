package com.tardis.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class RunnerLambda {

	public RunnerLambda() {
		
	}
	
	// Absolutely beautiful, elegant and powerful
	public void testLambda() {
	
		this.testLambda1();
		this.testLambda2();
	
	}
	
	private void testLambda1() {
		List<String> pointList = new ArrayList<String>();
		 
		pointList.add("1");
		pointList.add("2");
		
		System.out.println();
		System.out.println("Print original list");
		/*
		pointList.forEach(p -> { 
			System.out.println(); 
		});
		*/
		// The above can be written using method reference:
		pointList.forEach(System.out::println);
	}
	
	
	private void testLambda2() {
		
		System.out.println();
		
		List<String> pointList = new ArrayList<String>();
		pointList.add("1");
		pointList.add("2");
		
		List<String> newList = new ArrayList<String>();
		pointList.forEach(pointListItem -> newList.add(pointListItem + "A"));
		pointList = newList;
		
		System.out.println("Altered list with A");
		pointList.forEach(eachNewPointListItem -> System.out.println(eachNewPointListItem));
		
	}
}
