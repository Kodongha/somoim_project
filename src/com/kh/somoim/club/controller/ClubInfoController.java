package com.kh.somoim.club.controller;

import java.util.ArrayList;

import com.kh.somoim.club.dao.ClubInfoDAO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;

public class ClubInfoController {

	ClubInfoDAO clubInfoDAO = new ClubInfoDAO();
	
	public ArrayList<MemberVO> getClubMemberList(ClubVO clubVO) {
		System.out.println("ClubInfoController.getClubMemberList in");
		
		ArrayList<MemberVO> clubMemberList = clubInfoDAO.getClubMemberList(clubVO);
	
		return clubMemberList;
	}
	
}
