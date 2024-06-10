package com.example.screw.vo;

import java.util.List;

import com.example.screw.entity.Maintenance;

public class MaintenanceRes extends BaseRes{
	
	private List<Maintenance> maintenanceList;

	public MaintenanceRes() {
		super();
		
	}

	public MaintenanceRes(int code, String message) {
		super(code, message);
		
	}

	public MaintenanceRes(int code, String message,List<Maintenance> maintenanceList) {
		super(code, message);
		this.maintenanceList = maintenanceList;
	}

	public List<Maintenance> getMaintenanceList() {
		return maintenanceList;
	}

	public void setMaintenanceList(List<Maintenance> maintenanceList) {
		this.maintenanceList = maintenanceList;
	}

	
}
