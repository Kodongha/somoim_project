package com.kh.somoim.club.controller;

import java.util.ArrayList;

import com.kh.somoim.club.model.dao.ClubDAO;
import com.kh.somoim.club.model.vo.BoardResponseVO;
import com.kh.somoim.club.model.vo.BoardVO;
import com.kh.somoim.club.model.vo.MemberInClubVO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;

public class ClubController {

	ClubDAO clubInfoDAO = new ClubDAO();
	
	public ArrayList<MemberVO> getClubMemberList(ClubVO clubVO) {
		System.out.println("getClubMemberList.getClubMemberList in");
		
		ArrayList<MemberVO> clubMemberList = clubInfoDAO.getClubMemberList(clubVO);
	
		return clubMemberList;
	}
	
	/**
	 * 소모임 생성
	 * @param clubDAO
	 */
	public void createClub(ClubVO ClubVO) {
		
		
		
	}
	
	/**
	 * 글 쓰기
	 * @param boardVO
	 */
	public void insertBoard(BoardVO boardVO) {
		System.out.println("getClubMemberList.insertBoard in");
		
		clubInfoDAO.insertBoard(boardVO);
	}

	/**
	 * 가입 인사 리스트 출력
	 * @param clubVO
	 * @param memberVO
	 * @param category 
	 * @return
	 */
	public ArrayList<BoardResponseVO> getFirstGreeting(ClubVO clubVO, MemberVO memberVO, String category) {
		// TODO Auto-generated method stub
		System.out.println("getClubMemberList.insertBoard in");
		MemberInClubVO memberInClubVO = new MemberInClubVO();
		memberInClubVO.setClubVO(clubVO);
		memberInClubVO.setMemberVO(memberVO);

		memberInClubVO.setSelectedCategory(category);
		
		ArrayList<BoardResponseVO> boardResponseVOList = null;
		boardResponseVOList = clubInfoDAO.getFirstGreeting(memberInClubVO);
		
		return boardResponseVOList;
	}
	
}