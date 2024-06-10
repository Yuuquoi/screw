package com.example.screw.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_hour")
public class EquipmentHour {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "pass")
	private int pass;
	
	@Column(name = "power")
	private double power;
	
	@Column(name = "time")
	private LocalDateTime time;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "run_avg")
	private double runAvg;
	
	@Column(name = "pass_avg")
	private double passAvg;

	public EquipmentHour() {
		super();
		
	}

	public EquipmentHour(int id, String name, int pass, double power, LocalDateTime time, String type, double runAvg,
			double passAvg) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.power = power;
		this.time = time;
		this.type = type;
		this.runAvg = runAvg;
		this.passAvg = passAvg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
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

}
