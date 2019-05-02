package com.kh.somoim.signup.controller;

import com.kh.somoim.signup.model.dao.SignupDAO;
import com.kh.somoim.signup.model.vo.SignupRequestVO;

public class SignupController {

	SignupDAO signupDAO = new SignupDAO();
	
	public void setSignup(SignupRequestVO signupRequestVO) {
		// TODO Auto-generated method stub
		System.out.println("SignupController.setSignup in");
		
		signupDAO.setSignup(signupRequestVO);
		
	}

	public boolean checkId(String email) {
		// TODO Auto-generated method stub
		System.out.println("SignupController.checkId in");
		boolean result = signupDAO.checkId(email);
		return result;
	}
	
}
