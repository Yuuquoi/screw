package com.example.screw.vo;

import java.util.List;

public class RecordDeleteReq {
	
	private List<RecordDelete> recordDeleteList;

	public RecordDeleteReq() {
		super();
		
	}

	public RecordDeleteReq(List<RecordDelete> recordDeleteList) {
		super();
		this.recordDeleteList = recordDeleteList;
	}

	public List<RecordDelete> getRecordDeleteList() {
		return recordDeleteList;
	}

	public void setRecordDeleteList(List<RecordDelete> recordDeleteList) {
		this.recordDeleteList = recordDeleteList;
	}

}
