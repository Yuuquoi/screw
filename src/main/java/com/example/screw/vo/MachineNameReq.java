package com.example.screw.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MachineNameReq {
	
	@JsonProperty("machineName_list")
	private List<String> machineNameList;

	public MachineNameReq() {
		super();
	}

	public MachineNameReq(List<String> machineNameList) {
		super();
		this.machineNameList = machineNameList;
	}

	public List<String> getMachineNameList() {
		return machineNameList;
	}

	public void setMachineNameList(List<String> machineNameList) {
		this.machineNameList = machineNameList;
	}

}
