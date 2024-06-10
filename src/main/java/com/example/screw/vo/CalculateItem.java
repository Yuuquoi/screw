package com.example.screw.vo;

public class CalculateItem {
	
	private int orderNo;            // 訂單編號

	private String name;            // 訂單名稱
	
	private double carbonEmission;  // 計算出的碳排結果

	public CalculateItem() {
		super();
	}
	
	public CalculateItem(int orderNo, String name, double carbonEmission) {
		super();
		this.orderNo = orderNo;
		this.name = name;
		this.carbonEmission = carbonEmission;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCarbonEmission() {
		return carbonEmission;
	}

	public void setCarbonEmission(double carbonEmission) {
		this.carbonEmission = carbonEmission;
	}
	
	
}
