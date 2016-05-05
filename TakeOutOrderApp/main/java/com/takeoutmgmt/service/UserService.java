package com.takeoutmgmt.service;

import com.takeoutmgmt.model.User;

public interface UserService {
	
	public void addUser(User user);
	public void deleteUser(int user_Id);
	public User getUser(int user_Id);

}
