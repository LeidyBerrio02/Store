package com.store.demo.Repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.store.demo.model.Product;

@Repository
public class ProductRepository {

	public ArrayList<Product> list() {
		ArrayList<Product> productList = new ArrayList<>();
		//Product product[] = new Product[10];
		
		Product product1 = new Product(1L,"TV",75000.0,2);
		Product product2 = new Product(2L,"iPhone",55000.0,5);
		Product product3 = new Product(3L,"Xioami",50000.0,1);
		Product product4 = new Product(4L,"Headphones",50000.0,3);
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		
		return productList;
	
	}
	
}
