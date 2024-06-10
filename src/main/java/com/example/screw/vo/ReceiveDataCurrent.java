package com.example.screw.vo;

public class ReceiveDataCurrent {
	
	private String name;

	private double current;

	public ReceiveDataCurrent() {
		super();
	}

	public ReceiveDataCurrent(String name, double current) {
		super();
		this.name = name;
		this.current = current;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}
	
}
