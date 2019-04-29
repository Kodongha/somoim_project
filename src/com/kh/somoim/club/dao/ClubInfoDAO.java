package com.kh.somoim.club.dao;

import java.util.ArrayList;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;

public class ClubInfoDAO {

	public ArrayList<MemberVO> getClubMemberList(ClubVO clubVO) {
		// TODO Auto-generated method stub
		System.out.println("ClubInfoDAO.getClubMemberList in");
		
		ArrayList<MemberVO> clubMemberList = (ArrayList<MemberVO>) new ClientConnector().sendServer("ClubInfoDAO.getClubMemberList", clubVO);
		
		return clubMemberList; 
	}

}
