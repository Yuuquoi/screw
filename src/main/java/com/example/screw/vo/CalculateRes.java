package com.example.screw.vo;

import java.util.List;

public class CalculateRes {
	
	private int code;
	
	private String message;
	
	private List<CalculateItem> calculateItem;

	public CalculateRes() {
		super();
	}

	public CalculateRes(int code, String message, List<CalculateItem> calculateItem) {
		super();
		this.code = code;
		this.message = message;
		this.calculateItem = calculateItem;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<CalculateItem> getCalculateItem() {
		return calculateItem;
	}

	public void setCalculateItem(List<CalculateItem> calculateItem) {
		this.calculateItem = calculateItem;
	}
	
}
