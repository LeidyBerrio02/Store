package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Invoice;
import com.store.demo.model.Order;
import com.store.demo.model.Product;

public interface OrderService {
	
	ArrayList<Order> orders();
	//Invoice invoice(double total);
	double subtotal();
	double total(double product, double product2, double newProduct);
	//Boolean validateDate(Order order , int time);
	void discountQuantity();
}
