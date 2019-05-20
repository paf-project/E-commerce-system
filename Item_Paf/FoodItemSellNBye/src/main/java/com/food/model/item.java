package com.food.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="items")
@EntityListeners(AuditingEntityListener.class)

public class item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String ItemName;
	private float unit_price;
	private int stock;
	private String desc;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public float getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(float unit_price) {
		this.unit_price = unit_price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
