package com.takeoutmgmt.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.takeoutmgmt.dao.OrderDAO;
import com.takeoutmgmt.model.Item;
import com.takeoutmgmt.model.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {

	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(order);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub

		session.getCurrentSession().update(order);
	}

	@Override
	public void deleteOrder(int Order_Id) {
		// TODO Auto-generated method stub

		session.getCurrentSession().delete(getOrder(Order_Id));
	}

	@Override
	public Order getOrder(int Order_Id) {
		// TODO Auto-generated method stub
		return (Order)session.getCurrentSession().get(Order.class, Order_Id);
		
	}

}
