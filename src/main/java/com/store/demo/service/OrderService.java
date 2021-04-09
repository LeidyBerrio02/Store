package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Invoice;
import com.store.demo.model.Order;
import com.store.demo.model.Product;

public interface OrderService {
	
	ArrayList<Order> orders();
	Boolean create(Order order);
	Boolean validateDate(Order order , int time);
	Invoice invoice(Order order1, double total);
}