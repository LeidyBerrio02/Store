package com.store.demo.service;

import org.springframework.stereotype.Service;

import com.store.demo.model.Invoice;
import com.store.demo.util.Data;

@Service
public class InvoiceServiceImp implements InvoiceService {

	@Override
	public Invoice invoice(double total) {
		
		Data.invoice.setIdInvoice(1l);
		
		var iva  = Data.order1.getSubtotal() * 0.19;
		Data.invoice.setSubTotalIva(Data.order1.getSubtotal()+ iva);
		
		if	(Data.order1.getSubtotal() >= 100000.0 || Data.order1.getSubtotal() == 0) {
			Data.invoice.setHomeValue(0);
		}else {
			Data.invoice.setHomeValue(1000.0);
		}
		Data.invoice.setTotal(total+ iva +Data.invoice.getHomeValue());
		return Data.invoice;
	}	
}
