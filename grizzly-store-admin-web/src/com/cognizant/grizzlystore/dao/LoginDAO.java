package com.cognizant.grizzlystore.dao;

public interface LoginDAO {
	public String getUserStatus(String id);
	public String getUserType(String id);
	public boolean authenticate(String id,String password);
}
