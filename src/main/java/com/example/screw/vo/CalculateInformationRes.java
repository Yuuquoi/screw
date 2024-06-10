package com.example.screw.vo;

import java.util.List;

public class CalculateInformationRes {
	
	private int code;
	
	private String message;
	
	private List<CalculateInformationItem> calculateList;

	public CalculateInformationRes() {
		super();
	}

	public CalculateInformationRes(int code, String message, List<CalculateInformationItem> calculateList) {
		super();
		this.code = code;
		this.message = message;
		this.calculateList = calculateList;
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

	public List<CalculateInformationItem> getCalculateList() {
		return calculateList;
	}

	public void setCalculateList(List<CalculateInformationItem> calculateList) {
		this.calculateList = calculateList;
	}

}
