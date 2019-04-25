package com.kh.somoim.login.controller;

import com.kh.somoim.login.model.dao.LoginDAO;
import com.kh.somoim.login.model.vo.MemberVO;

public class LoginController {
 
	LoginDAO loginDAO = new LoginDAO();

	public MemberVO checkAccount(String id, String password) {
		System.out.println("LoginController.checkAccount in!");
		
		MemberVO memberVO = new MemberVO();
		memberVO.setId(id);
		memberVO.setPassword(password);
		
		MemberVO responseMemberVO = loginDAO.checkAccount(memberVO);
		
		return responseMemberVO;
	}
	
}
