package com.kh.somoim.recommend.model.dao;

import java.util.ArrayList;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;

public class RecommendDAO {

	public ArrayList<ClubVO> getRecommendClubList(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("RecommendDAO.getRecommendClubList in!");

		ArrayList<ClubVO> recommendClubList = (ArrayList<ClubVO>) new ClientConnector().sendServer("RecommendDAO.getRecommendClubList", memberVO);
		System.out.println("client recommendClubList :::"+recommendClubList);

		return recommendClubList;
	}
}
