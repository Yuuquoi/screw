package com.example.screw.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.screw.entity.Account;

@Transactional
@Repository
public interface AccountDao extends JpaRepository<Account, String> {

	@Modifying
	@Query(value = "INSERT IGNORE INTO screw.account (account, pwd) VALUES (?1, ?2)", nativeQuery = true)
	public int insertAccount(String account, String pwd);
	
}
