package com.tardis.optionalClass;

import java.util.Optional;

public class RunnerOptionalClass {
	
	public RunnerOptionalClass() {
		
	}
	
	public void testOptionalClass() {
	
		SumCalculator sumCalculator = new SumCalculator();
	  Integer value1 = null;
	  Integer value2 = 10;
	
	  //Optional.ofNullable - allows passed parameter to be null.
	  Optional<Integer> a = Optional.ofNullable(value1);
	
	  //Optional.of - throws NullPointerException if passed parameter is null
	  Optional<Integer> b = Optional.of(value2);
	  
	  // Try to calculate
	  System.out.println();
	  System.out.println(sumCalculator.sum(a,b));
	  
	}

}
