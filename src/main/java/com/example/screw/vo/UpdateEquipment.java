package com.example.screw.vo;

import java.time.LocalDate;

public class UpdateEquipment {
	
	private String name;              // 設備編號 或 電壓
	
	private int voltage;       			// 設備電壓
	
	private String type;       			// 設備類型

	private String phone;
	
	private String location;
	
	private LocalDate warrantyDate;
	
	private LocalDate purchaseDate;
	
	private String record;
	
	private String email;
	
	private boolean status;
	
	private int price;     
	
	private LocalDate lifespan;
	
	private String maintenanceStaff;
	
	private String address;

	public UpdateEquipment() {
		super();
	}

	public UpdateEquipment(String name, int voltage, String type, String phone, String location, LocalDate warrantyDate,
			LocalDate purchaseDate, String record, String email, boolean status, int price, LocalDate lifespan,
			String maintenanceStaff, String address) {
		super();
		this.name = name;
		this.voltage = voltage;
		this.type = type;
		this.phone = phone;
		this.location = location;
		this.warrantyDate = warrantyDate;
		this.purchaseDate = purchaseDate;
		this.record = record;
		this.email = email;
		this.status = status;
		this.price = price;
		this.lifespan = lifespan;
		this.maintenanceStaff = maintenanceStaff;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getLifespan() {
		return lifespan;
	}

	public void setLifespan(LocalDate lifespan) {
		this.lifespan = lifespan;
	}

	public String getMaintenanceStaff() {
		return maintenanceStaff;
	}

	public void setMaintenanceStaff(String maintenanceStaff) {
		this.maintenanceStaff = maintenanceStaff;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
