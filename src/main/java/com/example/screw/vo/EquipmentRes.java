package com.example.screw.vo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

import com.example.screw.entity.Equipment;

public class EquipmentRes extends BaseRes{
	
	private List<Equipment> equipmentList;

	public EquipmentRes() {
		super();
	}

	public EquipmentRes(int code, String message) {
		super(code, message);
	}

	public EquipmentRes(int code, String message, List<Equipment> equipmentList) {
		super(code, message);
		this.equipmentList = equipmentList;
	}

	public List<Equipment> getEquipmentList() {
		return equipmentList;
	}

	public void setEquipmentList(List<Equipment> equipmentList) {
		this.equipmentList = equipmentList;
	}
	
}
