package com.example.screw.vo;

// 用來對應 settle dao 的回傳結果
public class SettleOrderVo {
	
	private String orderNumber;
	
	private double kWhSum;      // 電流量加總
	
	private long produceTodaySum;    // pass加總

	public SettleOrderVo() {
		super();
	}

	public SettleOrderVo(String orderNumber, double kWhSum, long produceTodaySum) {
		super();
		this.orderNumber = orderNumber;
		this.kWhSum = kWhSum;
		this.produceTodaySum = produceTodaySum;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getKWhSum() {
		return kWhSum;
	}

	public void setKWhSum(double kWhSum) {
		this.kWhSum = kWhSum;
	}

	public long getProduceTodaySum() {
		return produceTodaySum;
	}

	public void setProduceTodaySum(long produceTodaySum) {
		this.produceTodaySum = produceTodaySum;
	}

}
