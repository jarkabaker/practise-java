package com.tardis.lambdaFilterAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerLambdaFilterAndMap {
	
	class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
	}  
	
	public void testLambdaMore() {
		
		System.out.println("Testing Lambda Filter and Map");
		System.out.println("=============================");
		this.test1();
		this.test2();
		this.test3();
		
	}
	
	// Filter
	private void test1() {
		
    List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    
    System.out.println();
    System.out.println("Filter price > 30000");
    productsList.stream()  
                .filter(p -> p.price > 30000)   // filtering price  
                .forEach(pm -> System.out.println(pm.name + ' ' + pm.price));  // iterating name & price  
		
    // OR
    
    productsList.stream()  
						    .filter(p -> p.price > 30000)   // filtering price  
						    .map(pm -> pm.price)            // fetching price  
						    .forEach(System.out::println);  // iterating price 
    
	}
	
	// Filter and return list of filtered prices
	private void test2() {
		
		List<Product> productsList = new ArrayList<Product>();  
    //Adding Products  
    productsList.add(new Product(1,"HP Laptop",25000f));  
    productsList.add(new Product(2,"Dell Laptop",30000f));  
    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
    productsList.add(new Product(4,"Sony Laptop",28000f));  
    productsList.add(new Product(5,"Apple Laptop",90000f));  
    
    System.out.println();
    System.out.println("Filter price > 25000 and return list of prices");
    List<Float> pricesList =  productsList.stream()  
                .filter(p -> p.price> 25000)   // filtering price  
                .map(pm -> pm.price)          // fetching price  
                .collect(Collectors.toList());  
    System.out.println(pricesList);  
    
	}
	
	// Map to products to modified products
	private void test3() {
		
		List<Product> products = Arrays.asList(new Product(1,"HP Laptop",25000f),
																					 new Product(2,"Dell Laptop",30000f),
																					 new Product(3,"Lenevo Laptop",28000f),
																					 new Product(4,"Sony Laptop",28000f),
																					 new Product(5,"Apple Laptop",90000f));
																					 
	  List<Product> newProducts = products.stream()
	                                 .map(product -> new Product(product.id, product.name, product.price / 100))
	                                 .collect(Collectors.toList());
		
	  System.out.println();
    System.out.println("Products with reduced prices");
	  newProducts.forEach(eachProduct -> System.out.println(eachProduct.name + " - " + eachProduct.price));
	}

}
