package com.example.screw.vo;

import java.time.LocalDateTime;

public class ReceiveDataNew {

	private String name;
	
	private String status;
	
	private String orderNumber;
	
	private int pass;
	
	private String type;
	
	private LocalDateTime time;

	public ReceiveDataNew() {
		super();
		
	}

	public ReceiveDataNew(String name, String status, String orderNumber, int pass, String type, LocalDateTime time) {
		super();
		this.name = name;
		this.status = status;
		this.orderNumber = orderNumber;
		this.pass = pass;
		this.type = type;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
}
