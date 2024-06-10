package com.example.screw.vo;

import java.util.List;

public class ElectricityRes extends BaseRes{

	private double runElectricity;
	
	private double idleElectricity;
	
	private double errorElectricity;

	public ElectricityRes() {
		super();
	}

	public ElectricityRes(int code, String message) {
		super(code, message);
	}

	public ElectricityRes(int code, String message, double runElectricity, double idleElectricity, double errorElectricity) {
		super(code, message);
		this.runElectricity = runElectricity;
		this.idleElectricity = idleElectricity;
		this.errorElectricity = errorElectricity;
	}

	public double getRunElectricity() {
		return runElectricity;
	}

	public void setRunElectricity(double runElectricity) {
		this.runElectricity = runElectricity;
	}

	public double getIdleElectricity() {
		return idleElectricity;
	}

	public void setIdleElectricity(double idleElectricity) {
		this.idleElectricity = idleElectricity;
	}

	public double getErrorElectricity() {
		return errorElectricity;
	}

	public void setErrorElectricity(double errorElectricity) {
		this.errorElectricity = errorElectricity;
	}
	
}
