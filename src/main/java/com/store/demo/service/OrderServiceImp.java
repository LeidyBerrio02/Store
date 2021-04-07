package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.Repository.OrderRepository;
import com.store.demo.model.Order;

@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	ArrayList<Order> orderList = new ArrayList<Order>();

	@Override
	public ArrayList<Order> listOrders() {
		// TODO Auto-generated method stub
		return orderRepository.listOrder();
	}

	@Override
	public Boolean create(Order order) {
		if(order != null) {
			orderList.add(order);
			return true;
		}
		return false;
	}	
}
