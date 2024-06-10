package com.example.screw.vo;

public class PowerUpdateRes {

	private int code;
	
	private String message;

	private double powerUsageEstimate;   // 預估生產完所有螺絲的用電量
	
	private double powerCarbon;          // 電的碳排放

	public PowerUpdateRes() {
		super();
	}

	public PowerUpdateRes(int code, String message, double powerUsageEstimate, double powerCarbon) {
		super();
		this.code = code;
		this.message = message;
		this.powerUsageEstimate = powerUsageEstimate;
		this.powerCarbon = powerCarbon;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPowerUsageEstimate() {
		return powerUsageEstimate;
	}

	public void setPowerUsageEstimate(double powerUsageEstimate) {
		this.powerUsageEstimate = powerUsageEstimate;
	}

	public double getPowerCarbon() {
		return powerCarbon;
	}

	public void setPowerCarbon(double powerCarbon) {
		this.powerCarbon = powerCarbon;
	}

}
