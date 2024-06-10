package com.example.screw.service.ifs;

import com.example.screw.vo.BaseRes;

public interface MemberService {
	
	// µù¥U
	public BaseRes signUp(String account, String pwd);

	// µn¤J
	public BaseRes login(String account, String pwd);

	
}
