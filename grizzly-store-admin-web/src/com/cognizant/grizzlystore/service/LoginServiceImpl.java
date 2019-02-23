package com.cognizant.grizzlystore.service;

import com.cognizant.grizzlystore.dao.LoginDAO;
import com.cognizant.grizzlystore.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {

	private static LoginServiceImpl loginServiceImpl;
	private static LoginDAO  dao = LoginDAOImpl.getInstance();
	public static LoginServiceImpl getInstance(){
		if(loginServiceImpl==null){
			loginServiceImpl = new LoginServiceImpl();
			return loginServiceImpl;
		}
		return loginServiceImpl;
	}
	private LoginServiceImpl() {
	}
	
	@Override
	public String getUserStatus(String id) {
		// TODO Auto-generated method stub
		return dao.getUserStatus(id);
	}

	@Override
	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return dao.getUserType(id);
	}

	@Override
	public boolean authenticate(String id, String password) {
		// TODO Auto-generated method stub
		return dao.authenticate(id, password);
	}

}
