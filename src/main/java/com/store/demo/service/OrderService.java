package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Order;

public interface OrderService {
	
	ArrayList<Order> orders();
	Boolean create(Order order);

}