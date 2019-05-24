package com.food.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.Repository.ItemRepository;
import com.food.model.item;

@Service
public class ItemDAO {
	
	@Autowired
	ItemRepository itemRepo;

	/*-----add Items----*/
	public item addItems(item item) {
		return itemRepo.save(item);
	}
	
	/*------List Items---------*/
	public List<item> findAll(){
		return itemRepo.findAll();
	}
	
	/*-------Find item by id------------*/
	public item findOne(int id) {
		return itemRepo.findOne(id);
	}
	
	/*------------remove item-----------*/
	public void DeleteItem(item item) {
		itemRepo.delete(item);
	}
	
}
