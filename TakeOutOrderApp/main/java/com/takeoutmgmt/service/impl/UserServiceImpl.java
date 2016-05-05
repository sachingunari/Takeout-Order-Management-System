package com.takeoutmgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.takeoutmgmt.dao.UserDAO;
import com.takeoutmgmt.model.User;
import com.takeoutmgmt.service.UserService;

	
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;

	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);

	}

	@Transactional
	public void deleteUser(int user_Id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user_Id);

	}

	@Transactional
	public User getUser(int user_Id) {
		// TODO Auto-generated method stub
		return userDao.getUser(user_Id);
	}

}
