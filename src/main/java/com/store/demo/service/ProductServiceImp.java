package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.Repository.ProductRepository;
import com.store.demo.model.Product;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	ArrayList<Product> listProduct = new ArrayList<Product>();
	
	@Override
	public ArrayList<Product> listProducts() {
		// TODO Auto-generated method stub
		return productRepository.list();
	}

	@Override
	public Boolean create(Product product) {		
		if(product != null) {
			listProduct.add(product);
			return true;
		}
		return false;
	}

}
