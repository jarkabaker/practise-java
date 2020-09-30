package com.tardis.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerCollections {
	
	class Product{  
    int id;  
    String name;  
    Float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
	}  
	
	public class ProductIdComaparator implements Comparator<Product> {
		 
    @Override
    public int compare(Product product1, Product product2) {
        return product2.id - product1.id;
    }
}
	
	public void testColletions() {
		
		System.out.println("Test Collections");
		System.out.println("================");
		this.testArrayIntegersSort();
		this.testArrayListObjectsSort();
		
		System.out.println("Create Collections");
		System.out.println("==================");
		CollectionsCreator collectionsCreator = new CollectionsCreator();
		collectionsCreator.createCollections();
		
	}
	
	// Sort Array of Integers
	private void testArrayIntegersSort() {
		
		Integer[] listOfIntegers = new Integer[] {2, 4, 1, 3, 7, 5, 9, 6, 8};
		
		List<Integer> list = Arrays.asList(listOfIntegers);
		 
    List<Integer> sortedList = list.stream()
                .sorted( (i1, i2) -> i2.compareTo(i1) )
                .collect(Collectors.toList());

    System.out.println("Array - sort Integers DESC");
    System.out.println(sortedList);
		
	}
	
	// Sort ArrayList of Objects
	private void testArrayListObjectsSort() {
		
		
		List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f)); 
    
    productsList.sort((p1, p2) -> p2.price.compareTo(p1.price));
    
    System.out.println("Array - sort Products by Price DESC");
    productsList.forEach(p -> System.out.println(p.price));
    
    Collections.sort(productsList, new ProductIdComaparator());
    System.out.println("Array - sort Products by Id DESC - it is PRIMITIVE data type!");
    productsList.forEach(p -> System.out.println(p.id));
	}

}
