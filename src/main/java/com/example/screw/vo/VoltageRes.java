package com.example.screw.vo;

import java.util.List;

public class VoltageRes extends BaseRes{

	private List<MachineVoltage> voltageList;

	public VoltageRes() {
		super();
	}

	
	public VoltageRes(int code, String message) {
		super(code, message);
		
	}


	public VoltageRes(int code, String message, List<MachineVoltage> voltageList) {
		super(code, message);
		this.voltageList = voltageList;
	}

	public List<MachineVoltage> getVoltageList() {
		return voltageList;
	}

	public void setVoltageList(List<MachineVoltage> voltageList) {
		this.voltageList = voltageList;
	}
	
}
