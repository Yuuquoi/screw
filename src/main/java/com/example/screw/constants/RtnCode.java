package com.example.screw.constants;

public enum RtnCode {


	VOLTAGE_CANNOT_BE_ZERO(400, "Voltage can not be zero"),//
	MACHINE_NAME_CANNOT_BE_NULL(400, "Machine name can not be null"),
	ORDER_NAME_CANNOT_BE_NULL(400, "Order name can not be null"),
	PASSWORD_ERROR(400, "密碼錯誤"), //
	ACCOUNT_NOT_EXISTS(400, "帳號不存在"), //
	NO_DATA(400, "查無資料"), //
	ACCOUNT_EXISTS(400, "Account already exists !!"), //
	NEED_MACHINE_NAME(400,"Need machine name !!"),//
	VOLTAGE_CANNOT_ZERO(400, "Voltage_Cannot_Zero"),//
	ORDER_NUMBER_NOT_EXISTS(400, "Not exists order numner !!"), //
	ORDER_NUMBER_DUPLICATED(400, "單號已存在"), //
	JSON_ERROR(400, "JSON error!!"), //
	MACHINE_NAME_NOT_FOUND(404, "Machine name not found"),//
	TYPE_NOT_FOUND(404, "Type not found"),//
	RECIVEDATA_ERROR(400, "ReciveData error"),//
	PLEASE_LOGIN_FIRST(404, "Please login first"), //
	SUCCESS_AND_SAVE(200, "Success and save!!"), //
	SUCCESS(200, "Success!!"); //

	private int code;

	private String message;

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
