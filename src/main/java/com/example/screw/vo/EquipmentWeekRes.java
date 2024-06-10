package com.example.screw.vo;

import java.time.LocalDateTime;
import java.util.List;

public class EquipmentWeekRes extends BaseRes{

	private LocalDateTime startTime;
	
	private LocalDateTime endTime;
	
	private EquipmentWeek equipmentWeek;

	public EquipmentWeekRes() {
		super();
	}

	public EquipmentWeekRes(int code, String message) {
		super(code, message);
		
	}
	
	public EquipmentWeekRes(int code, String message, LocalDateTime startTime, LocalDateTime endTime, EquipmentWeek equipmentWeek) {
		super(code, message);
		this.startTime = startTime;
		this.endTime = endTime;
		this.equipmentWeek = equipmentWeek;
	}
	
	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public EquipmentWeek getEquipmentWeek() {
		return equipmentWeek;
	}

	public void setEquipmentWeek(EquipmentWeek equipmentWeek) {
		this.equipmentWeek = equipmentWeek;
	}
	
}
