package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Product;

public interface ProductService {
	
	ArrayList<Product> listProducts();
	Boolean create(Product product);

}
