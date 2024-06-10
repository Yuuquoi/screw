package com.example.screw.vo;

import java.util.List;

import com.example.screw.entity.OrderManagement;

public class OrderManagementRes extends BaseRes{

	private List<OrderManagement> orderManagementList;

	public OrderManagementRes() {
		super();
	}

	public OrderManagementRes(int code, String message) {
		super(code, message);
	}

	public OrderManagementRes(int code, String message, List<OrderManagement> orderManagementList) {
		super(code, message);
		this.orderManagementList = orderManagementList;
	}

	public List<OrderManagement> getOrderManagementList() {
		return orderManagementList;
	}

	public void setOrderManagementList(List<OrderManagement> orderManagementList) {
		this.orderManagementList = orderManagementList;
	}
	
}
