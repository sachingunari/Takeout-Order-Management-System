package com.takeoutmgmt.dao;
import java.util.List;
import com.takeoutmgmt.model.Item;


public interface ItemDAO {

	public void addItem(Item item);
	public void editItem(Item item);
	public void deleteItem(int item_Id);
	public Item getItem(int item_Id);
	public List<Item> getAllItems();
	
}