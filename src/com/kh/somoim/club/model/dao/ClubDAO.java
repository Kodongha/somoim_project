package com.kh.somoim.club.model.dao;

import java.util.ArrayList;

import com.kh.somoim.club.model.vo.BoardResponseVO;
import com.kh.somoim.club.model.vo.BoardVO;
import com.kh.somoim.club.model.vo.MemberInClubVO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.network.ClientConnector;

public class ClubDAO {

	public ArrayList<MemberVO> getClubMemberList(ClubVO clubVO) {
		// TODO Auto-generated method stub
		System.out.println("ClubDAO.getClubMemberList in");
		
		ArrayList<MemberVO> clubMemberList = (ArrayList<MemberVO>) new ClientConnector().sendServer("ClubDAO.getClubMemberList", clubVO);
		
		return clubMemberList; 
	}

	/**
	 * �� ����
	 * @param boardVO
	 */
	public void insertBoard(BoardVO boardVO) {
		// TODO Auto-generated method stub
		System.out.println("ClubDAO.insertBoard in");
		
		new ClientConnector().sendServer("ClubDAO.insertBoard", boardVO);
	}

	/**
	 * ���� �λ� ����Ʈ ���
	 * @param clubVO
	 * @param memberVO
	 * @return
	 */
	public ArrayList<BoardResponseVO> getFirstGreeting(MemberInClubVO memberInClubVO) {
		// TODO Auto-generated method stub
		System.out.println("ClubDAO.getFirstGreeting in");
		
		ArrayList<BoardResponseVO> boardResponseVOList = (ArrayList<BoardResponseVO>) new ClientConnector().sendServer("ClubDAO.getFirstGreeting", memberInClubVO);
		return boardResponseVOList;
	}

	/**
	 * �Ҹ��� �����
	 * @param clubVO
	 */
	public void createClub(ClubVO clubVO) {
		// TODO Auto-generated method stub
		System.out.println("ClubDAO.createClub in");

		new ClientConnector().sendServer("ClubDAO.createClub", clubVO);
	}

	public int getMaxNumber(ClubVO clubVO) {
		// TODO Auto-generated method stub
		
		int maxNumber = (Integer)new ClientConnector().sendServer("ClubDAO.getMaxNumber", clubVO);
		
		return maxNumber;
	}

}
