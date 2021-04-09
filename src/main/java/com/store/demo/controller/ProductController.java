package com.store.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.model.Product;
import com.store.demo.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping()
	public ArrayList<Product> list() {
		return productService.listP();
	}

	@PostMapping("/create")
	private Boolean create(@RequestBody Product product){
		return productService.create(product);
	}

	@PutMapping("/update/{idProduct}")
	private Boolean update(@RequestBody Product product, @PathVariable Long idProduct){
		return productService.updateProduct(product, idProduct);
	}
}
