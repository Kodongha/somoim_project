package com.kh.somoim.setting.controller;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.setting.model.dao.SettingDAO;

public class SettingController {

	SettingDAO settingDAO = new SettingDAO(); 

	/**
	 * 로그인 유저 정보 수정
	 * @param memberVO
	 * @param text
	 * @param text2
	 * @param year
	 * @param month
	 * @param day
	 * @param text4
	 * @param text5
	 * @param locallist
	 * @param gender
	 */
	public void setInformation (MemberVO memberVO,String text,String text2,int year, int month, int day,String text4,String text5,String locallist,String gender) {
		System.out.println("SettingController.setInformation in"); 

		memberVO.setEmail(text);
		if(text2 != null) {
			memberVO.setPassword(text2);
		}
		memberVO.setName(text4);
		memberVO.setPhoneNumber(text5);

		String year1 = String.valueOf(year);
		String month1 = "";
		String day1 = "";
		/* month, day가 한 자리수 일 경우, 앞에 0 추가 입력 */
		if(month / 10 == 0) {
			month1 = "0" + month;
		} else {
			month1 = String.valueOf(month);
		}
		if(day / 10 == 0) {
			day1 = "0" + day;
		} else {
			day1 = String.valueOf(day);
		}
		String birth= year1+month1+day1;

		memberVO.setBirth(birth);
		memberVO.setAddress(locallist);
		memberVO.setGender(gender);

		settingDAO.setInformation(memberVO);
	}


	/**
	 * 로그인 유저 계정 삭제
	 * @param memberVO
	 */
	public void removeMember(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("SettingController.setInformation in"); 
		
		settingDAO.removeMember(memberVO);


	}

}
