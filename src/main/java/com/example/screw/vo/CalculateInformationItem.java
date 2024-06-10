package com.example.screw.vo;

import java.util.List;

public class CalculateInformationItem {
		
	private String orderNumber;   // 單號
	
	private String name;   // 名稱

	private double carbonEmission;  // 計算出的碳排結果
	
	private int aim;       // 目標量
	
	private int produce;   // 產量
	
	private int weight;    // 重量 
	
	private List<ProduceObj> raw;    // 原料
	
	private List<ProduceObj> process;  // 製程

	public CalculateInformationItem() {
		super();
	}

	public CalculateInformationItem(String orderNumber, String name, double carbonEmission, int aim, int produce, int weight,
			List<ProduceObj> raw, List<ProduceObj> process) {
		super();
		this.orderNumber = orderNumber;
		this.name = name;
		this.carbonEmission = carbonEmission;
		this.aim = aim;
		this.produce = produce;
		this.weight = weight;
		this.raw = raw;
		this.process = process;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

	public List<ProduceObj> getRaw() {
		return raw;
	}

	public void setRaw(List<ProduceObj> raw) {
		this.raw = raw;
	}

	public List<ProduceObj> getProcess() {
		return process;
	}

	public void setProcess(List<ProduceObj> process) {
		this.process = process;
	}
	
}
