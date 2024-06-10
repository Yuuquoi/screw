package com.example.screw.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.screw.constants.RtnCode;
import com.example.screw.entity.Account;
import com.example.screw.repository.AccountDao;
import com.example.screw.service.ifs.MemberService;
import com.example.screw.vo.BaseRes;

@Transactional
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private AccountDao accountDao;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	@Override
	public BaseRes signUp(String account, String pwd) {
		if(accountDao.insertAccount(account, encoder.encode(pwd)) == 0) {
			return new BaseRes(RtnCode.ACCOUNT_EXISTS.getCode(), RtnCode.ACCOUNT_EXISTS.getMessage());
		}
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}
	
	// 登入
	@Override
	public BaseRes login(String account, String pwd) {
		// 確認帳號是否存在
		Optional<Account> op = accountDao.findById(account);
		if(op.isEmpty()) {
			return new BaseRes(RtnCode.ACCOUNT_NOT_EXISTS.getCode(), RtnCode.ACCOUNT_NOT_EXISTS.getMessage());
		}
		// 如果密碼不正確，回傳錯誤
		if(!encoder.matches(pwd, op.get().getPwd())) {
			return new BaseRes(RtnCode.PASSWORD_ERROR.getCode(), RtnCode.PASSWORD_ERROR.getMessage());
		}
		// 帳號和密碼均正確
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}
	
	// 登出
	
		
}
