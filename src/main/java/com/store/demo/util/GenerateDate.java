package com.store.demo.util;

import java.util.Date;

import com.store.demo.model.Order;

public class GenerateDate {

	public static Boolean validateDate(Order order , int time) {
		int comparateMS = 3600000 * time ;
		Date dateActual = new Date();
		Date dateOrder = order.getOrderDate();
		if(dateActual.getTime() - dateOrder.getTime() < comparateMS) {
			return true;
		}
		
		return false;
	}
}

