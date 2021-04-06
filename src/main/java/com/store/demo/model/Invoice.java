package com.store.demo.model;

import javax.persistence.*;

@Table(name="invoice")
@Entity(name="invoice")
public class Invoice {
	
	@Column(name="total")
	private double total;

	@Column(name="homeValue")
	private double homeValue;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getHomeValue() {
		return homeValue;
	}

	public void setHomeValue(double homeValue) {
		this.homeValue = homeValue;
	}
	
	
}
