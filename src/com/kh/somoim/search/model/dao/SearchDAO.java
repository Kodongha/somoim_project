package com.kh.somoim.search.model.dao;

import java.util.ArrayList;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.util.network.ClientConnector;

public class SearchDAO {

	public ArrayList<ClubVO> getFavoriteSearchClubList(String favorite) {
		// TODO Auto-generated method stub
		System.out.println("SearchDAO.getSearchClubList in!");
		ArrayList<ClubVO> favoriteSearchClubList = (ArrayList<ClubVO>) new ClientConnector().sendServer("SearchDAO.getFavoriteSearchClubList", favorite);
		
		return favoriteSearchClubList;
	}

	public ArrayList<ClubVO> getStringSearchClubList(String searchString) {
		// TODO Auto-generated method stub
		System.out.println("SearchDAO.getSearchClubList in!");
		ArrayList<ClubVO> StringSearchClubList = (ArrayList<ClubVO>) new ClientConnector().sendServer("SearchDAO.getStringSearchClubList", searchString);
		
		return StringSearchClubList;
		
	}

}
