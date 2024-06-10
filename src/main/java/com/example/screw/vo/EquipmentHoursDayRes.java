package com.example.screw.vo;

import java.util.List;

public class EquipmentHoursDayRes extends BaseRes{

	private List<EquipmentHoursDay> equipmentHoursDayList;

	public EquipmentHoursDayRes() {
		super();
	}

	public EquipmentHoursDayRes(int code, String message) {
		super(code, message);
	}

	public EquipmentHoursDayRes(int code, String message,List<EquipmentHoursDay> equipmentHoursDayList) {
		super(code, message);
		this.equipmentHoursDayList = equipmentHoursDayList;
	}

	public List<EquipmentHoursDay> getEquipmentHoursDayList() {
		return equipmentHoursDayList;
	}

	public void setEquipmentHoursDayList(List<EquipmentHoursDay> equipmentHoursDayList) {
		this.equipmentHoursDayList = equipmentHoursDayList;
	}
	
}
