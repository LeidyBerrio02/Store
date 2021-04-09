package com.store.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.model.Order;
import com.store.demo.service.OrderService;
import com.store.demo.util.Data;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping()
	public ArrayList<Order> order(){
		return orderService.orders();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@DeleteMapping("/delete")
	public void delete() {
		Data.orderList.remove(Data.detailOrder);
		Data.orderList.remove(Data.detailOrder1);
		Data.orderList.remove(Data.detailOrder2);
		Data.order1.setStatus("Delete");
		Data.order1.setDetailOrder(null);
		Data.orderList.remove(Data.order1);
		
	}
	
	/*@PutMapping("/updateOrder")
	public Boolean listOrders(@RequestBody Order order, @PathVariable Long idOrder){
		return orderService.updateOrder(order, idOrder);
	}
*/	
}
