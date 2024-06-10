package com.example.screw.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RecordDelete {
	
	private String name;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm")
	private LocalDateTime time;

	public RecordDelete() {
		super();
		
	}

	public RecordDelete(String name, LocalDateTime time) {
		super();
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

}
