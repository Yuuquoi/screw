package com.example.screw.vo;

import java.util.List;

public class OrderAndMachineRes extends BaseRes{
	
	private List<OrderAndMachine> OrderAndMachineList;

	public OrderAndMachineRes() {
		super();
		
	}

	public OrderAndMachineRes(int code, String message) {
		super(code, message);
		
	}

	public OrderAndMachineRes(int code, String message, List<OrderAndMachine> orderAndMachineList) {
		super(code, message);
		OrderAndMachineList = orderAndMachineList;
	}

	public List<OrderAndMachine> getOrderAndMachineList() {
		return OrderAndMachineList;
	}

	public void setOrderAndMachineList(List<OrderAndMachine> orderAndMachineList) {
		OrderAndMachineList = orderAndMachineList;
	}

}
