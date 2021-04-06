package com.store.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Table(name="order")
@Entity(name="order")
public class Order {

	@Column(name="orderDate")
	private Date orderDate;
	
	@Column(name="subtotal")
	private double subtotal;
	
	@Column(name="products")
	private List<Product> products;
	
	@Column(name="invoice")
	private Invoice invoice;

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
