package com.store.demo.service;

import com.store.demo.model.Product;

public interface ProductService {

	Boolean updateProduct(Product product, Long idProduct);
	Boolean create(Product product);
}
