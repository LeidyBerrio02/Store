package com.store.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;


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
			smp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2021-03-08 05:30:22.333");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Order list 1, client 1
		
		
		Data.order1.setIdOrder(1L);
		Data.order1.setOrderDate(smp);
		Data.order1.setStatus("Active");
		

		/////////////////// detail
		
		Data.detailOrder.setId(1l);
		Data.detailOrder.setOrder(Data.order1);
		Data.detailOrder.setProduct(Data.product1);
		Data.detailOrder.setQuantityOrder(1);
		double total = 0;
		total = total + (Data.product1.getPrice() * Data.detailOrder.getQuantityOrder()) ;
		Data.detailOrder.setTotal(total);
		
		//
		
		Data.detailOrder1.setId(2l);
		Data.detailOrder1.setOrder(Data.order1);
		Data.detailOrder1.setProduct(Data.product4);
		Data.detailOrder1.setQuantityOrder(2);
		
		double total2 = 0;
		total2 = (Data.product4.getPrice() * Data.detailOrder1.getQuantityOrder());
		Data.detailOrder1.setTotal(total2);
		total = total + total2;
		
		Data.detailList.add(Data.detailOrder);
		Data.detailList.add(Data.detailOrder1);
		
		Data.order1.setSubtotal((Data.product1.getPrice() * Data.detailOrder.getQuantityOrder())+ (Data.product4.getPrice() * Data.detailOrder1.getQuantityOrder()));
		Data.order1.setDetailOrder(Data.detailList);
		
		//invoice 
		Invoice in = invoice(Data.order1 , total);
		Data.order1.setInvoice(in);
		
		//Add Order
		Data.orderList.add(Data.order1);
		
		return Data.orderList;
	}
	

	@Override
	public Invoice invoice(Order order1, double total) {
		
		Data.invoice.setIdInvoice(1l);
		
		var iva  = order1.getSubtotal() * 0.19;
		Data.invoice.setSubTotalIva(order1.getSubtotal()+ iva);
		
		if	(order1.getSubtotal() >= 100000) {
			Data.invoice.setHomeValue(0);
		}else {
			Data.invoice.setHomeValue(1000.0);
		}
		Data.invoice.setTotal(total+ iva +Data.invoice.getHomeValue());
		return Data.invoice;
	}
	
	@Override
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