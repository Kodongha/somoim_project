package com.kh.somoim.signup.model.dao;

import com.kh.somoim.signup.model.vo.SignupRequestVO;
import com.kh.somoim.util.network.ClientConnector;

public class SignupDAO {

	public void setSignup(SignupRequestVO signupRequestVO) {
		// TODO Auto-generated method stub
		System.out.println("SignupDAO.setSignup in");
		
		new ClientConnector().sendServer("SignupDAO.setSignup", signupRequestVO);
		
	}
 
}
