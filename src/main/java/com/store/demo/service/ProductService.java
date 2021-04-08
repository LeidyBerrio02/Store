package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Product;

public interface ProductService {

	ArrayList<Product> listP();
	Boolean updateProduct(Product product, Long idProduct);
	Boolean create(Product product);
}
