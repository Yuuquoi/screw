package com.example.screw.vo;

import java.util.List;

public class UpdateEquipmentReq {
	
	private List<UpdateEquipment> updateEquipmentList;

	public UpdateEquipmentReq() {
		super();
	}

	public UpdateEquipmentReq(List<UpdateEquipment> updateEquipmentList) {
		super();
		this.updateEquipmentList = updateEquipmentList;
	}

	public List<UpdateEquipment> getUpdateEquipmentList() {
		return updateEquipmentList;
	}

	public void setUpdateEquipmentList(List<UpdateEquipment> updateEquipmentList) {
		this.updateEquipmentList = updateEquipmentList;
	}

}
