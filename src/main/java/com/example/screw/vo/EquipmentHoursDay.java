package com.example.screw.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EquipmentHoursDay {

	private long pass;
	
	private double power;
	
	private LocalDateTime time;
	
	private String type;

	public EquipmentHoursDay() {
		super();
	}

	public EquipmentHoursDay(long pass, double power, LocalDateTime time, String type) {
		super();
		this.pass = pass;
		this.power = power;
		this.time = time;
		this.type = type;
	}

	public long getPass() {
		return pass;
	}

	public void setPass(long pass) {
		this.pass = pass;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
