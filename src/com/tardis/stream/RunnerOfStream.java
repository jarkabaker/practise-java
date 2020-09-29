package com.tardis.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnerOfStream {
	
	public RunnerOfStream() {
		
	}
	
	// Stream = new package in Java 8:
	// - consists of classes, interfaces and enum to allow functional-style operations on the elements
	// - it does not store elements. It allows to perform various operations on elements
	// - it results in new stream
	public void testStream() {
		
		this.testStream1();
		this.testStream2();
		this.testStream3();
		this.testStream4();
		this.testStream5();
		
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
	
	// Java 9 method takeWhile
	// - It stops when it get unmatched element.
	private void testStream2() {
		
		System.out.println();
		System.out.println("Stream - takeWhile");
		 List<Integer> list   
     = Stream.of(2,2,4,5,6,7,8,9,10)  
             .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());     
		 System.out.println(list);  
	}
	
	// Java 9 method dropWhile
	// - It returns a stream that contains elements after dropping the elements that match the given predicate.
	private void testStream3() {
		
		System.out.println();
		System.out.println("Stream - dropWhile");
		 List<Integer> list   
     = Stream.of(2,2,4,5,6,7,8,9,10)  
             .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());     
		 System.out.println(list);  
	}
	
	// Java 9 method ofNullable
	// - Stream ofNullable method returns a sequential stream that contains a single element, if non-null. Otherwise, it returns an empty stream.
	// -It helps to handle null stream and NullPointerException.
	private void testStream4() {
		
		System.out.println();
		System.out.println("Stream - ofNullable - not null");
		String[] arr1 = new String[]{"a", "b", "c","d","e"};
    int count1 = (int) Stream.ofNullable(arr1).count();
    System.out.println(count1);
    System.out.println("Stream - ofNullable - null");
    String[] arr2 = null;
    int count2 = (int) Stream.ofNullable(arr2).count();
    System.out.println(count2);
	}
	
	// Java 9 method iterate
	// - iterate stream elements till the specified condition.
	private void testStream5() {
		System.out.println();
		System.out.println("Stream - iterate");
		Stream.iterate(1, i -> i <= 10, i -> i*3)  
    .forEach(System.out::println);  
	}

}
