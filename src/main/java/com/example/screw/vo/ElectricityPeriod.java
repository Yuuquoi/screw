package com.example.screw.vo;

public class ElectricityPeriod {

	private String name;
	
	private double runIT;  
	
	private double idleIT;  
	
	private double errorIT;

	public ElectricityPeriod() {
		super();
	}

	public ElectricityPeriod(String name, double runIT, double idleIT, double errorIT) {
		super();
		this.name = name;
		this.runIT = runIT;
		this.idleIT = idleIT;
		this.errorIT = errorIT;
	}

	public double getRunIT() {
		return runIT;
	}

	public void setRunIT(double runIT) {
		this.runIT = runIT;
	}

	public double getIdleIT() {
		return idleIT;
	}

	public void setIdleIT(double idleIT) {
		this.idleIT = idleIT;
	}

	public double getErrorIT() {
		return errorIT;
	}

	public void setErrorIT(double errorIT) {
		this.errorIT = errorIT;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
