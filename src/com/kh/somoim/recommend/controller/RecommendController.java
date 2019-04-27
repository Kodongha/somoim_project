package com.kh.somoim.recommend.controller;

import java.util.ArrayList;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.recommend.model.dao.RecommendDAO;

public class RecommendController {

	RecommendDAO recommendDAO = new RecommendDAO();
	
	public RecommendController() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<ClubVO> getRecommendClubList(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("RecommendController.getRecommendClubList in!");
		
		ArrayList<ClubVO> recommendClubList = recommendDAO.getRecommendClubList(memberVO);
		
		return recommendClubList;
	}
 
}
