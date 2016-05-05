package com.takeoutmgmt.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.takeoutmgmt.dao.ItemDAO;
import com.takeoutmgmt.model.Item;

public class ItemDAOImpl implements ItemDAO {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void addItem(Item item) {
		session.getCurrentSession().save(item);
	}

	@Override
	public void editItem(Item item) {
		session.getCurrentSession().update(item);
	}

	@Override
	public void deleteItem(int item_Id) {
		session.getCurrentSession().delete(getItem(item_Id));
	}

	@Override
	public Item getItem(int item_Id) {
		return (Item)session.getCurrentSession().get(Item.class, item_Id);
	}

	@Override
	public List<Item> getAllItems() {
		return session.getCurrentSession().createQuery("from Item").list();
	}
	
	
}
