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
	private String method;
	
}
