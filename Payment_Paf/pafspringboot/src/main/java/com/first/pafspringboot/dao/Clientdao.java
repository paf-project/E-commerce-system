package com.first.pafspringboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.pafspringboot.model.Client;
import com.first.pafspringboot.repo.ClientRepo;


@Service
public class Clientdao {
	
	@Autowired
	ClientRepo clientRepo;

	public Client save(Client payment) {
	return clientRepo.save(payment);
	}
}
