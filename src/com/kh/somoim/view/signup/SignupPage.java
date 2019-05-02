package com.kh.somoim.view.signup;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.login.LoginPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class SignupPage extends JPanel{
	
	private JPanel thisPanel;
	//private JPanel SignupPageTopPanel;
	//private MainFrame mainFrame;
	
	public SignupPage(MainFrame mainFrame) {
		this.thisPanel = this;
		//this.SignupPageTopPanel = signupPageTopPanel;
		//this.mainFrame = mainFrame;
		
		//컬러 화이트로 변경 
		this.setBackground(Color.WHITE);

		//레이아웃 사이즈 null로 변경
		this.setLayout(null);

		//삽입이미지 생성  및 사이즈 조절 
		Image icon = new ImageIcon("images/singup.PNG").getImage().getScaledInstance(310, 300, 0);//이미지 크기

		//이미지를 넣을 라벨  생성 
		JLabel signuppagelabel = new JLabel(new ImageIcon(icon));

		//이미지라벨사이즈조정 
		signuppagelabel .setLocation(60, 50); // 이미지의 위치 
		signuppagelabel .setSize(400,400);   //크기지정 

		//소확행문구 라벨생성
		JLabel so= new JLabel("소확행 가입하기");		  
		//소확행문구 라벨 사이즈 조정
		so.setLocation(140, 270); // 위치지정
		so.setSize(300,300); //크기지정
		//폰트 설정 (윈도우즈 기본 폰트만 되는건가?)
		so.setFont(new Font("나눔고딕",Font.BOLD, 30)); //폰트변경 및 굵게,사이즈조정 

		//하단문구 라벨 생성
		JLabel so2 = new JLabel("간단한 단계를 통해 새 계정을 만들 수 있습니다 ");	
		//하단문구 라벨 사이즈 조정 
		so2.setLocation(100, 400); // 위치지정 
		so2.setSize(350,150); //크기지정
		//폰트 설정 
		so2.setFont(new Font("나눔고딕",Font.BOLD, 15)); //폰트변경 및 굵게,사이즈조정 
		so2.setForeground(Color.GRAY); //글꼴 컬러조정
		
		//다음 버튼 만들기	
		JButton nextbutton = new JButton("다음");
		//다음버튼 사이즈 조정 
		nextbutton.setLocation(190,500); //위치지정 
		nextbutton.setSize(100,50); //크기지정
		//버튼 컬러 변경
		nextbutton.setBackground(Color.ORANGE);
		//버튼 외곽선 없애기
		nextbutton.setBorderPainted(false);
		
		JLabel createLabel = new JLabel(" < 계정 만들기");
		createLabel.setForeground(Color.WHITE); //라벨 글씨색변경
		createLabel.setFont(createLabel  //라벨 글씨 크기 조절
											.getFont().deriveFont(15.0f));
		createLabel.setLocation(10, 6);
		
		createLabel.setSize(100, 20);
		this.add(createLabel);

		//라벨을 팬넬에 넣음 
		this.add(signuppagelabel); //이미지
		this.add(so); //소확행문구
		this.add(so2);//소확행 하단 문구
		this.add(nextbutton);//다음버튼
		
		//signupPageTopPanel.add(this);

		
		SignupPageTopPanel signupPageTopPanel = new SignupPageTopPanel(mainFrame);
		signupPageTopPanel.setBounds(0, 0, 500, 35);
		this.add(signupPageTopPanel);
		
		


		nextbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new TermsOfServicePanel(mainFrame));
			}
		});
		
		createLabel.addMouseListener(new MouseAdapter() {	
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			
			ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new LoginPanel(mainFrame));
			
		}
	});


	}
	/*class MyMounseAdapter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new TermsOfServicePanel(mainFrame));
		}
		
	}
*/	
	
}
