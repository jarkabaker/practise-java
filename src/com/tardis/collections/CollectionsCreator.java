package com.tardis.collections;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsCreator {

	public void createCollections() {
		this.createOldCollection();
		this.createNewCollections();
	}
	private void createOldCollection() {	
		
		// Set
		Set<String> set = new HashSet<>();
    set.add("A");
    set.add("B");
    set.add("C");
    set = Collections.unmodifiableSet(set);
    System.out.println("Old Set:");
    System.out.println(set);
    
    // ArrayList
    List<String> list = new ArrayList<>();

    list.add("A");
    list.add("B");
    list.add("C");
    list = Collections.unmodifiableList(list);
    System.out.println("Old Array List:");
    System.out.println(list);
    
    // Map
    Map<String, String> map = new HashMap<>();

    map.put("A","Apple");
    map.put("B","Boy");
    map.put("C","Cat");
    map = Collections.unmodifiableMap(map);
    System.out.println("Old Map:");
    System.out.println(map);
		
	}
	
	
	// Java 9 - new way of creating collections
	private void createNewCollections() {
		
		// New Set
		System.out.println("New Map:");
		Set<String> set = Set.of("A", "B", "C");      
    System.out.println(set);
    
    // New List
    System.out.println("New Array List:");
    List<String> list = List.of("A", "B", "C");
    System.out.println(list);
    
    System.out.println("New Map:");
    Map<String, String> map = Map.of("A","Apple","B","Boy","C","Cat");
    System.out.println(map);

    System.out.println("New Abstract Map:");
    Map<String, String> map1 = Map.ofEntries (
       new AbstractMap.SimpleEntry<>("A","Apple"),
       new AbstractMap.SimpleEntry<>("B","Boy"),
       new AbstractMap.SimpleEntry<>("C","Cat"));
    System.out.println(map1);
    
	}
	
}


