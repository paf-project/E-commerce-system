package com.first.pafspringboot.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.pafspringboot.dao.Clientdao;
import com.first.pafspringboot.model.Client;

@RestController
@RequestMapping("/company")

public class ClientController {
	
	@Autowired
	Clientdao clientdoa;
	
  @PostMapping
  public Client CreateClient(@Valid @RequestBody Client payment) {
	  
	  return clientdoa.save(payment);
	  
  }
  
}
