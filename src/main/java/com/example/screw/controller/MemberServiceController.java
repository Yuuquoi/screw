package com.example.screw.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.screw.constants.RtnCode;
import com.example.screw.entity.Account;
import com.example.screw.service.ifs.MachineService;
import com.example.screw.service.ifs.MemberService;
import com.example.screw.service.ifs.OrderService;
import com.example.screw.vo.BaseRes;

@CrossOrigin
@RestController
public class MemberServiceController {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private MachineService machineService;
	
	// 註冊
	@PostMapping(value = "member/sign_up")
	public BaseRes signUp(@Valid @RequestBody Account account) {
		return memberService.signUp(account.getAccount(), account.getPwd());
	}

	// 登入
	@PostMapping(value = "member/login")
	public BaseRes login(@Valid @RequestBody Account account, HttpSession httpSession) {
		BaseRes res = memberService.login(account.getAccount(), account.getPwd());
		if(res.getCode() != 200) {
			return res;
		}
		httpSession.setAttribute("account", account.getPwd());
		return res;
	}
	
	// 登出
	@GetMapping(value = "member/logout")
	public BaseRes logout(HttpSession httpSession) {
		httpSession.removeAttribute("account");
		return new BaseRes(RtnCode.SUCCESS.getCode(), RtnCode.SUCCESS.getMessage());
	}

	/**** 以下為單號功能 ****/
	

	/**** 以下為設備功能 ****/

}
