package com.example.screw.vo;

public class ReceiveDataStatus {

	private String name;
	
	private long status;

	public ReceiveDataStatus() {
		super();
	}

	public ReceiveDataStatus(String name, long status) {
		super();
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}
	
}
