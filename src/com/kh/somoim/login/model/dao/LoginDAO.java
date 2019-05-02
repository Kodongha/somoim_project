package com.kh.somoim.login.model.dao;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;

public class LoginDAO {

	public MemberVO checkAccount(MemberVO memberVO) {
		System.out.println("LoginDAO.checkAccount in!");
		MemberVO responseMemberVO = (MemberVO)new ClientConnector().sendServer("LoginDAO.checkAccount", memberVO);
		
		return responseMemberVO; 
	}

	public String getMyId(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("LoginDAO.getMyId in!");
		String myId = (String)new ClientConnector().sendServer("LoginDAO.getMyId", memberVO);
		
		return myId;
	}

	public boolean getMyidForPassword(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("LoginDAO.getMyidForPassword in!");
		boolean result = (boolean)new ClientConnector().sendServer("LoginDAO.getMyidForPassword", memberVO);
		
		return result;
	}

	public void updatePassword(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("LoginDAO.getMyidForPassword in!");
		new ClientConnector().sendServer("LoginDAO.updatePassword", memberVO);
	}
	
}
