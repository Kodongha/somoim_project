package com.kh.somoim.view.home;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.kh.somoim.login.model.vo.MemberVO;
import com.kh.somoim.view.main.MainPanel;
import com.kh.somoim.view.mainFrame.MainFrame;

public class CreateClubPanel extends JPanel{

	public CreateClubPanel(MainFrame mainFrame, MainPanel mainpanel, MemberVO memberVO) {
		// TODO Auto-generated constructor stub
		this.setLayout(null);
		this.setBackground(Color.white);
		System.out.println("mainPanel in");

		JLabel clubNameLabel = new JLabel("  ���� �̸��� �ۼ��ϼ���!");
		clubNameLabel.setBorder(new LineBorder(Color.GRAY,2));
		clubNameLabel.setLocation(75, 280); // �� ��ġ����
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


		JLabel titlePhotoLabel = new JLabel("  �Ҹ��� Ÿ��Ʋ ������ �����ϼ���!");
		titlePhotoLabel.setBorder(new LineBorder(Color.GRAY,2));
		titlePhotoLabel.setLocation(75, 380); // �� ��ġ����
		titlePhotoLabel.setSize(330, 50);
		titlePhotoLabel.setHorizontalAlignment(titlePhotoLabel.LEFT);
		titlePhotoLabel.setFont(new Font("", Font.PLAIN, 15));
		titlePhotoLabel.setForeground(Color.GRAY);

		Image insertPhotoImage = new ImageIcon("images/insertPhoto.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		JLabel insertPhotoLabel = new JLabel(new ImageIcon(insertPhotoImage));
		insertPhotoLabel.setSize(30, 30);
		insertPhotoLabel.setLocation(280,10);
		insertPhotoLabel.setBackground(Color.black);

		JTextField titlePhotoTextField = new JTextField(15); 
		titlePhotoTextField.setLocation(10, 10);
		titlePhotoTextField.setSize(250, 30);
		titlePhotoTextField.setOpaque(false);
		titlePhotoTextField.setEditable(false);
		titlePhotoTextField.setBorder(null);
		titlePhotoLabel.add(titlePhotoTextField); //�ؽ�Ʈ �ʵ�
		titlePhotoLabel.add(insertPhotoLabel);

		JLabel clubIntroduceLabel = new JLabel("  ���� �̸��� �ۼ��ϼ���!");
		clubIntroduceLabel.setBorder(new LineBorder(Color.GRAY,2));
		clubIntroduceLabel.setLocation(75, 280); // �� ��ġ����
		clubIntroduceLabel.setSize(330, 50);
		clubIntroduceLabel.setHorizontalAlignment(clubNameLabel.LEFT);
		clubIntroduceLabel.setFont(new Font("", Font.PLAIN, 15));
		clubIntroduceLabel.setForeground(Color.GRAY);

		JTextArea clubIntroduceTextArea = new JTextArea(); 
		clubIntroduceTextArea.setLocation(10, 10);
		clubIntroduceTextArea.setSize(310, 30);
		clubIntroduceTextArea.setOpaque(false);
		clubIntroduceTextArea.setBorder(null);
		
		JScrollPane scrollPane = new JScrollPane(clubIntroduceTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		clubIntroduceTextArea.add(clubNameTextField); //�ؽ�Ʈ �ʵ�
		
		
		
		JFrame window = new JFrame();
		JFileChooser fileChooser = new JFileChooser();
		//�⺻ Path�� ��� ���� (����ȭ��)
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
		
		this.add(titlePhotoLabel);
		this.add(clubNameLabel);
		
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
					} else {
						JOptionPane.showMessageDialog(null, "png/gif/jpg Ȯ���ڸ� �����ϼ���.","���",JOptionPane.WARNING_MESSAGE);
					}

				}else {
					return;
				}

			} 

		});
	}


}
