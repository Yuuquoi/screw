package com.example.screw.vo;

import java.time.LocalDateTime;

public class OrderAndMachine {

	private String orderNumber;
	
	private int aim;
	
	private int pass;
	
	private double passAvg;
	
	private String type;
	
	private LocalDateTime finishTime;
	
	private LocalDateTime updateTime;
	
	private String totalTime;

	public OrderAndMachine() {
		super();
		
	}

	public OrderAndMachine(String orderNumber, int aim, int pass, double passAvg, String type, LocalDateTime finishTime,
			LocalDateTime updateTime, String totalTime) {
		super();
		this.orderNumber = orderNumber;
		this.aim = aim;
		this.pass = pass;
		this.passAvg = passAvg;
		this.type = type;
		this.finishTime = finishTime;
		this.updateTime = updateTime;
		this.totalTime = totalTime;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getAim() {
		return aim;
	}

	public void setAim(int aim) {
		this.aim = aim;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public double getPassAvg() {
		return passAvg;
	}

	public void setPassAvg(double passAvg) {
		this.passAvg = passAvg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(LocalDateTime finishTime) {
		this.finishTime = finishTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	
}
