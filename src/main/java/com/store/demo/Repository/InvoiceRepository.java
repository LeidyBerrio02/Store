package com.store.demo.Repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.store.demo.model.Invoice;

@Repository
public class InvoiceRepository {
	
	public ArrayList<Invoice> listInvoice(){

	ArrayList<Invoice> listInvoice = new ArrayList<Invoice>();
	
	/*Invoice invoice1 = new Invoice();
	Invoice invoice2 = new Invoice();
	
	listInvoice.add(invoice1);
	listInvoice.add(invoice2);
	*/
	
	return listInvoice;
	
	}
}
