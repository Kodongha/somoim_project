package com.kh.somoim.view.home;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.kh.somoim.club.controller.ClubController;
import com.kh.somoim.home.model.vo.ClubVO;
import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class CreateClubPanel extends JPanel{

	private JPanel thisPanel;
	
	public CreateClubPanel(MainFrame mainFrame, MainPanel mainPanel, MemberVO memberVO) {
		// TODO Auto-generated constructor stub
		ClubController clubController = new ClubController();
		
		mainPanel.getBottomPanel().setVisible(false);
		
		this.thisPanel = this;
		
		this.setLayout(null);
		this.setBackground(Color.white);
		System.out.println("mainPanel in");
		
		
		/*모임을 만들어보세요*/
		JLabel moimNotice = new JLabel("모임을 만들어 보세요!");
		moimNotice.setLocation(80, 10); // 라벨 위치조정
		moimNotice.setSize(500, 100);
		moimNotice.setFont(new Font("나눔고딕",Font.BOLD, 33)); //폰트변경 및 굵게,사이즈조정 
		this.add(moimNotice);
		
		/* 카테고리 */
		String [] category = {"게임/오락", "결혼/육아" ,"공예/만들기","댄스/무용","반려동물","봉사활동","사교/인맥","아웃도어/여행","요리","운동/스포츠","음악/악기","차/오토바이"};
		JComboBox categoryList = new JComboBox<>(category);
		categoryList.setLocation(75, 100); // 라벨 위치조정
		categoryList.setSize(330, 50);
		categoryList.setBackground(Color.WHITE);
		categoryList.setForeground(Color.GRAY);
		this.add(categoryList);
		
		/* 소모임 이름 */
		JLabel clubNameLabel = new JLabel("  모임 이름을 작성하세요!");
		clubNameLabel.setBorder(new LineBorder(Color.GRAY,2));
		clubNameLabel.setLocation(75, 180); // 라벨 위치조정
		clubNameLabel.setSize(330, 50);
		clubNameLabel.setHorizontalAlignment(clubNameLabel.LEFT);
		clubNameLabel.setFont(new Font("", Font.PLAIN, 15));
		clubNameLabel.setForeground(Color.GRAY);

		JTextField clubNameTextField = new JTextField(15); 
		clubNameTextField.setLocation(10, 10);
		clubNameTextField.setSize(310, 30);
		clubNameTextField.setOpaque(false);
		clubNameTextField.setBorder(null);
		clubNameLabel.add(clubNameTextField); //텍스트 필드

		/* 타이틀 사진 */
		JLabel titlePhotoLabel = new JLabel("  소모임 타이틀 사진을 선택하세요!");
		titlePhotoLabel.setBorder(new LineBorder(Color.GRAY,2));
		titlePhotoLabel.setLocation(75, 280); // 라벨 위치조정
		titlePhotoLabel.setSize(330, 50);
		titlePhotoLabel.setHorizontalAlignment(titlePhotoLabel.LEFT);
		titlePhotoLabel.setFont(new Font("", Font.PLAIN, 15));
		titlePhotoLabel.setForeground(Color.GRAY);

		Image insertPhotoImage = new ImageIcon("images/insertPhoto.png").getImage().getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		JLabel insertPhotoLabel = new JLabel(new ImageIcon(insertPhotoImage));
		insertPhotoLabel.setSize(40, 30);
		insertPhotoLabel.setLocation(280,10);

		JTextField titlePhotoTextField = new JTextField(15); 
		titlePhotoTextField.setLocation(10, 10);
		titlePhotoTextField.setSize(250, 30);
		titlePhotoTextField.setOpaque(false);
		titlePhotoTextField.setEditable(false);
		titlePhotoTextField.setBorder(null);
		titlePhotoLabel.add(titlePhotoTextField); //텍스트 필드
		titlePhotoLabel.add(insertPhotoLabel);

		/* 소개 글 */
		JLabel clubIntroduceLabel = new JLabel("  모임 소개 글을 작성하세요!");
		clubIntroduceLabel.setBorder(new LineBorder(Color.GRAY,2));
		clubIntroduceLabel.setLocation(75, 380); // 라벨 위치조정
		clubIntroduceLabel.setSize(330, 200);
		clubIntroduceLabel.setHorizontalAlignment(clubNameLabel.LEFT);
		clubIntroduceLabel.setFont(new Font("", Font.PLAIN, 15));
		clubIntroduceLabel.setForeground(Color.GRAY);

		JTextArea clubIntroduceTextArea = new JTextArea(" 모임 소개 글을 작성하세요!"); 
		clubIntroduceTextArea.setLocation(10, 10);
		clubIntroduceTextArea.setSize(310, 30);
		clubIntroduceTextArea.setFont(new Font("", Font.PLAIN, 15));
		clubIntroduceTextArea.setForeground(Color.GRAY);
		
		JScrollPane scrollPane = new JScrollPane(clubIntroduceTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setLocation(10, 10);
		scrollPane.setSize(310, 180);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.setBackground(Color.WHITE);
		clubIntroduceLabel.add(scrollPane); //텍스트 필드
		
		/* 소모임 만들기 버튼 */
		JButton createButton = new JButton("소모임 만들기");
		createButton.setLocation(75, 590); // 라벨 위치조정
		createButton.setSize(330, 50);
		createButton.setBackground(Color.orange);
		
		JFrame window = new JFrame();
		JFileChooser fileChooser = new JFileChooser();
		//기본 Path의 경로 설정 (바탕화면)
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
		
		this.add(titlePhotoLabel);
		this.add(clubNameLabel);
		this.add(clubIntroduceLabel);
		this.add(createButton);
		
		clubNameTextField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(clubNameTextField.getText().length() > 0) {
					clubNameLabel.setText("");
				} else {
					clubNameLabel.setText("  모임 이름을 작성하세요!");
				}
			}
			
		});
		
		insertPhotoLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				int result = fileChooser.showOpenDialog(window); 
				System.out.println(result); 
				if (result == JFileChooser.APPROVE_OPTION) { 
					//선택한 파일의 경로 반환 
					File selectedFile = fileChooser.getSelectedFile();
					String selectedFilePath = selectedFile.getPath();
					String[] extension = selectedFilePath.split("[.]");
					//선택한 파일의 경로 
					if(extension[1].toLowerCase().equals("png") 
							|| extension[1].toLowerCase().equals("gif")
							|| extension[1].toLowerCase().equals("jpg")) {
						titlePhotoLabel.setText("");
						titlePhotoTextField.setText(selectedFilePath);
						
						mainPanel.getCenterPanel().getCardLayout().show(mainPanel.getCenterPanel(), "setting");
					} else {
						JOptionPane.showMessageDialog(null, "png/gif/jpg 확장자만 선택하세요.","경고",JOptionPane.WARNING_MESSAGE);
					}
				}else {
					return;
				}
			} 
		});
		
		clubIntroduceTextArea.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				if(clubIntroduceTextArea.getText().equals(" 모임 소개 글을 작성하세요!")) {
					clubIntroduceTextArea.setEditable(true);
					clubIntroduceTextArea.setText("");
				} 
			}
		});
		
		thisPanel.addMouseListener(new MouseAdapter() {	
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				if(clubIntroduceTextArea.getText().trim().length() == 0) {
					clubIntroduceTextArea.setEditable(false);
					clubIntroduceTextArea.setText(" 모임 소개 글을 작성하세요!");
					clubIntroduceTextArea.setFocusable(false);
				}
			}
		});
		
		clubIntroduceTextArea.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyReleased(e);
				
				if(clubIntroduceTextArea.getText().trim().length() == 0) {
					clubIntroduceTextArea.setEditable(false);
					clubIntroduceTextArea.setText(" 모임 소개 글을 작성하세요!");
				}
				
			}
		});
		
		createButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(clubNameTextField.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(null, "소모임 이름이 입력되지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
				} else if(clubIntroduceTextArea.getText().equals(" 모임 소개 글을 작성하세요!")) {
					JOptionPane.showMessageDialog(null, "소모임 소개 글이 입력되지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
				} else {
					ClubVO clubVO = new ClubVO();
					
					clubVO.setCategory(categoryList.getSelectedItem().toString());
					clubVO.setName(clubNameTextField.getText());
					clubVO.setClupMasterNumber(memberVO.getUserNumber());
					clubVO.setMeetingDay(new Date(new GregorianCalendar(1990,1,1).getTimeInMillis()));
					if(titlePhotoTextField.getText().trim().length() == 0) {
						clubVO.setTitleImagePath("images/default.png");
					} else {
						clubVO.setTitleImagePath(titlePhotoTextField.getText());
					}
					String areaStr = clubIntroduceTextArea.getText().replace("\n", "††");
					clubVO.setInformation(areaStr);
					clubController.createClub(clubVO);
					JOptionPane.showMessageDialog(null, "소모임이 생성되었습니다.", "안내", JOptionPane.PLAIN_MESSAGE);
					ChangPanelUtil.CHANGE_PANEL(mainFrame, mainPanel, new MainPanel(mainFrame, memberVO));
				}
			}
		});
	}
}
