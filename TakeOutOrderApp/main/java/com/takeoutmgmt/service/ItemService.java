package com.takeoutmgmt.service;

import java.util.List;

import com.takeoutmgmt.model.Item;

public interface ItemService {

	public void addItem(Item item);
	public void editItem(Item item);
	public void deleteItem(int item_Id);
	public Item getItem(int item_Id);
	public List<Item> getAllItems();
	
}
