package com.store.demo.service;

import org.springframework.stereotype.Service;

import com.store.demo.model.Order;
import com.store.demo.repository.Data;
@Service
public class OrderServiceImp implements OrderService {
	
	@Override
	public Boolean create(Order order) {
		if(order != null) {
			Data.orderList.add(order);
			return true;
		}
		return false;
	}	
}
