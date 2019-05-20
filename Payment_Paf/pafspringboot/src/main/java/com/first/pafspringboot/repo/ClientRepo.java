package com.first.pafspringboot.repo;


import com.first.pafspringboot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepo extends JpaRepository<Client, Long>{
	
	 
}