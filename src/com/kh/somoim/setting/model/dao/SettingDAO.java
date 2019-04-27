package com.kh.somoim.setting.model.dao;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;


public class SettingDAO {

	/**
	 * �α��� ���� ���� ����
	 * @param memberVO
	 */
	public void setInformation(MemberVO memberVO) {
		System.out.println("SettingDAO.setInformation in");
		new ClientConnector().sendServer("SettingDAO.setInformation", memberVO);

	}

	/**
	 * �α��� ���� ���� ����
	 * @param memberVO
	 */
	public void removeMember(MemberVO memberVO) {
		System.out.println("SettingDAO.removeMember in");
		new ClientConnector().sendServer("SettingDAO.removeMember", memberVO);
	}
}
