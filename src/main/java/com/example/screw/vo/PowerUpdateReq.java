package com.example.screw.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class PowerUpdateReq {

	@NotEmpty(message = "單號不可為空")
	private String orderNumber;   // 單號
	
	@Min(value = 1, message = "目標量需至少為 {value}")
	private int aim;              // 目標量
	
	@Min(value = 0, message = "累積產量不得為負")
	private int produce;          // 累積產量(不包含今日)
	
	@Min(value = 0, message = "單顆螺絲重量不得為負")
	private int weight;           // 每顆螺絲的重量(g)
	
	@Min(value = 0, message = "累積電度不得為負")
	private double powerUsage;    // 累積電度(不包含今日)

	public PowerUpdateReq() {
		super();
	}

	public PowerUpdateReq(String orderNumber, int aim, int produce, int weight, double powerUsage) {
		super();
		this.orderNumber = orderNumber;
		this.aim = aim;
		this.produce = produce;
		this.weight = weight;
		this.powerUsage = powerUsage;
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

	public int getProduce() {
		return produce;
	}

	public void setProduce(int produce) {
		this.produce = produce;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getPowerUsage() {
		return powerUsage;
	}

	public void setPowerUsage(double powerUsage) {
		this.powerUsage = powerUsage;
	}
	
}
