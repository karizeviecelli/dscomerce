package com.desafio_01.desconto.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {	
	@Autowired
	private Integer code;
	@Autowired
	private Double basic;
	@Autowired
	private Double discount;
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Double getBasic() {
		return basic;
	}
	public void setBasic(Double basic) {
		this.basic = basic;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	

}
