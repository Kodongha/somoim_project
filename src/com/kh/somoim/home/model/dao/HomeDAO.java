package com.kh.somoim.home.model.dao;

import java.util.ArrayList;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;

public class HomeDAO {

	public ArrayList<ClubVO> getMyClubList(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("HomeDAO.getMyClubList in!");
		
		ArrayList<ClubVO> myClubList = (ArrayList<ClubVO>) new ClientConnector().sendServer("HomeDAO.getMyClubList", memberVO);
		System.out.println(myClubList);
		
		return myClubList;
	}

}
