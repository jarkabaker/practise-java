package com.tardis.var;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VarRunner {
	
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
	
	
	public void testVar() {
		
		System.out.println("Test var");
		System.out.println("========");
		
		var productsList = new ArrayList<Product>();  
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

