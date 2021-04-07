package com.store.demo.service;

import org.springframework.stereotype.Service;

import com.store.demo.model.Product;
import com.store.demo.repository.Data;

@Service
public class ProductServiceImp implements ProductService{

	@Override
	public Boolean create(Product product) {		
		if(product != null) {
			Data.productList.add(product);
			return true;
		}
		return false;
	}

}
