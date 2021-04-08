package com.store.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.model.Order;
import com.store.demo.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping()
	public ArrayList<Order> order(){
		return orderService.orders();
	}
	
	
	@PostMapping("/create")
	public Boolean listOrders(@RequestBody Order order){
		return orderService.create(order);
	}
	
}
