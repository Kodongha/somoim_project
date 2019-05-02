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
		
		
		/*������ ��������*/
		JLabel moimNotice = new JLabel("������ ����� ������!");
		moimNotice.setLocation(80, 10); // �� ��ġ����
		moimNotice.setSize(500, 100);
		moimNotice.setFont(new Font("�������",Font.BOLD, 33)); //��Ʈ���� �� ����,���������� 
		this.add(moimNotice);
		
		/* ī�װ� */
		String [] category = {"����/����", "��ȥ/����" ,"����/�����","��/����","�ݷ�����","����Ȱ��","�米/�θ�","�ƿ�����/����","�丮","�/������","����/�Ǳ�","��/�������"};
		JComboBox categoryList = new JComboBox<>(category);
		categoryList.setLocation(75, 100); // �� ��ġ����
		categoryList.setSize(330, 50);
		categoryList.setBackground(Color.WHITE);
		categoryList.setForeground(Color.GRAY);
		this.add(categoryList);
		
		/* �Ҹ��� �̸� */
		JLabel clubNameLabel = new JLabel("  ���� �̸��� �ۼ��ϼ���!");
		clubNameLabel.setBorder(new LineBorder(Color.GRAY,2));
		clubNameLabel.setLocation(75, 180); // �� ��ġ����
		clubNameLabel.setSize(330, 50);
		clubNameLabel.setHorizontalAlignment(clubNameLabel.LEFT);
		clubNameLabel.setFont(new Font("", Font.PLAIN, 15));
		clubNameLabel.setForeground(Color.GRAY);

		JTextField clubNameTextField = new JTextField(15); 
		clubNameTextField.setLocation(10, 10);
		clubNameTextField.setSize(310, 30);
		clubNameTextField.setOpaque(false);
		clubNameTextField.setBorder(null);
		clubNameLabel.add(clubNameTextField); //�ؽ�Ʈ �ʵ�

		/* Ÿ��Ʋ ���� */
		JLabel titlePhotoLabel = new JLabel("  �Ҹ��� Ÿ��Ʋ ������ �����ϼ���!");
		titlePhotoLabel.setBorder(new LineBorder(Color.GRAY,2));
		titlePhotoLabel.setLocation(75, 280); // �� ��ġ����
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
		titlePhotoLabel.add(titlePhotoTextField); //�ؽ�Ʈ �ʵ�
		titlePhotoLabel.add(insertPhotoLabel);

		/* �Ұ� �� */
		JLabel clubIntroduceLabel = new JLabel("  ���� �Ұ� ���� �ۼ��ϼ���!");
		clubIntroduceLabel.setBorder(new LineBorder(Color.GRAY,2));
		clubIntroduceLabel.setLocation(75, 380); // �� ��ġ����
		clubIntroduceLabel.setSize(330, 200);
		clubIntroduceLabel.setHorizontalAlignment(clubNameLabel.LEFT);
		clubIntroduceLabel.setFont(new Font("", Font.PLAIN, 15));
		clubIntroduceLabel.setForeground(Color.GRAY);

		JTextArea clubIntroduceTextArea = new JTextArea(" ���� �Ұ� ���� �ۼ��ϼ���!"); 
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
		clubIntroduceLabel.add(scrollPane); //�ؽ�Ʈ �ʵ�
		
		/* �Ҹ��� ����� ��ư */
		JButton createButton = new JButton("�Ҹ��� �����");
		createButton.setLocation(75, 590); // �� ��ġ����
		createButton.setSize(330, 50);
		createButton.setBackground(Color.orange);
		
		JFrame window = new JFrame();
		JFileChooser fileChooser = new JFileChooser();
		//�⺻ Path�� ��� ���� (����ȭ��)
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
					clubNameLabel.setText("  ���� �̸��� �ۼ��ϼ���!");
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
					//������ ������ ��� ��ȯ 
					File selectedFile = fileChooser.getSelectedFile();
					String selectedFilePath = selectedFile.getPath();
					String[] extension = selectedFilePath.split("[.]");
					//������ ������ ��� 
					if(extension[1].toLowerCase().equals("png") 
							|| extension[1].toLowerCase().equals("gif")
							|| extension[1].toLowerCase().equals("jpg")) {
						titlePhotoLabel.setText("");
						titlePhotoTextField.setText(selectedFilePath);
						
						mainPanel.getCenterPanel().getCardLayout().show(mainPanel.getCenterPanel(), "setting");
					} else {
						JOptionPane.showMessageDialog(null, "png/gif/jpg Ȯ���ڸ� �����ϼ���.","���",JOptionPane.WARNING_MESSAGE);
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
				
				if(clubIntroduceTextArea.getText().equals(" ���� �Ұ� ���� �ۼ��ϼ���!")) {
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
					clubIntroduceTextArea.setText(" ���� �Ұ� ���� �ۼ��ϼ���!");
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
					clubIntroduceTextArea.setText(" ���� �Ұ� ���� �ۼ��ϼ���!");
				}
				
			}
		});
		
		createButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(clubNameTextField.getText().trim().length() == 0) {
					JOptionPane.showMessageDialog(null, "�Ҹ��� �̸��� �Էµ��� �ʾҽ��ϴ�.","���",JOptionPane.WARNING_MESSAGE);
				} else if(clubIntroduceTextArea.getText().equals(" ���� �Ұ� ���� �ۼ��ϼ���!")) {
					JOptionPane.showMessageDialog(null, "�Ҹ��� �Ұ� ���� �Էµ��� �ʾҽ��ϴ�.","���",JOptionPane.WARNING_MESSAGE);
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
					String areaStr = clubIntroduceTextArea.getText().replace("\n", "�Ӣ�");
					clubVO.setInformation(areaStr);
					clubController.createClub(clubVO);
					JOptionPane.showMessageDialog(null, "�Ҹ����� �����Ǿ����ϴ�.", "�ȳ�", JOptionPane.PLAIN_MESSAGE);
					ChangPanelUtil.CHANGE_PANEL(mainFrame, mainPanel, new MainPanel(mainFrame, memberVO));
				}
			}
		});
	}
}
