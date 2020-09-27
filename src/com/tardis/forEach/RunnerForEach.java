package com.tardis.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RunnerForEach {
	
	public RunnerForEach() {
		
	}
	
	// Java 8 - forEach() method in Iterable interface
	public void testIterations() {
		
		System.out.println();
		System.out.println("Testing ForEach");
		System.out.println("===============");
		this.testArrayList();
		this.testSet();
		this.testMap();
		this.testArray();
		
	}
	
	// ArrayList
	public void testArrayList() {
	
		List<String> pointList = new ArrayList<String>(Arrays.asList("1","2"));
		// or:
		//List<String> pointList = new ArrayList<String>();
		//pointList.add("1");
		//pointList.add("2");
		 
		
		System.out.println();
		System.out.println("ForEach - ArrayList");
		pointList.forEach(System.out::println);
			
	}
	
	// Set
	public void testSet() {
		
		//Set<String> uniqueNames = new HashSet<>();
		//uniqueNames.add("Lenka"); ...
		Set<String> uniqueNames = new HashSet<>(Arrays.asList("Lenka", "Marta", "Alena"));
		
		System.out.println();
		System.out.println("ForEach - Set");
		uniqueNames.forEach(System.out::println);
		
	}
	
	// Map
	// Maps are not Iterable, but, they do provide their own variant of forEach that accepts a BiConsumer. 
  // A BiConsumer was introduced so that an action can be performed on both the key and value of a Map simultaneously.
	public void testMap() {
		
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");
		
		// Iterate using Map's forEach
		System.out.println();
		System.out.println("ForEach - Map - using Map's forEach");
		namesMap.forEach((key, value) -> System.out.println(key + " " + value));
		
		System.out.println();
		System.out.println("ForEach - Map - iterating entrySet");
		// Iterate over Map by iterating entrySet
		namesMap.entrySet().forEach(entry -> 
			System.out.println(entry.getKey() + " " + entry.getValue())
		);

	}
	
	// Array
	// We have to transform the array into a stream and then apply forEach
	public void testArray() {
		
	  int[] nums = { 3, 4, 2, 1, 6, 7 };
   
	  System.out.println();
		System.out.println("ForEach - Array transformed to Stream");
	  Arrays.stream(nums).forEach(System.out::println);
		
	}
}
