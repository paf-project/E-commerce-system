package com.first.pafspringboot.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Client") 
@EntityListeners(AuditingEntityListener.class)
public class Client {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String amount;
	
	@NotBlank
	private String method1;
	
	public String getMethod1() {
		return method1;
	}

	public void setMethod1(String method1) {
		this.method1 = method1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMethod() {
		return method1;
	}

	public void setMethod(String method) {
		this.method1 = method;
	}

	@NotBlank
	private String method;
	
}
