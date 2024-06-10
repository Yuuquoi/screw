package com.example.screw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "order_management")
public class OrderManagement {
	
	@Id
	@Column(name = "order_number") 
	private String orderNumber;
	
	@Column(name = "status") 
	private String status;
	
	@Column(name = "item") 
	private String item;
	
	@Column(name = "number") 
	private int number;
	
	@Column(name = "purchaser_name") 
	private String purchaserName;
	
	@Column(name = "purchaser_phone") 
	private String purchaserPhone;
	
	@Column(name = "purchaser_address") 
	private String purchaserAddress;
	
	@Column(name = "receiver_name") 
	private String receiverName;
	
	@Column(name = "receiver_phone") 
	private String receiverPhone;
	
	@Column(name = "receiver_address") 
	private String receiverAddress;
	
	@Column(name = "note") 
	private String note;

	public OrderManagement() {
		super();
	}

	public OrderManagement(String orderNumber, String status, String item, int number, String purchaserName,
			String purchaserPhone, String purchaserAddress, String receiverName, String receiverPhone,
			String receiverAddress, String note) {
		super();
		this.orderNumber = orderNumber;
		this.status = status;
		this.item = item;
		this.number = number;
		this.purchaserName = purchaserName;
		this.purchaserPhone = purchaserPhone;
		this.purchaserAddress = purchaserAddress;
		this.receiverName = receiverName;
		this.receiverPhone = receiverPhone;
		this.receiverAddress = receiverAddress;
		this.note = note;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPurchaserName() {
		return purchaserName;
	}

	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}

	public String getPurchaserPhone() {
		return purchaserPhone;
	}

	public void setPurchaserPhone(String purchaserPhone) {
		this.purchaserPhone = purchaserPhone;
	}

	public String getPurchaserAddress() {
		return purchaserAddress;
	}

	public void setPurchaserAddress(String purchaserAddress) {
		this.purchaserAddress = purchaserAddress;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
