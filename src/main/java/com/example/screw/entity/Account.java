package com.example.screw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "account")
public class Account {

	@NotBlank(message = "帳號不能為空")
	@Length(min = 5, max = 20, message = "帳號長度需介於 {min} ~ {max} 之間")
	@Id
	@Column(name = "account")
	private String account;

	@NotBlank(message = "密碼不能為空")
	@Length(min = 5, max = 20, message = "密碼長度需介於 {min} ~ {max} 之間")
	@Column(name = "pwd")
	private String pwd;

	public Account() {
		super();
	}

	public Account(String account, String pwd) {
		super();
		this.account = account;
		this.pwd = pwd;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
