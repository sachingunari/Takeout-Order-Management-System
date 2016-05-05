package com.takeoutmgmt.dao;

import com.takeoutmgmt.model.User;

public interface UserDAO {

	public void addUser(User user);
	public void deleteUser(int user_Id);
	public User getUser(int user_Id);
	
}
