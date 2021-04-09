package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.store.demo.model.Product;
import com.store.demo.repository.Data;

@Service
public class ProductServiceImp implements ProductService{
	
	@Override
	public ArrayList<Product> listP() {
		Data.productList.add(Data.product1);
		Data.productList.add(Data.product2);
		Data.productList.add(Data.product3);
		Data.productList.add(Data.product4);
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
