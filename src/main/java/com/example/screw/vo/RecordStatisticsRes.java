package com.example.screw.vo;

import java.util.List;

public class RecordStatisticsRes extends BaseRes{

	private List<RecordStatistics> recordStatisticsList;

	public RecordStatisticsRes() {
		super();
		
	}

	public RecordStatisticsRes(int code, String message) {
		super(code, message);
		
	}

	public RecordStatisticsRes(int code, String message, List<RecordStatistics> recordStatisticsList) {
		super(code, message);
		this.recordStatisticsList = recordStatisticsList;
	}

	public List<RecordStatistics> getRecordStatisticsList() {
		return recordStatisticsList;
	}

	public void setRecordStatisticsList(List<RecordStatistics> recordStatisticsList) {
		this.recordStatisticsList = recordStatisticsList;
	}
	
}
