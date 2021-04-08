package com.store.demo.model;

public class Invoice {
	
	private Long idInvoice;
	
	//total + iva
	private double subTotalIva;
	
	private double homeValue; 
	
	private double total;

	public Long getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(Long idInvoice) {
		this.idInvoice = idInvoice;
	}

	public double getSubTotalIva() {
		return subTotalIva;
	}

	public void setSubTotalIva(double subTotalIva) {
		this.subTotalIva = subTotalIva;
	}

	public double getHomeValue() {
		return homeValue;
	}

	public void setHomeValue(double homeValue) {
		this.homeValue = homeValue;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	
}
