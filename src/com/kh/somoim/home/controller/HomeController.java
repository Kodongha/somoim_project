package com.kh.somoim.home.controller;

import com.kh.somoim.home.model.dao.HomeDAO;
import com.kh.somoim.login.model.vo.MemberVO;

public class HomeController {


	HomeDAO homeDAO = new HomeDAO(); 
	
	public HomeController() {
		// TODO Auto-generated constructor stub
	}
	
	public void getMyClubList(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("HomeController.getMyClubList in!");
		
		homeDAO.getMyClubList(memberVO);
	}
}
