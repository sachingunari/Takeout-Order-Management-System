package com.takeoutmgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.takeoutmgmt.dao.OrderDAO;
import com.takeoutmgmt.dao.UserDAO;
import com.takeoutmgmt.model.Order;
import com.takeoutmgmt.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO orderDao;


	@Transactional
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.addOrder(order);

	}

	@Transactional
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.updateOrder(order);

	}

	@Transactional
	public void deleteOrder(int Order_Id) {
		// TODO Auto-generated method stub
		orderDao.deleteOrder(Order_Id);

	}

	@Transactional
	public Order getOrder(int Order_Id) {
		// TODO Auto-generated method stub
		return orderDao.getOrder(Order_Id);
	}

}
