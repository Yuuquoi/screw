package com.example.screw.vo;

import com.example.screw.entity.Order;

public class SearchOrderRes {

	private int code;

	private String message;
	
	private Order orderManufacture;

	public SearchOrderRes() {
		super();
	}

	public SearchOrderRes(int code, String message, Order orderManufacture) {
		super();
		this.code = code;
		this.message = message;
		this.orderManufacture = orderManufacture;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Order getOrderManufacture() {
		return orderManufacture;
	}

	public void setOrderManufacture(Order orderManufacture) {
		this.orderManufacture = orderManufacture;
	}

}
