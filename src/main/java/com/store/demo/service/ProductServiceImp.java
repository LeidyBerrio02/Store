package com.store.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.demo.model.Product;
import com.store.demo.util.Data;

@Service
public class ProductServiceImp implements ProductService{
	
	@Override
	public List<Product> listP() {
		return Data.productList;
	}
	
	@Override
	public Boolean create(Product product) {		
		if(product != null) {
			Data.detailOrder.setProduct(product);
			Data.productList.add(product);
			return true;
		}
		return false;
	}
	


	@Override
	public Boolean updateProduct(Product product, Long idProduct) {		
		Product productArray = new Product();
		if(product != null) {
			search(product);
			productArray.setIdProduct(product.getIdProduct());
			productArray.setNameProduct(product.getNameProduct());
			productArray.setPrice(product.getPrice());
			productArray.setQuantityStock(product.getQuantityStock());
			Data.productList.add(productArray);
			
			return true;
		}
		return false;
	}
	
	@Override
	public Long search (Product product) {
		for (Product pro : Data.productList) {
			if (pro.getIdProduct()==product.getIdProduct()) {
				return product.getIdProduct();
			}
		}
		return null;
	}
}
