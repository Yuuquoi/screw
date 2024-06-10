package com.example.screw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "order")
public class Order {

	@NotBlank(message = "單號不能為空")
	@Id
	@Column(name = "order_number")
	private String orderNumber; // 單號作為 pk，假設一張單號為一種螺絲

	@Min(value = 1, message = "目標生產量需至少為 {value} 顆")
	@Column(name = "aim")
	private int aim; // 單顆螺絲的重量(g)	
	
	@Min(value = 1, message = "單顆產品重量需至少為 {value} 克")
	@Column(name = "weight")
	private int weight; // 單顆螺絲的重量(g)

	@Min(value = 0, message = "製造的起點至少須為抽線")
	@Min(value = 4, message = "製造的起點至少須為電鍍")
	@Column(name = "start_process_index")
	private int startProcessIndex;    // 製造的起點
	
	@Min(value = 0, message = "製造的終點至少須為抽線")
	@Min(value = 4, message = "製造的起點至少須為電鍍")
	@Column(name = "end_process_index")
	private int endProcessIndex;      // 製造的終點
	
	@Column(name = "pull_thread")
	private String pullThreadString;  // 抽線(0)
	
	@Column(name = "forming")
	private String formingString;     // 鍛造成型(1)
	
	@Column(name = "grind_teeth")
	private String grindTeethString;     // 輾牙(2)

	@Column(name = "heat_treatment")
	private String heatTreatmentString;  // 熱處理(3)

	@Column(name = "electroplating")
	private String electroplatingString; // 電鍍(4)

	@Column(name = "del")
	private boolean del;

	public Order() {
		super();
	}
	
	public Order(@NotBlank(message = "單號不能為空") String orderNumber,
			@Min(value = 1, message = "目標生產量需至少為 {value} 顆") int aim,
			@Min(value = 1, message = "單顆產品重量需至少為 {value} 克") int weight,
			@Min(value = 0, message = "製造的起點至少須為抽線") @Min(value = 4, message = "製造的起點至少須為電鍍") int startProcessIndex,
			@Min(value = 0, message = "製造的終點至少須為抽線") @Min(value = 4, message = "製造的起點至少須為電鍍") int endProcessIndex,
			String pullThreadString, String formingString, String grindTeethString, String heatTreatmentString,
			String electroplatingString, boolean del) {
		super();
		this.orderNumber = orderNumber;
		this.aim = aim;
		this.weight = weight;
		this.startProcessIndex = startProcessIndex;
		this.endProcessIndex = endProcessIndex;
		this.pullThreadString = pullThreadString;
		this.formingString = formingString;
		this.grindTeethString = grindTeethString;
		this.heatTreatmentString = heatTreatmentString;
		this.electroplatingString = electroplatingString;
		this.del = del;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public int getAim() {
		return aim;
	}

	public void setAim(int aim) {
		this.aim = aim;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getStartProcessIndex() {
		return startProcessIndex;
	}

	public void setStartProcessIndex(int startProcessIndex) {
		this.startProcessIndex = startProcessIndex;
	}

	public int getEndProcessIndex() {
		return endProcessIndex;
	}

	public void setEndProcessIndex(int endProcessIndex) {
		this.endProcessIndex = endProcessIndex;
	}

	public String getPullThreadString() {
		return pullThreadString;
	}

	public void setPullThreadString(String pullThreadString) {
		this.pullThreadString = pullThreadString;
	}

	public String getFormingString() {
		return formingString;
	}

	public void setFormingString(String formingString) {
		this.formingString = formingString;
	}

	public String getGrindTeethString() {
		return grindTeethString;
	}

	public void setGrindTeethString(String grindTeethString) {
		this.grindTeethString = grindTeethString;
	}

	public String getHeatTreatmentString() {
		return heatTreatmentString;
	}

	public void setHeatTreatmentString(String heatTreatmentString) {
		this.heatTreatmentString = heatTreatmentString;
	}

	public String getElectroplatingString() {
		return electroplatingString;
	}

	public void setElectroplatingString(String electroplatingString) {
		this.electroplatingString = electroplatingString;
	}

	public boolean isDel() {
		return del;
	}

	public void setDel(boolean del) {
		this.del = del;
	}

}