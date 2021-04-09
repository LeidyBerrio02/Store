package com.store.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.store.demo.model.DetailOrder;
import com.store.demo.model.Invoice;
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

	@Override
	public ArrayList<Order> orders() {
		Date smp = null;
		try {
			smp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2020-11-11 12:22:22.333");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Order list 1, client 1
		
		Order order1 = new Order();
		order1.setIdOrder(1L);
		order1.setOrderDate(smp);
		order1.setStatus("Active");
		

		/////////////////// detail
		DetailOrder detailOrder = new DetailOrder();
		detailOrder.setId(1l);
		detailOrder.setOrder(order1);
		detailOrder.setProduct(Data.product1);
		detailOrder.setQuantityOrder(1);
		double total = 0;
		total = total + (Data.product1.getPrice() * detailOrder.getQuantityOrder()) ;
		detailOrder.setTotal(total);
		
		//
		DetailOrder detailOrder1 = new DetailOrder();
		detailOrder1.setId(2l);
		detailOrder1.setOrder(order1);
		detailOrder1.setProduct(Data.product4);
		detailOrder1.setQuantityOrder(2);
		double total2 = 0;
		total2 = (Data.product4.getPrice() * detailOrder1.getQuantityOrder());
		detailOrder1.setTotal(total2);
		total = total + total2;
		Data.detailList.add(detailOrder);
		Data.detailList.add(detailOrder1);
		
		order1.setSubtotal((Data.product1.getPrice() * detailOrder.getQuantityOrder())+ (Data.product4.getPrice() * detailOrder1.getQuantityOrder()));
		order1.setDetailOrder(Data.detailList);
		
		//invoice 
		Invoice in = invoice(order1 , total);
		order1.setInvoice(in);
		
		//Add Order
		Data.orderList.add(order1);
		
		return Data.orderList;
	}
	

	public static Invoice invoice(Order order1, double total) {
		Invoice invoice = new Invoice();
		invoice.setIdInvoice(1l);
		
		var iva  = order1.getSubtotal() * 0.19;
		invoice.setSubTotalIva(order1.getSubtotal()+ iva);
		
		if	(order1.getSubtotal() >= 100000) {
			invoice.setHomeValue(0);
		}else {
			invoice.setHomeValue(1000.0);
		}
		invoice.setTotal(total+ iva +invoice.getHomeValue());
		return invoice;
	}
	
	public Boolean validateDate(Order order , int time) {
		int comparateMS = 3600000 * time ;
		Date dateActual = new Date();
		Date dateOrder = order.getOrderDate();
		if(dateActual.getTime() - dateOrder.getTime() < comparateMS) {
			return true;
		}
		
		return false;
	}
	
	
	
	
}