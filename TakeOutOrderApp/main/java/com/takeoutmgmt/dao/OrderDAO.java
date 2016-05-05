package com.takeoutmgmt.dao;

import com.takeoutmgmt.model.Order;

public interface OrderDAO {

	public void addOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int Order_Id);
	public Order getOrder(int Order_Id);
	
}
