package com.example.screw.vo;

public class EquipmentWeek {
	
	private String name;
	
	private double runAvg;
	
	private double passAvg;
	
	private double power;

	public EquipmentWeek() {
		super();
		
	}

	public EquipmentWeek(String name, double runAvg, double passAvg, double power) {
		super();
		this.name = name;
		this.runAvg = runAvg;
		this.passAvg = passAvg;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRunAvg() {
		return runAvg;
	}

	public void setRunAvg(double runAvg) {
		this.runAvg = runAvg;
	}

	public double getPassAvg() {
		return passAvg;
	}

	public void setPassAvg(double passAvg) {
		this.passAvg = passAvg;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

}
