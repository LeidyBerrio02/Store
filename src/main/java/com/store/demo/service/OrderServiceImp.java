package com.store.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.store.demo.model.Invoice;
import com.store.demo.model.Order;
import com.store.demo.model.Product;
import com.store.demo.util.Data;
import com.store.demo.util.GenerateDate;
@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	private InvoiceService invoiceService;

	
	public ArrayList<Order> orders() {	
		//Add Order		
		Date smp = null;
		try {
			smp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse("2021-03-08 05:30:22.333");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Order list 1, client 1
		
		
		Data.order1.setIdOrder(1L);
		//Fecha ingresada Data.order1.setOrderDate(smp);
		Data.order1.setOrderDate(new Date());
		//si active se cambia por "Delete" significa que se elimino el pedido y se le devolvera el 10
		Data.order1.setStatus("Active");
		

		/////////////////// detail
		Data.detailOrder.setId(1l);
		Data.detailOrder.setOrder(Data.order1);
		Data.detailOrder.setQuantityOrder(1);
		Data.detailOrder.setProduct(Data.product1);
		//
		
		Data.detailOrder1.setId(2l);
		Data.detailOrder1.setOrder(Data.order1);
		Data.detailOrder1.setQuantityOrder(1);
		Data.detailOrder1.setProduct(Data.product3);

		//En caso de agg nuevo producto
		Data.detailOrder2.setId(3l);
		Data.detailOrder2.setOrder(Data.order1);
		Data.detailOrder2.setQuantityOrder(1);
		Data.detailOrder2.setProduct(Data.product4);
		
		//agg detalles de pedido
		Data.detailList.add(Data.detailOrder);
		Data.detailList.add(Data.detailOrder1);
		Data.detailList.add(Data.detailOrder2);

		
		Data.order1.setSubtotal(subtotal());
		Data.order1.setDetailOrder(Data.detailList);
		
		double product = Data.detailOrder.getProduct().getPrice();
		double product2 = Data.detailOrder1.getProduct().getPrice();
		double newProduct = Data.detailOrder2.getProduct().getPrice();
		
		//invoice 
		Invoice in = invoiceService.invoice(total(product, product2, newProduct));
		Data.order1.setInvoice(in);
		
		//descuenta los productos del inventario del almacen que fueron enviados al pedido (Order)
		discountQuantity();					
		Data.orderList.add(Data.order1);
		
		return Data.orderList;
		
	}
	
	@Override
	public double subtotal() {
		double subt = 0;
		subt =  Data.detailOrder.getProduct().getPrice() * Data.detailOrder.getQuantityOrder();
		double subtotal1 = 0;
		subtotal1 = Data.detailOrder1.getProduct().getPrice() * Data.detailOrder1.getQuantityOrder();
		double subtotal2 = 0;
		subtotal2 =  + Data.detailOrder2.getProduct().getPrice() * Data.detailOrder2.getQuantityOrder();
		double subtotal = 0;
		subtotal = subt + subtotal1 + subtotal2;
		return subtotal;
	}
	
	@Override
	public double total(double product, double product2, double newProduct) {
		double total = 0;
		total = total + (product * Data.detailOrder.getQuantityOrder()) ;
		Data.detailOrder.setTotal(total);
		
		double total2 = 0;
		total2 = (product2 * Data.detailOrder1.getQuantityOrder());
		Data.detailOrder1.setTotal(total2);
		
		double total3 = 0;
		total3 = (newProduct * Data.detailOrder2.getQuantityOrder());
		Data.detailOrder2.setTotal(total3);
		
		total = total + total2 + total3;
		
		return total;
	}
	
	@Override
	public void discountQuantity() {
		int rest1 = 0;
		rest1  = Data.detailOrder.getProduct().getQuantityStock() - Data.detailOrder.getQuantityOrder(); 
		Data.detailOrder.getProduct().setQuantityStock(rest1);
		
		int rest2 = 0;
		rest1  = Data.detailOrder1.getProduct().getQuantityStock() - Data.detailOrder1.getQuantityOrder(); 
		Data.detailOrder1.getProduct().setQuantityStock(rest2);
		
		int rest3 = 0;
		rest3 = Data.detailOrder2.getProduct().getQuantityStock() - Data.detailOrder2.getQuantityOrder();
		Data.detailOrder2.getProduct().setQuantityStock(rest3);
	}

	/*
	@Autowired
	public Boolean updateOrder(Order order, Long idOrder) {
		
		if(GenerateDate.validateDate(Data.order1, 5)){
		Order orderDB = new Order();
		if	(order !=null && Data.order1.getIdOrder().equals(idOrder) && Data.order1.getSubtotal() >= order.getSubtotal()) {
			orderDB.setIdOrder(idOrder);
			orderDB.setOrderDate(new Date());
			orderDB.setSubtotal(order.getSubtotal());
			orderDB.setStatus("Edited");
			orderDB.setInvoice(order.getInvoice());
			orderDB.setDetailOrder(order.getDetailOrder());
			//Data.orderList.set(0, orderDB);
				//Data.orderList.add(order);
		}
		return true;
	}
	return false;
	
}
	*/
}