package com.store.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

public class Order {

	private Long idOrder;

	@Temporal(TemporalType.TIMESTAMP)
	//@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss")
	private Date orderDate;
	
	private double subtotal;

	private String status;
	
	private List<DetailOrder> detailOrder;
	
	private Invoice invoice;

	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<DetailOrder> getDetailOrder() {
		return detailOrder;
	}

	public void setDetailOrder(List<DetailOrder> detailOrder) {
		this.detailOrder = detailOrder;
	}

	public Long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}	
	
}
