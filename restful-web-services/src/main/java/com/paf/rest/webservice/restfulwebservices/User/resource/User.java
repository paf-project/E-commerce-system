package com.paf.rest.webservice.restfulwebservices.User.resource;


import java.util.Date;

import javax.validation.constraints.Size;

public class User {
	
	private Integer id;
	
	@Size(min=2, message="Name should have atleat 2 charchters")
	private String name;
	
	
	private int amount;
	
	
	private Date date;

	protected User() {
		
	}
	
 
	public User(Integer id, String name, int amount, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", amount=" + amount + ", date=" + date + "]";
	}
	
	

}
