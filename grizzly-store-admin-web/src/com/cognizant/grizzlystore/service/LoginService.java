package com.cognizant.grizzlystore.service;

public interface LoginService {
	public String getUserStatus(String id);
	public String getUserType(String id);
	public boolean authenticate(String id,String password);
}
