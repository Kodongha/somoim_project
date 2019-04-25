package com.kh.somoim.login.controller;

import com.kh.somoim.login.model.dao.LoginDAO;
import com.kh.somoim.login.model.vo.MemberVO;

public class LoginController {
 
	LoginDAO loginDAO = new LoginDAO();

	public MemberVO checkAccount(String id, String password) {
		System.out.println("LoginController.checkAccount in!");
		
		MemberVO requestMemberVO = new MemberVO();
		requestMemberVO.setId(id);
		requestMemberVO.setPassword(password);
		
		MemberVO responseMemberVO = loginDAO.checkAccount(requestMemberVO);
		
		return responseMemberVO;
	}
	
}
