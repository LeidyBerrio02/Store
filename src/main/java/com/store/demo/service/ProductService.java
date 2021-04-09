package com.store.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.store.demo.model.Product;

public interface ProductService {

	List<Product> listP();
	Boolean updateProduct(Product product, Long idProduct);
	Boolean create(Product product);
	Long search (Product product);
}
