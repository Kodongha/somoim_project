package com.kh.somoim.club.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import javax.imageio.ImageIO;

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
	public void createClub(ClubVO clubVO) {
		System.out.println("getClubMemberList.createClub in");
		
		File file = new File(clubVO.getTitleImagePath());
		BufferedImage bufferedImage = null;

		int maxNumber = clubInfoDAO.getMaxNumber(clubVO);
		maxNumber += 1;
		clubVO.setClubNumber(maxNumber);
		
		if(!file.exists()) {
			System.out.println("File not Exist.");
		} else {
			System.out.println("File Exist.");
			try {
				bufferedImage = ImageIO.read(file);
				System.out.println(file.getName());
				
				String extension = file.getName().split("[.]")[1];
				
				ImageIO.write(bufferedImage, extension, new File(System.getProperty("user.dir") + "\\images\\club\\" + clubVO.getClubNumber() + "." + extension));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		clubInfoDAO.createClub(clubVO);
	}
	
	/**
	 * 소모임 이름 중복 체크
	 * @param text
	 */
	public void checkClubName(String clubName) {
		// TODO Auto-generated method stub
		System.out.println("getClubMemberList.checkClubName in");
		
		clubInfoDAO.checkClubName(clubName);
		
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
		
		boardResponseVOList.sort(new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				BoardResponseVO bob = (BoardResponseVO) o1;
				BoardResponseVO bob2 = (BoardResponseVO) o2;
				
				int result = 0;
				
				if(bob.getWritingNumber() == bob.getWritingNumber()) {
					result = 0;
				}
				if(bob.getWritingNumber() > bob2.getWritingNumber()) {
					result = -1;
				}
				if(bob.getWritingNumber() < bob2.getWritingNumber()){
					result = 1;
				}
				return result;
			}
			
		});
		
		return boardResponseVOList;
	}

	/**
	 * 소모임 탈퇴 
	 * @param memberInClubVO
	 */
	public void leaveClub(MemberInClubVO memberInClubVO) {
		// TODO Auto-generated method stub
		System.out.println("getClubMemberList.leaveClub in");
		
		clubInfoDAO.leaveClub(memberInClubVO);
	}

	public void signupClub(MemberInClubVO memberInClubVO) {
		// TODO Auto-generated method stub
		
		clubInfoDAO.signupClub(memberInClubVO);
	}

}
