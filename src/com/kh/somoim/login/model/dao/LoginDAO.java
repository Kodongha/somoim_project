package com.kh.somoim.login.model.dao;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;

public class LoginDAO {

	public MemberVO checkAccount(MemberVO memberVO) {
		System.out.println("LoginDAO.checkAccount in!");
		MemberVO responseMemberVO; 
		responseMemberVO = (MemberVO)new ClientConnector().sendServer("LoginDAO.checkAccount", memberVO);
		
		return responseMemberVO; 
	}
	
}
