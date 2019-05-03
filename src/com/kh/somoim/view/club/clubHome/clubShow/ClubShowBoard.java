package com.kh.somoim.view.club.clubHome.clubShow;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.kh.somoim.club.controller.ClubController;
import com.kh.somoim.club.model.vo.BoardResponseVO;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.view.club.clubMain.ClubMainPanel;

public class ClubShowBoard extends JPanel{
	
	private final String CATEGORY = "자유게시판";
	
	JLabel showProfileLabel;
	JLabel showWriterLabel;
	JLabel showTimeLabel;
	JLabel showTitleLabel;
	JLabel showPhotoLabel;
	JLabel showContentLabel;
	
	String photoPath = "";
	
	public ClubShowBoard(ClubMainPanel clubmainPanel, ClubVO clubVO, MemberVO memberVO) {
		
		ClubController showBoardCtrl = new ClubController();
		ArrayList<BoardResponseVO> boardResponseVOList = showBoardCtrl.getFirstGreeting(clubVO, memberVO, CATEGORY);
		
		ClubController showBoardCtrl2 = new ClubController();
		ArrayList<MemberVO> clubMemberList = showBoardCtrl2.getClubMemberList(clubVO);
		
		this.setLayout(null);
		this.setBackground(Color.white);
		this.setSize(500, 600);
		
		
		for(int i = 0; i < boardResponseVOList.size(); i++) {
			for(MemberVO vo : clubMemberList) {
				if(vo.getName().equals(boardResponseVOList.get(i).getWriter())) {
					photoPath = vo.getProfilePhotoPath();
				}
			}
			
			Image showProfile = new ImageIcon(photoPath).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			showProfileLabel = new JLabel(new ImageIcon(showProfile));
			showProfileLabel.setBounds(10, 5, 50, 50);
			
			LineBorder showProfileBorder = new LineBorder(Color.black);
			showProfileLabel.setBorder(showProfileBorder);	
			
			showWriterLabel = new JLabel();
			showWriterLabel.setText(boardResponseVOList.get(i).getWriter());
			showWriterLabel.setBounds(70, 15, 50, 20);
			showWriterLabel.setFont(showWriterLabel.getFont().deriveFont(14.0f));
			
			showTimeLabel = new JLabel();
			
			SimpleDateFormat tFormat = new SimpleDateFormat("hh:mm:ss");
			String date = tFormat.format(boardResponseVOList.get(i).getWriteDay());	
			
			showTimeLabel.setText(date);
			showTimeLabel.setBounds(70, 35, 100, 20);
			showTimeLabel.setForeground(Color.LIGHT_GRAY);
			
			showTitleLabel = new JLabel();
			showTitleLabel.setText(boardResponseVOList.get(i).getTitle());
			showTitleLabel.setBounds(10, 70, 300, 18);
			showTitleLabel.setFont(showTitleLabel.getFont().deriveFont(18.0f));
			
			showContentLabel = new JLabel();
			showContentLabel.setText(boardResponseVOList.get(i).getContent());
			showContentLabel.setBounds(0, 330, 500, 320);
			showContentLabel.setFont(showContentLabel.getFont().deriveFont(14.0f));
			
			Image showPhoto = new ImageIcon(boardResponseVOList.get(i).getImagePath()).getImage().getScaledInstance(115, 80, Image.SCALE_SMOOTH);
			showPhotoLabel = new JLabel(new ImageIcon(showPhoto));
			showPhotoLabel.setBounds(0, 30, 500, 200);
						
			this.add(showProfileLabel);
			this.add(showWriterLabel);
			this.add(showTimeLabel);
			this.add(showTitleLabel);
			this.add(showContentLabel);
			this.add(showPhotoLabel);
		}
		
	}
}
