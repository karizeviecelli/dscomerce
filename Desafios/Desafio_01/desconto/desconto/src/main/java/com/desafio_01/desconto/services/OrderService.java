package com.desafio_01.desconto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio_01.desconto.entities.Order;

@Service
public class OrderService {


	private ShippingService shipp;
	
	

	public OrderService(ShippingService shipp) {
	
		this.shipp = shipp;
	}



	public Double total(Order order) {
		Double desconto = order.getBasic() * (order.getDiscount() / 100);
		Double frete = shipp.shippiment(order);
		return (order.getBasic() - desconto) + frete;
	}

}
