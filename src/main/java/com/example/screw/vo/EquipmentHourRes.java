package com.example.screw.vo;

import java.util.List;

import com.example.screw.entity.EquipmentHour;

public class EquipmentHourRes extends BaseRes{

	private List<EquipmentHour> equipmentHourList;

	public EquipmentHourRes() {
		super();
	}

	public EquipmentHourRes(int code, String message) {
		super(code, message);
	}

	public EquipmentHourRes(int code, String message, List<EquipmentHour> equipmentHourList) {
		super(code, message);
		this.equipmentHourList = equipmentHourList;
	}

	public List<EquipmentHour> getEquipmentHourList() {
		return equipmentHourList;
	}

	public void setEquipmentHourList(List<EquipmentHour> equipmentHourList) {
		this.equipmentHourList = equipmentHourList;
	}
	
}
