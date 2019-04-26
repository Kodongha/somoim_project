package com.kh.somoim.setting.controller;

import java.util.Enumeration;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.setting.model.dao.SettingDAO;

public class SettingController {

	SettingDAO settingDAO = new 	SettingDAO(); 


	public void setInformation (MemberVO memberVO,String text,String text2,int year, int month,
			int day,String text4,String text5,String locallist,String gender) {

		memberVO.setEmail(text);
		if(text2 != null) {
			memberVO.setPassword(text2);
		}
		memberVO.setName(text4);
		memberVO.setPhoneNumber(text5);
		String year1 = String.valueOf(year);
		String month1 = String.valueOf(month);
		String day1 = String.valueOf(day);

		String birth= year1+month1+day1;
		

		memberVO.setBirth(birth);
		memberVO.setAddress(locallist);
		memberVO.setGender(gender);
		
		
		

		settingDAO.setInformation(memberVO);
	}

	



}
