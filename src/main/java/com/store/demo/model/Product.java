package com.store.demo.model;

import javax.persistence.*;

@Table(name="product")
@Entity(name="product")
public class Product {

	@Column(name="nameProduct")
	private String nameProduct;
	
	@Column(name="price")
	private double price;
	
	@Column(name="quantity")
	private int quantity;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
