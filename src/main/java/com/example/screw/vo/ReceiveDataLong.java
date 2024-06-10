package com.example.screw.vo;



public class ReceiveDataLong {
	
	private String name;
	
	private long pass;
	
	private long ng;
	
	private double current;
	
	private long status;

	public ReceiveDataLong() {
		super();
	}

	public ReceiveDataLong(String name, double current, long pass, long ng) {
		super();
		this.name = name;
		this.current = current;
		this.pass = pass;
		this.ng = ng;
	}
	
	

	public ReceiveDataLong(String name, long pass, double current) {
		super();
		this.name = name;
		this.pass = pass;
		this.current = current;
		
	}

	public ReceiveDataLong(String name, long status) {
		super();
		this.name = name;
		this.status = status;
	}

	public ReceiveDataLong(String name, long pass, long ng, double current, long status) {
		super();
		this.name = name;
		this.pass = pass;
		this.ng = ng;
		this.current = current;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public long getPass() {
		return pass;
	}

	public void setPass(long pass) {
		this.pass = pass;
	}

	public long getNg() {
		return ng;
	}

	public void setNg(long ng) {
		this.ng = ng;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}
	
}
