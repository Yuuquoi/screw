package com.example.screw.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProduceObj {   // 單筆原料的 obj
	
	@NotBlank(message = "名稱不能為空")
	private String name;    // 原料名稱
	
	@Min(value = 0, message = "用量不得為負")
	private double amount;     // 用量
	
	@Min(value = 0, message = "碳排放係數不得為負")
	private double carbonCoefficient;   // 碳排放係數

	public ProduceObj() {
		super();
	}

	public ProduceObj(String name, double amount, double carbonCoefficient) {
		super();
		this.name = name;
		this.amount = amount;
		this.carbonCoefficient = carbonCoefficient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getCarbonCoefficient() {
		return carbonCoefficient;
	}

	public void setCarbonCoefficient(double carbonCoefficient) {
		this.carbonCoefficient = carbonCoefficient;
	}
	
}
