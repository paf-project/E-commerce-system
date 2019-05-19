package com.food.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.DAO.ItemDAO;
import com.food.model.item;

@RestController
@RequestMapping("/company")

public class ItemController {
	
	@Autowired
	ItemDAO itemdao;
	
	/*------add a item-----*/
	
	@PostMapping("/Items")
	public item addItem(@Valid @RequestBody item item) {
		return itemdao.addItems(item);
	}
	
	/*--------List items------*/
	
	@GetMapping("/Items")
	public List<item> getAllItems() {
		return itemdao.findAll();
	}
	
	/*-----------get item by id-------------*/
	
	@GetMapping("/Items/{id}")
	public ResponseEntity<item> getItemById(@PathVariable (value="id") int itemId){
		item item=itemdao.findOne(itemId);
		
		if(item==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(item);
	}
	
	/*---------update item----------------*/
	
	@PutMapping("/Items/{id}")
	public ResponseEntity<item> updateItem(@PathVariable (value="id")int itemId,@Valid @RequestBody item ItemDetails){
		
			item item = itemdao.findOne(itemId);
		
			if(item==null){
				return ResponseEntity.notFound().build();
			}
		
			item.setItemName(ItemDetails.getItemName());
			item.setUnit_price(ItemDetails.getUnit_price());
			item.setStock(ItemDetails.getStock());
			item.setDesc(ItemDetails.getDesc());
		
			item updateItem = itemdao.addItems(item);
			return ResponseEntity.ok().body(updateItem);
	
	}
	/*------------------------Delete item---------*/
	@DeleteMapping("/Items/{id}")
	public ResponseEntity<item> deleteItem(@PathVariable (value="id")int itemId){
		item item = itemdao.findOne(itemId);
		
		if(item==null) {
			return ResponseEntity.notFound().build();
		}
		itemdao.DeleteItem(item);
		
		return ResponseEntity.ok().build();
	}


}
