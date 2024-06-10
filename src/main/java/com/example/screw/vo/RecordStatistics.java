package com.example.screw.vo;

public class RecordStatistics {
	
	private String reason;
	
	private long count;

	public RecordStatistics() {
		super();
		
	}

	public RecordStatistics(String reason, long count) {
		super();
		this.reason = reason;
		this.count = count;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}
