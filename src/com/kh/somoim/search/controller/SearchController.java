package com.kh.somoim.search.controller;

import java.util.ArrayList;

import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.search.model.dao.SearchDAO;

public class SearchController {

	SearchDAO searchDAO = new SearchDAO();
	
	public ArrayList<ClubVO> getFavoriteSearchClubList(String favorite) {
		System.out.println("SearchController.getFavoriteSearchClubList in!");
		ArrayList<ClubVO> favoriteSearchClubList = searchDAO.getFavoriteSearchClubList(favorite);
		
		
		return favoriteSearchClubList;
	}
	
	public ArrayList<ClubVO> getStringSearchClubList(String searchString) {
		System.out.println("SearchController.getFavoriteSearchClubList in!");
		ArrayList<ClubVO> StringSearchClubList = searchDAO.getStringSearchClubList(searchString);
		
		return StringSearchClubList;
	}
	
	
}
