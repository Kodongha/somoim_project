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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

import com.kh.somoim.signup.model.vo.SignupRequestVO;
import com.kh.somoim.util.event.ChangPanelUtil;
import com.kh.somoim.view.mainFrame.MainFrame;

public class UserAuthentication extends JPanel {
	private JPanel thisPanel;
	SignupRequestVO signupRequestVO = new SignupRequestVO();

	int random;
	String random2="";

	boolean flag;

	public UserAuthentication(MainFrame mainFrame) {

		for(int j=0;j<5;j++) {
			for (int i = 0; i < 5; i++) {
				random = (int) (Math.random() * 10);
			}
			random2 += String.valueOf(random);
		}

		this.thisPanel = this;

		// 레이아웃변경
		this.setLayout(null);
		// 컬러 화이트로 변경
		this.setBackground(Color.WHITE);
		
		

		// 이름 라벨 설정
		JLabel name = new JLabel("이름");
		// 이름라벨 사이즈 설정
		name.setLocation(60, 60);// 위치설정
		name.setSize(100, 100);// 크기 설정
		// 이름라벨 폰트 설정
		name.setFont(new Font("나눔고딕", Font.BOLD, 17)); // 폰트변경 및 굵게,사이즈조정
		// 이름입력 라벨 설정
		
		

		
		JTextField nametext = new JTextField(30);
		// 이름입력 라벨 사이즈 설정
		nametext.setLocation(170, 80);
		nametext.setSize(200, 50);

		// 생년월일 라벨 설정
		JLabel birth = new JLabel("생년월일");
		// 생년월일라벨 사이즈 설정
		birth.setLocation(60, 125);
		birth.setSize(100, 100);
		// 생년월일 폰트 설정
		birth.setFont(new Font("나눔고딕", Font.BOLD, 17));// 폰트변경 및 굴게 사이즈조정

		/*
		 * //생년월일의 년도리스트 Calendar yearcalendar = Calendar.getInstance(); Date value =
		 * yearcalendar.getTime(); //현재날짜저장 yearcalendar.add(yearcalendar.YEAR, -50);
		 * //현재값보다 -50년증가 Date start =yearcalendar.getTime();
		 * yearcalendar.add(yearcalendar.YEAR, 100);//현재시간보다 50년 증가 Date end =
		 * yearcalendar.getTime(); SpinnerDateModel dateModel = new
		 * SpinnerDateModel(value, start, end, yearcalendar.YEAR); JSpinner spinner3 =
		 * new JSpinner(dateModel); spinner3.setEditor(new JSpinner.DateEditor(spinner3,
		 * "yyyy")); //생년월일 년도 리스트 사이즈 조정 spinner3.setLocation(170,150);
		 * spinner3.setSize(80,50);
		 */

		SpinnerNumberModel numberModel1 = new SpinnerNumberModel(1990, 1930, 2019, 1); // 시작할 값, 최소값, 최대값, 증가값
		JSpinner spinner1 = new JSpinner(numberModel1);
		spinner1.setLocation(170, 150);
		spinner1.setSize(80, 50);
		this.add(spinner1);

		SpinnerNumberModel numberModel2 = new SpinnerNumberModel(1, 1, 12, 1); // 시작할 값, 최소값, 최대값, 증가값
		JSpinner spinner2 = new JSpinner(numberModel2);
		spinner2.setLocation(260, 150);
		spinner2.setSize(80, 50);
		this.add(spinner2);

		SpinnerNumberModel numberModel3 = new SpinnerNumberModel(1, 1, 31, 1); // 시작할 값, 최소값, 최대값, 증가값
		JSpinner spinner3 = new JSpinner(numberModel3);
		spinner3.setLocation(350, 150);
		spinner3.setSize(80, 50);
		this.add(spinner3);

		/*
		 * //생년월일의 월 리스트 Calendar monthcalendar = Calendar.getInstance(); Date value1 =
		 * monthcalendar.getTime(); //현재날짜저장 monthcalendar.add(monthcalendar.MONTH,1);
		 * Date start1 =monthcalendar.getTime();
		 * monthcalendar.add(monthcalendar.MONTH,10 ); Date end1 =
		 * monthcalendar.getTime(); SpinnerDateModel dateModel1 = new
		 * SpinnerDateModel(value1, start, end, yearcalendar.MONTH); JSpinner spinner4 =
		 * new JSpinner(dateModel1); spinner4.setEditor(new
		 * JSpinner.DateEditor(spinner4, "mm")); //생년월일 월 리스트 사이즈 조정
		 * spinner4.setLocation(260,150); spinner4.setSize(80,50);
		 */

		/*
		 * //생년월일의 일 리스트 Calendar daycalendar = Calendar.getInstance(); Date value2 =
		 * daycalendar.getTime(); //현재날짜저장 daycalendar.add(daycalendar.DAY_OF_MONTH,
		 * -1); Date start2 =daycalendar.getTime();
		 * daycalendar.add(yearcalendar.DAY_OF_MONTH, 100); Date end2 =
		 * monthcalendar.getTime(); SpinnerDateModel dateModel2 = new
		 * SpinnerDateModel(value2, start, end, daycalendar.DAY_OF_MONTH); JSpinner
		 * spinner5 = new JSpinner(dateModel2); spinner4.setEditor(new
		 * JSpinner.DateEditor(spinner4, "dd")); //생년월일 일 리스트 사이즈 조정
		 * spinner5.setLocation(350,150); spinner5.setSize(80,50);
		 */
		// 휴대폰번호 라벨 설정
		JLabel phonenumber = new JLabel("휴대폰 번호");
		phonenumber.setLocation(60, 195);
		phonenumber.setSize(100, 100);
		// 휴대폰번호 폰트 설정
		phonenumber.setFont(new Font("나눔고딕", Font.BOLD, 17));// 폰트변경 및 굴게 사이즈조정

		// 통신사 설정
		String[] items = { "SK", "KT", "LG", "별정통신사" };
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner tong = new JSpinner(listModel);
		// 통신사 사이즈 설정
		tong.setLocation(260, 220);
		tong.setSize(80, 50);

		// 국제전화 설정
		String[] item = { "+82", "+1", "+86", "+44" };

		SpinnerListModel listModel1 = new SpinnerListModel(item);
		JSpinner internationalnumber = new JSpinner(listModel1);
		// 국제전화 사이즈 설정
		internationalnumber.setLocation(170, 220);
		internationalnumber.setSize(80, 50);

		// 인증번호 텍스트 설정
		JTextField numbertext = new JTextField(11);
		numbertext.setLocation(170, 300);
		numbertext.setSize(230, 50);

		// 인증버튼 설정
		JButton authenticationbutton = new JButton("인증");
		// 인증버튼 사이즈 설정
		authenticationbutton.setLocation(410, 300);
		authenticationbutton.setSize(60, 50);
		// 인증버튼 컬러 변경
		authenticationbutton.setBackground(Color.ORANGE);
		// 인증버튼 외곽선 없애기
		authenticationbutton.setBorderPainted(false);

		// 인증번호확인 텍스트 설정
		JTextField resulttext = new JTextField(20);
		resulttext.setLocation(170, 352);
		resulttext.setSize(230, 50);
		// 인증번호학인 설정
		JButton resultbutton = new JButton("확인");
		// 인증번호확인버튼 사이즈 설정
		resultbutton.setLocation(410, 352);
		resultbutton.setSize(60, 50);
		// 확인버튼 컬러 변경
		resultbutton.setBackground(Color.ORANGE);
		// 확인버튼 외곽선 없애기
		resultbutton.setBorderPainted(false);

		// 다음 버튼 만들기
		JButton nextbutton = new JButton("다음");
		// 다음버튼 사이즈 조정
		nextbutton.setLocation(136, 600); // 위치지정
		nextbutton.setSize(230, 50); // 크기지정
		// 버튼 컬러 변경
		nextbutton.setBackground(Color.ORANGE);
		// 버튼 외곽선 없애기
		nextbutton.setBorderPainted(false);

		UserAuthenticationTopPanel userAuthenticationTopPanel = new UserAuthenticationTopPanel();
		userAuthenticationTopPanel.setBounds(0, 0, 500, 35);

		JLabel UserAuthenticationLabel = new JLabel(" < 실명 인증");
		UserAuthenticationLabel.setForeground(Color.WHITE); // 라벨 글씨색변경
		UserAuthenticationLabel.setFont(UserAuthenticationLabel // 라벨 글씨 크기 조절
				.getFont().deriveFont(15.0f));
		UserAuthenticationLabel.setLocation(10, 6);

		UserAuthenticationLabel.setSize(100, 20);
		this.add(UserAuthenticationLabel);
		this.add(userAuthenticationTopPanel);

		this.add(name);
		this.add(nametext);
		this.add(birth);

		/*
		 * this.add(spinner3); this.add(spinner4); this.add(spinner5);
		 */
		this.add(phonenumber);
		this.add(tong);
		this.add(numbertext);
		this.add(authenticationbutton);
		this.add(resulttext);
		this.add(resultbutton);
		this.add(nextbutton);
		this.add(internationalnumber);


	
		
		UserAuthenticationLabel.addMouseListener(new MouseAdapter() {
	            //
	         @Override
	         public void mouseClicked(MouseEvent e) {
	            ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel, new TermsOfServicePanel(mainFrame));
	            
	         }
	      });

		authenticationbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = String.valueOf(numbertext.getText());
				// String phone = str.substring(0, 3) + "-" + str.substring(3, 7) + "-" +
				// str.substring(7, 11); // 폰
				// signupRequestVO.setPhoneNumber(phone);
				if (str.length() == 11) {
					JOptionPane.showMessageDialog(null,
							"인증번호는 "+random2+" 입니다"	, "인증번호",
							JOptionPane.NO_OPTION);


				} else {
					JOptionPane.showMessageDialog(thisPanel, "핸드폰 번호 11자리 입력해주세요.", "경고", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		resultbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {


				if(resulttext.getText().equals(random2)) {


					JOptionPane.showMessageDialog(null, "인증되었습니다", "인증확인", JOptionPane.NO_OPTION);
					flag=true;

				}
				else {

					JOptionPane.showMessageDialog(null, "인증번호가 일지하지 않습니다. 다시 입력해주세요", "ERROR", JOptionPane.ERROR_MESSAGE);

				}


			}
		});





		nextbutton.addActionListener(new ActionListener() {
			// nametext
			// numbertext
			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println(nametext.getText());
				signupRequestVO.setName(nametext.getText()); // 이름

				String br = String.valueOf(spinner1.getValue()) // 년
						+ String.format("%02d", Integer.parseInt(spinner2.getValue().toString())) // 월
						+ String.format("%02d", Integer.parseInt(spinner3.getValue().toString())); // 일
				signupRequestVO.setBirth(br);

				String str = String.valueOf(numbertext.getText()); // 폰
				if (str.length() == 11) {
					String phone = str.substring(0, 3) + "-" + str.substring(3, 7) + "-" + str.substring(7, 11); // 폰
					signupRequestVO.setPhoneNumber(phone);
					//System.out.println(signupRequestVO.toString());

					if(flag==true) {

						ChangPanelUtil.CHANGE_PANEL(mainFrame, thisPanel,
								new SubscriptionInformationPanel(mainFrame, signupRequestVO));
					}

					else {
						//

						JOptionPane.showMessageDialog(null, "실명인증을 완료해주세요", "WARNING", JOptionPane.ERROR_MESSAGE);

					}
				} else {
					JOptionPane.showMessageDialog(thisPanel, "빈칸을 채워주세요", "빈칸을 채워주세요", JOptionPane.ERROR_MESSAGE);
				}

			}

		});
		
		

		authenticationbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = String.valueOf(numbertext.getText());
				// String phone = str.substring(0, 3) + "-" + str.substring(3, 7) + "-" +
				// str.substring(7, 11); // 폰
				// signupRequestVO.setPhoneNumber(phone);
				if (str.length() == 11) {
					JOptionPane.showMessageDialog(thisPanel,
							"인증번호를 발송했습니다.인증번호가 오지 않\n으면 입력하신 정보가 회원정보와 알치하는지\n 확인해 주세요", "핸드폰번호 인증",
							JOptionPane.PLAIN_MESSAGE);

					/*for (int i = 0; i < 5; i++) {
						int random = (int) (Math.random() * 10);

						System.out.print(random + " ");
					}
*/
				} else {
					//JOptionPane.showMessageDialog(thisPanel, "핸드폰 번호 11자리 입력해주세요.", "경고", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

	}
}