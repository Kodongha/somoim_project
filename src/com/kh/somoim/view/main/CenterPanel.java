package com.kh.somoim.view.main;

import java.awt.CardLayout;

import javax.swing.JPanel;

import com.kh.somoim.view.home.HomePanel;
import com.kh.somoim.view.recommend.RecommendPanel;
import com.kh.somoim.view.search.SearchPanel;
import com.kh.somoim.view.setting.SettingPanel;

public class CenterPanel extends JPanel{

	private CardLayout cardLayout;
	private HomePanel homePanel;
	private RecommendPanel recommendPanel;
	private SearchPanel searchPanel;
	private SettingPanel settingPanel;
	
	public CenterPanel() {
		// TODO Auto-generated constructor stub
		cardLayout = new CardLayout();
		this.setLayout(cardLayout);

		homePanel = new HomePanel();
		recommendPanel = new RecommendPanel();
		searchPanel = new SearchPanel();
		settingPanel = new SettingPanel();
		
		this.add(homePanel, "home");
		this.add(recommendPanel, "recommend");
		this.add(searchPanel, "search");
		this.add(settingPanel, "setting");
		
	}

	/**
	 * @return the cardLayout
	 */
	public CardLayout getCardLayout() {
		return cardLayout;
	}

	/**
	 * @param cardLayout the cardLayout to set
	 */
	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}

	/**
	 * @return the homePanel
	 */
	public HomePanel getHomePanel() {
		return homePanel;
	}

	/**
	 * @param homePanel the homePanel to set
	 */
	public void setHomePanel(HomePanel homePanel) {
		this.homePanel = homePanel;
	}

	/**
	 * @return the recommendPanel
	 */
	public RecommendPanel getRecommendPanel() {
		return recommendPanel;
	}

	/**
	 * @param recommendPanel the recommendPanel to set
	 */
	public void setRecommendPanel(RecommendPanel recommendPanel) {
		this.recommendPanel = recommendPanel;
	}

	/**
	 * @return the searchPanel
	 */
	public SearchPanel getSearchPanel() {
		return searchPanel;
	}

	/**
	 * @param searchPanel the searchPanel to set
	 */
	public void setSearchPanel(SearchPanel searchPanel) {
		this.searchPanel = searchPanel;
	}

	/**
	 * @return the settingPanel
	 */
	public SettingPanel getSettingPanel() {
		return settingPanel;
	}

	/**
	 * @param settingPanel the settingPanel to set
	 */
	public void setSettingPanel(SettingPanel settingPanel) {
		this.settingPanel = settingPanel;
	}
}
