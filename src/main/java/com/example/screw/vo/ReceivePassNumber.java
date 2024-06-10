package com.example.screw.vo;

public class ReceivePassNumber {
	
	private String type;
	
	private String orderNumber;
	
	private double pass;

	public ReceivePassNumber() {
		super();
	}

	public ReceivePassNumber(String type, String orderNumber, double pass) {
		super();
		this.type = type;
		this.orderNumber = orderNumber;
		this.pass = pass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getPass() {
		return pass;
	}

	public void setPass(double pass) {
		this.pass = pass;
	}

}
