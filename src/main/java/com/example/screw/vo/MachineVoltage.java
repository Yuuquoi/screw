package com.example.screw.vo;

public class MachineVoltage {
	
	private String name;
	
	private double voltage;

	public MachineVoltage(String name, double voltage) {
		super();
		this.name = name;
		this.voltage = voltage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	
}
