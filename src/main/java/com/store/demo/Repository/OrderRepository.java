package com.store.demo.Repository;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Repository;

import com.store.demo.model.Order;

@Repository
public class OrderRepository {

	public ArrayList<Order> listOrder(){
	
	ArrayList<Order> listOrder = new ArrayList<Order>();
	
	Order order1 = new Order(1L,new Date(),200000.0);
	Order order2 = new Order(2l,new Date(),10000.0);
	
	listOrder.add(order1);
	listOrder.add(order2);
	
	return listOrder;
	
	}
	
}
