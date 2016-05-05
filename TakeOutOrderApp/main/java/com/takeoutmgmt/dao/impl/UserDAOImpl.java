package com.takeoutmgmt.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.takeoutmgmt.dao.UserDAO;
import com.takeoutmgmt.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(user);

	}

	@Override
	public void deleteUser(int user_Id) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getUser(user_Id));

	}

	@Override
	public User getUser(int user_Id) {
		// TODO Auto-generated method stub
		return (User) session.getCurrentSession().get(User.class,user_Id);

	}

}
