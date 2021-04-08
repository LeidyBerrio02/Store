package com.store.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.model.Product;
import com.store.demo.repository.Data;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	Data dataRepository;
	
	@Override
	public Boolean create(Product product) {		
		if(product != null) {
			Data.productList.add(product);
			return true;
		}
		return false;
	}
	
	@Override
	public Boolean updateProduct(Product product, Long idProduct) {		
		Product productArray = new Product();
		if(product != null) {
		
			productArray.setIdProduct(idProduct);
			productArray.setNameProduct(product.getNameProduct());
			productArray.setPrice(product.getPrice());
			productArray.setQuantityStock(product.getQuantityStock());
			Data.productList.add(productArray);
			
			return true;
		}
		return false;
	}
	

}
