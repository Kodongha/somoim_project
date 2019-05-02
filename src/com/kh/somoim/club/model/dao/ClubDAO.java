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
	 * 글 쓰기
	 * @param boardVO
	 */
	public void insertBoard(BoardVO boardVO) {
		// TODO Auto-generated method stub
		System.out.println("ClubDAO.insertBoard in");
		
		new ClientConnector().sendServer("ClubDAO.insertBoard", boardVO);
	}

	/**
	 * 가입 인사 리스트 출력
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
	 * 소모임 만들기
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
