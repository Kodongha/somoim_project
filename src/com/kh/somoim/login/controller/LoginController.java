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

	/**
	 * id Ã£±â
	 * @param name
	 * @param phoneNumber
	 * @return
	 */
	public String getMyId(String name, String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("LoginController.getMyId in!");
		
		MemberVO memberVO = new MemberVO();
		memberVO.setName(name);
		memberVO.setPhoneNumber(phoneNumber);
		
		String myId = loginDAO.getMyId(memberVO);
		
		return myId;
	}

	public boolean getMyidForPassword(String id) {
		// TODO Auto-generated method stub
		System.out.println("LoginController.getMyidForPassword in!");
		MemberVO memberVO = new MemberVO();
		memberVO.setId(id);
		
		boolean result = loginDAO.getMyidForPassword(memberVO);
		
		return result;
	}

	public void updatePassword(String id, String firstPassword) {
		// TODO Auto-generated method stub
		System.out.println("LoginController.updatePassword in!");
		MemberVO memberVO = new MemberVO();
		memberVO.setId(id);
		memberVO.setPassword(firstPassword);
		loginDAO.updatePassword(memberVO);
		
	}

}
