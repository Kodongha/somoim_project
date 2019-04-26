package com.kh.somoim.home.controller;

import java.util.ArrayList;

import com.kh.somoim.home.model.dao.HomeDAO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;

public class HomeController {


	HomeDAO homeDAO = new HomeDAO(); 
	
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<ClubVO> getMyClubList(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("HomeController.getMyClubList in!");
		
		ArrayList<ClubVO> myClubList = homeDAO.getMyClubList(memberVO);
		return myClubList;
	}
}
