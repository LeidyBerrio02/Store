package com.store.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.model.Product;
import com.store.demo.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/*@GetMapping()
    public Product getById(){
        return new Product(5L,"Camare", 3000.0 , 1);
    }*/
	

	@GetMapping()
	private ArrayList<Product> listProducts(){
		return productService.listProducts();
	}
	
}
