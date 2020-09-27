package com.tardis.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class RunnerOfStream {
	
	public RunnerOfStream() {
		
	}
	
	// Stream = new package in Java 8:
	// - consists of classes, interfaces and enum to allows functional-style operations on the elements
	// - it does not store elements. It allows to perform various operations 
	// - it results in new stream
	public void testStream() {
		
		this.testStream1();
		
	}
	
	// Stream part of array ("from" - "to")
	private void testStream1() {
		
		System.out.println();
		System.out.println("Original Array:");
		String[] arr = new String[]{"a", "b", "c","d","e"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		System.out.println("Full Array:");
		//streamOfArrayFull.forEach(eachElement -> System.out.println(eachElement));
		streamOfArrayFull.forEach(System.out::println);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		System.out.println("Part Array:");
		//streamOfArrayPart.forEach(eachElement -> System.out.println(eachElement));
		//streamOfArrayPart.forEach(System.out::println);
		
		// Convert stream back to array of strings
		// String[] stringArray = stringStream.toArray(size -> new String[size]);
		String[] newPartArray = streamOfArrayPart.toArray(String[]::new);
		Arrays.stream(newPartArray).forEach(System.out::println);

	}

}
