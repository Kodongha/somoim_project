package com.kh.somoim.home.model.dao;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;

public class HomeDAO {

	public void getMyClubList(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("HomeDAO.getMyClubList in!");
		
		new ClientConnector().sendServer("HomeDAO.getMyClubList", memberVO);
	}

}
