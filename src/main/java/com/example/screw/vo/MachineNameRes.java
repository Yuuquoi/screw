package com.example.screw.vo;

import java.util.List;

public class MachineNameRes extends BaseRes{

	private List<EquipmentName> machineNameList;

	public MachineNameRes() {
		super();
	}

	public MachineNameRes(int code, String message) {
		super(code, message);
	}

	public MachineNameRes(int code, String message, List<EquipmentName> machineNameList) {
		super(code, message);
		this.machineNameList = machineNameList;
	}

	public List<EquipmentName> getMachineNameList() {
		return machineNameList;
	}

	public void setMachineNameList(List<EquipmentName> machineNameList) {
		this.machineNameList = machineNameList;
	}
	
}
