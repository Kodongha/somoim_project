package com.kh.somoim.setting.model.dao;

import com.kh.somoim.view.setting.InfomationCorrect;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;


public class SettingDAO {

	
	
	public void setInformation(MemberVO memberVO) {
		

	new ClientConnector().sendServer("SettingDAO.setInformation", memberVO);
		
		
		
	}

	
	
	
	
	
}
