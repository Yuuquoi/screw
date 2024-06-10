package com.example.screw.vo;

import java.util.List;

import com.example.screw.entity.Maintenance;

public class RecordReq {

	private List<Maintenance> record;

	public RecordReq() {
		super();
		
	}

	public RecordReq(List<Maintenance> record) {
		super();
		this.record = record;
	}

	public List<Maintenance> getRecord() {
		return record;
	}

	public void setRecord(List<Maintenance> record) {
		this.record = record;
	}
	
	
}
