package com.store.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Product {

	private Long idProduct;
	
	private String nameProduct;

	private double price;
	
	private int quantityStock;

	@JsonIgnore
	private List<DetailOrder> detailProduct;

	public Product() {
		
	}
	
	
	public Product(Long idProduct, String nameProduct, double price, int quantityStock) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.price = price;
		this.quantityStock = quantityStock;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public int getQuantityStock() {
		return quantityStock;
	}


	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}


	public List<DetailOrder> getDetailProduct() {
		return detailProduct;
	}

	public void setDetailProduct(List<DetailOrder> detailProduct) {
		this.detailProduct = detailProduct;
	}


	
	
	
	
}
