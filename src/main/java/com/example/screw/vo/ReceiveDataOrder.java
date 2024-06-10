package com.example.screw.vo;

public class ReceiveDataOrder {
	
	private String type;
	
	private String orderNumber;
	
	private long pass;
	
	private long ng;
	
	private double number;

	public ReceiveDataOrder() {
		super();
	}

	public ReceiveDataOrder(String type, String orderNumber, long pass, long ng, double number) {
		super();
		this.type = type;
		this.orderNumber = orderNumber;
		this.pass = pass;
		this.ng = ng;
		this.number = number;
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

	public long getPass() {
		return pass;
	}

	public void setPass(long pass) {
		this.pass = pass;
	}

	public long getNg() {
		return ng;
	}

	public void setNg(long ng) {
		this.ng = ng;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

}
