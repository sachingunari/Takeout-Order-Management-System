package com.takeoutmgmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.takeoutmgmt.dao.ItemDAO;
import com.takeoutmgmt.model.Item;
import com.takeoutmgmt.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDAO itemDao;
	
	@Transactional
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		itemDao.addItem(item);

	}

	@Transactional
	public void editItem(Item item) {
		// TODO Auto-generated method stub
		itemDao.editItem(item);

	}

	@Transactional
	public void deleteItem(int item_Id) {
		// TODO Auto-generated method stub
		itemDao.deleteItem(item_Id);

	}

	@Transactional
	public Item getItem(int item_Id) {
		// TODO Auto-generated method stub
		return itemDao.getItem(item_Id);
	}

	@Transactional
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemDao.getAllItems();
	}

}
